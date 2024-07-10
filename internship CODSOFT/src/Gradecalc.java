import java.util.*;

public class Gradecalc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        System.out.println();
        String name = sc.nextLine();
        System.out.println("enter the mark obtained by the student");
        System.out.println();
        System.out.println("English:");
        int mark1=sc.nextInt();
        System.out.println("Maths:");
        int mark2=sc.nextInt();
        System.out.println("Science:");
        int mark3=sc.nextInt();
        System.out.println("Socialstudies:");
        int mark4=sc.nextInt();

        int sum = mark1+mark2+mark3+mark4; //sum

        int avgper = sum / 4; //avg

        System.out.println(name+" score total mark of: "+sum);

        System.out.println("average is of the student:"+avgper);


        System.out.println("Grade is :");


        if(avgper >= 90){
            System.out.println(name+" is A grade");
        } else if (avgper >=60) {
            System.out.println(name+" is B grade");
        } else if (avgper >= 40) {
            System.out.println(name+" is C grade");
        }else if (avgper >= 30){
            System.out.println(name+" is D grade");
        }else{
            System.out.println(name+" has failed");
        }
      sc.close();
    }


}