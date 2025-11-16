public class singleinheritance {
  public static void main(string[] args){
        puppy p= new puppy();
        p.eat();
        p.bark();
        p.weep();
           
    }
    
}
class Animal{
    void eat(){   
        System.out.println("Animal can eat");
    }
}
class puppy extends Animal{
    void puppy()
    {
        System.out.println("puppy can Bark");
    }
}







