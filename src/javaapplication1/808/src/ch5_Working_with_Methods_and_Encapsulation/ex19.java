package ch5_Working_with_Methods_and_Encapsulation;

public class ex19 {

	public static void main(String[] args) {
		 Alphaq ref1 = new Alphaq(50);
	        Alphaq ref2 = new Alphaq(125);
	        Alphaq ref3 = new Alphaq(100);
	        ref1.doPrint();
	        ref2.doPrint();
	        ref3.doPrint();

	}

}
class Alphaq {
	 
    int ns;
    static int s;
 
    Alphaq(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }
 
    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }
}
/*
Given:

class Alpha {
 
    int ns;
    static int s;
 
    Alpha(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }
 
    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }
}
 
public class TestA {
 
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}
What is the result?

A.

ns = 50 s = 125
ns = 125 s = 125
ns = 100 s = 125

B.

ns = 50 s = 125
ns = 125 s = 125
ns = 0 s = 125

C.

ns = 50 s = 50
ns = 125 s = 125
ns = 100 s = 100

D.

ns = 50 s = 50
ns = 125 s = 125
ns = 0 s = 125



*/