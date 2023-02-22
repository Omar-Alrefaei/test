import java.util.*;
public class Person {
    int id , age;
    String Fname , Lname;
    Scanner input = new Scanner (System.in);
    
    
    Person(){
        System.out.println("New Person Created");
    }
    
    
    Person(int id, int age, String Fname ,String Lname){
        this.id = id;
        this.age = age;
        this.Fname = Fname;
        this.Lname = Lname;
     
    }
    
    
    public void set_data(){
        this.id = input.nextInt();
        this.Fname = input.next();
        this.age = input.nextInt();
        this.Lname = input.next();
       
}
    
    
    public void get_data(){
        System.out.println("id : "+id + "\nname : "+Fname + "\nLname : "+Lname+"\nage : "+age );
    }
}
