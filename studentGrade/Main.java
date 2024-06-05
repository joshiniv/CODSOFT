import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);

        String subjects[] = new String[]{"Tamil","English","Maths","Science","Social"};
        int marks []= new int[subjects.length]; 

        System.out.println("Enter marks for subjects below:");

        for(int i=0;i<subjects.length;i++){
            System.out.print(subjects[i]+": ");
            marks[i] = scan.nextInt();
        }                             

        int total=0;
        for (int mark : marks){
            total += mark;
        }

        int average = total/subjects.length;
        char grade='F';

        if(average>=90){
            grade='S';
        }else if(average>=80){
            grade='A';
        }else if(average>=70){
            grade='B';
        }else if(average>=60){
            grade='C';
        }else if(average>=50){
            grade='D';
        }
        
        System.out.println("==========================");
        System.out.println("total = "+total);
        System.out.println("average = "+average);
        System.out.println("grade = "+grade);
    }
}