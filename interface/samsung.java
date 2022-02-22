package java_lerning;

public class samsung implements Mobile{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("callOption");
		
		
	}
	@Override
	public void camera() {
		
		// TODO Auto-gesysnerated method stub
		System.out.println("camera Option");
	}
	
	public void tochDisplay() {
		System.out.println("have a toch sensor");
	}
	public static void main(String[] args) {
		samsung sam = new samsung();
		sam.call();
		sam.camera();
		sam.tochDisplay();
		
		
	}
	
	
}
