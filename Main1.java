import java.util.Scanner;
class Main {
   
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner input=new Scanner(System.in);
        //login  validation
        String user="Aya";
        String pass="12345";
        System.out.println("Enter your name:");
        String username = input.nextLine();
     
        System.out.println("Enter password");
        String password = input.nextLine();
       
        //validation login
        if(!username.equals(user) || !password.equals(pass)){
            System.out.println("Invalid username or password");
            return;
            
        }else{
            System.out.println("login successful ");
        }
        
        //user information
        System.out.println("Enter a constant code");
        String constantcode=input.nextLine();
        System.out.println("Enter your full name:");
        String fullname=input.nextLine();
        System.out.println("Enter your age:");
        int age=input.nextInt();
        
        
        int grade;
        while(true){
            System.out.println("Enter your grade:");
            grade=input.nextInt();
            if(grade>=0 && grade<=100){
                break;
            }else{
                System.out.println("Invalid grade");
            }
        }
        
        String lettergrade;
        if(grade>=90 && grade<=100){
            lettergrade="A";
        }else if(grade>=80 && grade<=89){
        lettergrade="B";
            
        }else if(grade>=70 && grade<=79){
            lettergrade="C";
        }else if(grade>=60 && grade<=69){
            lettergrade="D";
        }else{
            lettergrade="F";
        }
        
        System.out.println("Information");
        System.out.println("Constantcode:"+constantcode);
        System.out.println("Fullname:"+fullname);
        System.out.println("Age:"+age);
        System.out.println("Grade:"+grade);
        System.out.println("Lettergrade:"+lettergrade);
        
        
    }
}