import java.util.Scanner;
public class Conversor {
    public static void main(String[]args){
    
        int numero;
        String Numbinario,elect,binario;
        boolean valor;
        

        Scanner obj=new Scanner(System.in);
        
        System.out.println("Binario a decimal: '1'");
        System.out.println("Decimal a binario:'0'");
        elect=obj.next();
        switch(elect){
            case "1": 
            do{
                System.out.println("Ingrese Numero Binario");
                binario=obj.next();
                valor=ModulesConversor.esBinario(binario);
            }while(valor==true);
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

