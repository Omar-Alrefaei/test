
public class Teachers extends Person {
    private String subject ;
    private double salary;
    
    Teachers(){
        System.out.println("New Person is a Teacher");
        
    }
    Teachers(int id , String Fname , int age , String Lname , String subject, double salary){
        this.id = id;
        this.Fname = Fname;
        this.age =age ;
        this.Lname = Lname;
        this.subject =subject;
        this.salary = salary;
    }
    
    public void set_data(){
        System.out.println("Enter the id :");
         this.id = input.nextInt();
         System.out.println("Enter the First name :");
        this.Fname = input.next();
        System.out.println("Enter the Last name :");
        this.Lname = input.next();
        System.out.println("Enter the age :");
        this.age = input.nextInt();
        System.out.println("Enter the subject :");
        this.subject = input.next();
        System.out.println("Enter the salary :");
        this.salary = input.nextDouble();
    }
    
    public void get_data(){
        System.out.println("id : "+id + "\nname : "+Fname +" "+Lname +"\nage : "+age +"\nsubject : "+subject+"\nsalary : "+salary );
    }
}
