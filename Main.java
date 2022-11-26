import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite uma letra de A a Z:");
    String N =sc.nextLine();
   char c=N.charAt(0);

    switch(c){ 

   case'a', 'A': 
   case'e', 'E': 
   case'i', 'I': 
   case'o', 'O': 
   case'u', 'U': 
    System.out.println("a letra "+N+" e uma vogal"); 
     break; 
   case'1': 
   case'2': 
   case'3': 
   case'4': 
   case'5': 
   case'6': 
   case'7': 
   case'8': 
   case'9': 
   case'0': 
    System.out.println("Erro!! Coloque uma vogal, ou uma consoante.");
    break;
    default: 
     System.out.println("a letra "+N+" e uma consoante");   
     } 
  } 
}