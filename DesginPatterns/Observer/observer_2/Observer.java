package observerexample_2;

public interface Observer {

    //طريقة لتحديث المراقب، المستخدمة حسب الموضوع
	public void update();
	
	//نعلق مع موضوع لمراقبة
	public void setSubject(Subject sub);
}
