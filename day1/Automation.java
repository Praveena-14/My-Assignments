package week4.day1;

public class Automation extends MultipleLanguage implements Language, TestTool{
	public void selenium() {
		System.out.println("  Selenium ");
		
	}

	public void java() {
		System.out.println("  Java ");
		
	}
	
	public void ruby() {
		System.out.println("  ruby  ");
		
	}
	public static void main(String[] args)
	{
		Automation obj=new Automation();
		
		obj.python();
		obj.ruby();
		obj.java();
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		
	}
	
	

}
