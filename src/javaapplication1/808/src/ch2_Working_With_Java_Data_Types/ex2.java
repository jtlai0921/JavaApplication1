package ch2_Working_With_Java_Data_Types;

public class ex2 {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		for (int i=0;i<5;i=i+2) {
		    System.out.print(a[i]);
		}

	}

}
/*
Given the code fragment:

int a[] = {1, 2, 3, 4, 5};
for (XXX) {
    System.out.print(a[e]);
}
Which option can replace xxx to enable the code to print 135?

A.

int e = 0; e <= 4; e++
B.

int e = 0; e < 5; e += 2
C.

int e = 1; e <= 5; e += 1
D.

int e = 1; e < 5; e +=2



*/