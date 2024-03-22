import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class Main {
   public static void main (String[] args){
     
    Calculadora conta1 = new Calculadora();  
    Scanner scanner = new Scanner(System.in);
    
   
    System.out.println("---------CALCULADORA--------");
    conta1.numero1 =  Float.parseFloat(scanner.nextLine());
    conta1.sinal =  scanner.next().charAt(0);
    scanner.nextLine();
    conta1.numero2 =  Float.parseFloat(scanner.nextLine());
    
    
  switch (conta1.sinal) {
   case '+':
   System.out.println(Calculadora.soma(conta1.numero1,conta1.numero2));
      break;
   case '-':
   System.out.println(Calculadora.sub(conta1.numero1,conta1.numero2));
  
      break;
   case '/':
   System.out.println(Calculadora.div(conta1.numero1,conta1.numero2));
    
      break;         
   case '*':
   System.out.println(Calculadora.mul(conta1.numero1,conta1.numero2));
   break;
    
   default:
      break; 
  }
    
   }
}
