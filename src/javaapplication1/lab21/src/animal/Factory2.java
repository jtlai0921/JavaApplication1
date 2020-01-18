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
public class Factory2 implements Factory {
    public Animal createAnimal(){
        return new Pig();
}
}