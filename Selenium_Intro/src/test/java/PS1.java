import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PS1 extends PS {

	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("I will execute first");
	}
	
	@Test
	public void login() {
		PS2 ps2=new PS2(3);
		int num=3;
		doThis(); //parent class
		/*below code is when we don't define parameterized constructor and pass value in parameter
		System.out.println(ps2.increment(3)); // child class,  After passing parameter it will return value 4 (3+1=4)
		System.out.println(ps2.decrement(3)); */
		
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());

		PS3 ps3=new PS3(num);
		System.out.println(ps2.multiplyTwo());
		System.out.println(ps2.multiplyThree());
		}
}
