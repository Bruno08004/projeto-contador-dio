import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       

       System.out.print("Informe o primeiro número: ");
       int parametroUm = sc.nextInt();
       System.out.print("Informe o segundo número: ");
       int parametroDois = sc.nextInt();

       try {
           
        contar(parametroUm, parametroDois);
        
       } catch (ParametrosInvalidosException e) {
         System.out.print("O segundo número deve ser maior em relação ao primero número.");
       }
       sc.close();
    }
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if  ( parametroUm > parametroDois ){
           throw new ParametrosInvalidosException();
        }
        System.out.println("Imprimindo contagem...");
        int contagem = parametroDois - parametroUm;
        for (int valor = 0; valor <= contagem ; valor++){
          System.out.println("Imprimindo número " + valor);
        }
    }

   
}
