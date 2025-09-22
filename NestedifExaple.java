public class NestedifExaple {
    public static void main(String[] args){
        int marks=85;
        if(marks>=50){
            System.out.println("you passed the Exam.");
            if(marks>=90){
                System.out.println("grade :A+");
            }
            else if(marks>=75){
                System.out.println("grade :A");
            }
            else{
                System.out.println("grade :B");
            }
        }
        else{
            System.out.println("You are failed in Exam");
        }
        }
    }
    
