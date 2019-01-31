import java.util.Scanner;
public class Jannkenn{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
       int b = sc.nextInt();
     if(a==1 && b==1){ 
          System.out.println("aiko");
     }else if(a==1 && b==2){
     	  System.out.println("aの勝ち");
     }else if(a==1 && b==3){
     	  System.out.println("bの勝ち");
     }else if(a==2 && b==1){
          System.out.println("bの勝ち");
     }else if(a==2 && b==2){
     	  System.out.println("aiko");
     }else if(a==2 && b==3){
     	  System.out.println("aの勝ち");
     }else if(a==3 && b==1){
     	  System.out.println("aの勝ち");
     }else if(a==3 && b==2){
          System.out.println("bの勝ち");
     }else if(a==3 && b==3){
          System.out.println("aiko");	  
     }	  
  } 
}