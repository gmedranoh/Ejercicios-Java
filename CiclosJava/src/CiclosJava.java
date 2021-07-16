import java.util.Scanner;

/*
public class CiclosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println(i+1);
		}
	}

}

*/
public class CiclosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mult = new Scanner (System.in);
		System.out.println("Introduce el numero de la tabla de multiplicar");
		int n = mult.nextInt();
		
		for(int i=0; i<10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
			System.out.println(i+1);
		}
		
		mult.close();
	}

}




