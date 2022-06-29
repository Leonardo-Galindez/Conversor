import java.util.Scanner;
public class Conversor {
    public static void main(String[]args){
    
        int numero;
        String Numbinario,elect;

        Scanner obj=new Scanner(System.in);
        
        System.out.println("Binario a decimal: '1'");
        System.out.println("Decimal a bianario:'0'");
        elect=obj.next();
        switch(elect){
            case "1": 
            System.out.println("Ingrese numero Binario");
            numero=obj.nextInt();

            break;
            case "0":
                System.out.println("Ingrese numero Decimal"); 
                numero=obj.nextInt();
                if(numero>=0){
                    Numbinario=ModulesConversor.DecimalBinario(numero);
                    System.out.println("Binario:"+Numbinario);
                }else{
                    //Modulo decimal complemento a 1 y a 2
                }
                
            break;
            default:System.out.println("ERROR");
        }   
       
    
    }
}

