package observerexample_2;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{
    
    private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX= new Object();
	
	public MyTopic(){  this.observers=new ArrayList<>();  }

	@Override
	public void register(Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
		if(!observers.contains(obj)) observers.add(obj);
		}
	}

	@Override
	public void unregister(Observer obj) {

		synchronized (MUTEX) {  observers.remove(obj); }
	}

	@Override
	public void notifyObservers() {

		List<Observer> observersLocal = null;
		//يتم استخدام المزامنة للتأكد من عدم إخطار أي مراقب مسجل بعد استلام الرسالة
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.observers);
			this.changed=false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}
	}

	@Override
	public Object getUpdate(Observer obj) {  return this.message; }
	
	//طريقة إرسال رسالة إلى الموضوع
	public void postMessage(String msg){
		System.out.println("تم إرسال الرسالة إلى الموضوع:"+msg);
		this.message=msg;
		this.changed=true;
		notifyObservers();
	}
}
