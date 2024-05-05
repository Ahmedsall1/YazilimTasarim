package observerexample_2;

public interface Subject {

	//طرق تسجيل وإلغاء تسجيل المراقبين
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	//طريقة إخطار المراقبين بالتغيير
	public void notifyObservers();
	
	//طريقة الحصول على التحديثات من الموضوع
	public Object getUpdate(Observer obj);
	
}