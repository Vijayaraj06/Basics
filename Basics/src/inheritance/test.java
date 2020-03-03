package inheritance;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// overriding in multilevel inheritance
		cc c=new cc();
		c.m();
	}

}
class pc{
	void m(){
		System.out.println("pc");
	}
}
class ic extends pc{
	void m(){
		System.out.println("ic");
	}
}
class cc extends ic{
	void m(){
		System.out.println("cc");
	}
}