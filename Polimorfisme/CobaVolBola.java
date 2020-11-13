import java.util.Scanner;
class CobaVolBola {
	public static void main (String[]args) {
	    phi satu = new phi();
		R dua = new R();
		X tiga = new X();
		Volume empat = new Volume();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Jari Jari Bola = ");
		empat.r = in.nextDouble();
		empat.phi = 3.14;
		empat.x = 4.0 /3.0;
		empat.volume();
	}
}