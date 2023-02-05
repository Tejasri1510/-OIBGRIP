import java.util.*;
class NumberGuessing{
   static boolean find(int n,int key){
       if(n==key){
        System.out.println ("You won!!!");
        return true;
       }
       else if(n>key){
        System.out.println ("Sorry! Your number is greater than expected one.");
       }
       else{
           System.out.println("Sorry! Your number is less than expected one.");
       }
       return false;
    }
   public static void main(String args[]){
    int min=1,max=100,t=10;
    boolean p=false;
    int key=(int)(Math.random()*(max-min))+min;
    Scanner sc=new Scanner(System.in);
    System.out.println("Guess the number!!!");
    System.out.println("You have "+t+" chances");
    while(t>0){
    System.out.println("Enter a number between 1 to 100");
    int n=sc.nextInt();
    p=find(n,key);
    if(p){
        break;
    }
    t--;
    }
    if(!p){
    System.out.println("Better luck next time.");
    System.out.println("Generated number is "+ key);}
   }
}