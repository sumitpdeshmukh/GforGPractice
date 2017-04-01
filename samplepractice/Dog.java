/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplepractice;

/**
 *
 * @author sumitdeshmukh
 */
public class Dog extends Animal
{
   private String name;

    public Dog(String name) {
        this.name = name;
    }
   
   public void sleeps( ) {
   	System.out.println("Hello from Dog");
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    
   
}
