/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author n135
 */
public class AnimalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factory1 f=new Factory1();
        Animal a=f.createAnimal();
        a.eat();
        Factory2 g=new Factory2();
        Animal b=g.createAnimal();
        b.eat();
    }
    
}
