public class Calculadora {
    
    float numero1;
    float numero2;
    char sinal;

  
    public static float soma(float a,float b) {
        return a+b;
    }

    public static float sub(float a,float b) {
        return a-b;
    }

    public static float mul(float a,float b) {
        return a*b;
    }

    public static float div(float a,float b) {
        if (b!= 0) {
           return a/b;
        } 
        else {
          return 0;
        }
    }
   


        
           
         
}
 


