import java.util.Scanner;
public class Conversor {
    public static void main(String[]args){
    
        int numero;
        String Numbinario,elect1,elect2,binario,c1;
        boolean valor;
        

        Scanner obj=new Scanner(System.in);
        
        System.out.println("Binario a decimal: '1'");
        System.out.println("Decimal a binario:'0'");
        elect1=obj.next();
        switch(elect1){
            case "1": 
            do{
                System.out.println("Ingrese Numero Binario");
                binario=obj.next();
                valor=ModulesConversor.esBinario(binario);
            }while(valor==true);

            System.out.println("Complemento a 1: '1'");
            System.out.println("Complemento a 2: '0'");
            elect2=obj.next();

            switch(elect2){
                case "1":
                c1=ModulesConversor.C1Binario(binario);
                System.out.println("Complemento a 1:"+c1);
                break;
                case "2"://en proceso
                break;

            }
            break;

            case "0":
                System.out.println("Ingrese numero Decimal"); 
                numero=obj.nextInt();
                if(numero>=0){
                    Numbinario=ModulesConversor.DecimalBinario(numero);
                    System.out.println("Binario:"+Numbinario);
                }else{
                    //Modulo binario complemento a 1 y a 2
                }
                
            break;

            default:System.out.println("ERROR");
            break;
        }   
       
    
    }
}

