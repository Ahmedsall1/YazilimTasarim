package observerexample_2;

public class MyTopicSubscriber implements Observer{
    
    private String name;
	private Subject topic;
	
	public MyTopicSubscriber(String nm){
		this.name=nm;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: لا توجد رسالة جديدة");
		}else
		System.out.println(name+":: استهلاك الرسالة ::"+msg);
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic=sub;
		}
}