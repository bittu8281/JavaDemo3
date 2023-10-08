package ProgrammingCode;

public class Factorial {

	public static void main(String[] args) {
		int x = 5;
        int z = 1;
        if(x == 0) {
        	z = 0;
        	System.out.println(z);
        }
        else {
        for(int i=1;i<=x;i++){
            z *= i;
        }
        System.out.println(z);
        }
	}

}
