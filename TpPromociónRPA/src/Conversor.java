import java.util.Scanner;
public class Conversor {
    public static void main(String[]args){
    
        int numero;
        String binario = "";
        Scanner obj=new Scanner(System.in);
        System.out.println("numero");
        numero=obj.nextInt();
        System.out.println("HOIla");
        while (numero>0){

            if(numero%2!=0){
                binario =  '1'+binario ;
                      }else{
                if(numero%2==0){
                    binario ='0'+ binario  ;
                }
            }
            numero=numero/2;
        }
        System.out.println(binario);

    }
}

