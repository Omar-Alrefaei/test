import java.util.Scanner;
public class School {

    public static void main(String[] args) {
      
        System.out.println("Choose the Number for Person");
        System.out.println("1.Student 2.Teacher");
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        
        switch (num) {
            case 1:
                Students s1 = new Students();
                s1.set_data();
                s1.get_data();
                break;
       
            case 2:
                Teachers t1 = new Teachers();
                t1.set_data();
                t1.get_data();
                break;
            default:
                System.out.println("Wrong Number");
                break;
        }
     
    }
}

//Person p1 = new Person();
        //p1.set_data();
        //p1.get_data();