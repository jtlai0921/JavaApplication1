package ch1_javaBasic;

public class ex18 {

	public static void main(String[] args) {
		 int a = 0, z = 10;
	        while (a < z) {
	            a++;
	            --z;
	        }
	        System.out.print(a + " : " + z);
		

	}

}
/*
Given:

public class TestLoop1 {
 
    public static void main(String[] args) {
        int a = 0, z = 10;
        while (a < z) {
            a++;
            --z;
        }
        System.out.print(a + " : " + z);
    }
}

What is the result?

A.

5 : 5

B.

6 : 4

C.

6 : 5

D.

5 : 4


*/