import java.util.Scanner;
class VolumeBola {
	public static void main (String[]args) {
		A supobj = new A();
		B subobj = new B();
		Scanner in = new Scanner(System.in);
		System.out.println("Super Class:");
		supobj.tampilr();
	
		System.out.println();
			
		System.out.println("Sub Class: ");
		System.out.print("Jari Jari Bola = ");
		subobj.r = in.nextDouble();
		subobj.phi = 3.14;
		subobj.x = 4.0 /3.0;
		subobj.volume();
	}
}