import java.util.*;
public class intern2{
    public static void main( String arg[]){
    char choice;
    do{
    Scanner sc= new Scanner(System.in);
    System.out.println("enter total subjects:");
    int subject=sc.nextInt();
    int totalMarks=subject*100;
    float studentTotalmarks=0; float marks;
    for( int i=1;i<=subject;i++){
        System.out.println("enter subject"+i+" marks");
        marks=sc.nextFloat();
        studentTotalmarks+=marks;
    }
    double percetage=(studentTotalmarks/totalMarks)*100;
    
    char grade;
    if(percetage>=90){
        grade='A';

    }
    else if(percetage>=80){
        grade='B';

    }
    else if(percetage>=70){
        grade='C';

    }
    else if(percetage>=60){
        grade='D';

    }
    else{
        grade='F';
    }

   System.out.println("===========================================");
   System.out.println("==================RESULT====================");
   System.out.println("Total marks: "+ studentTotalmarks+"/"+totalMarks);
   System.out.println("Percentage: "+percetage+"%");
   System.out.println("Grade "+ grade);
   System.out.println("===========================================");
   System.out.println("Do you want to calculate more students marks?(Y/N)");
   choice=sc.next().charAt(0);
   }while(choice=='Y'||choice=='y');
   System.out.println("=====================================================");
   System.out.println("==================APPLICATION END====================");
   System.out.println("======================================================");
    }
    }
