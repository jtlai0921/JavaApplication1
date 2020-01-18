package ch1_javaBasic;

public class ex3 {
	
	 static String[][] arr = new String[3][];
	 
	    private static void doPrint() {
	    	for (int i = 0; i < arr.length; i++) {
	    	    int j = arr[i].length - 1;
	    	    System.out.print(arr[i][j]);
	    	}
	    }
	 
	    public static void main(String[] args) {
	        String[] class1 = {"A", "B", "C"};
	        String[] class2 = {"L", "M", "N", "O"};
	        String[] class3 = {"I", "J"};
	        arr[0] = class1;
	        arr[1] = class2;
	        arr[2] = class3;
	        ex3.doPrint();
	    }
}

/*
public class Test {
 
    static String[][] arr = new String[3][];
 
    private static void doPrint() {
        //insert code here
    }
 
    public static void main(String[] args) {
        String[] class1 = {"A", "B", "C"};
        String[] class2 = {"L", "M", "N", "O"};
        String[] class3 = {"I", "J"};
        arr[0] = class1;
        arr[1] = class2;
        arr[2] = class3;
        Test.doPrint();
    }
}
Which code fragment, when inserted at line //insert code here, enables the code to print COJ?
A.

int i = 0;
for (String[] sub : arr) {
    int j = sub.length - 1;
    for (String str : sub) {
        System.out.println(str[j]);
        i++;
    }
}
B.

for (int i = 0; i < arr.length; i++) {
    int j = arr[i].length - 1;
    System.out.print(arr[i][j]);
}
C.

int i = 0;
for (String[] sub : arr[][]) {
    int j = sub.length;
    System.out.print(arr[i][j]);
    i++;
}
D.

for (int i = 0; i < arr.length - 1; i++) {
    int j = arr[i].length - 1;
    System.out.print(arr[i][j]);
    i++;
}



*/