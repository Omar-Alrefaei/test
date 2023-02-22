
public class Students extends Person {
    
    private String college;
    
    Students(){
        System.out.println("New Person is a Student");
    }
    
    Students(int id , String Fname , int age ,String Lname,  String college ){
        this.id = id;
        this.Fname = Fname;
        this.age = age;
        this.Lname = Lname;
        this.college =college;
    }
    
    public void set_data(){
        System.out.println("Enter the id :");
         this.id = input.nextInt();
         System.out.println("Enter the First name :");
        this.Fname = input.next();
        System.out.println("Enter the Last Name :");
        this.Lname = input.next();
        System.out.println("Enter the age :");
        this.age = input.nextInt();
        System.out.println("Enter the college :");
        this.college = input.next();
    }
    
    public void get_data(){
        System.out.println("id : "+id + "\nname : "+Fname +" "+Lname +"\nage : "+age+"\ncollege : "+college );
        
    }
    
}
