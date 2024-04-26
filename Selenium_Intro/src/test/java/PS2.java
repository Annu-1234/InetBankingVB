
public class PS2 extends PS3 {
	public PS2(int num) {
		super(num);
		this.num=num;
		// TODO Auto-generated constructor stub
	}

	int num;
	//public int increment(int num) when we define parameter while creating method
	
	

		public int increment() {

		System.out.println("THis is increment method from class B");

		num = num + 1;// we need to pass parameter while creating method so it will work return num

		return num;

		}
	
	public int decrement() {

		System.out.println("THis is increment method from class B");

		num = num - 1;// we need to pass parameter while creating method so it will work return num

		return num;

		}

}
