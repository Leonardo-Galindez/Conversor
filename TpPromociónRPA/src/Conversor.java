import java.util.Scanner;
public class Conversor {
    public static void main(String[]args){
    
        int numero,NumDecimal,NumDecimalC2;
        String Numbinario,elect1,elect2,binario,c1,c2,elect3;
        boolean valor;
        

        Scanner obj=new Scanner(System.in);
        
        System.out.println("Opciones de binario:'0'");
        System.out.println("Decimal a binario:  '1'");

        elect1=obj.next();
        //switch binario  decimal o decimal a bianario
        switch(elect1){
            case "0": 
            do{
                System.out.println("Ingrese Numero Binario");
                binario=obj.next();
                valor=ModulesConversor.esBinario(binario);
            }while(valor==true);

            System.out.println("Complemento a 1:  '0'");
            System.out.println("Complemento a 2:  '1'");
            System.out.println("Binario a decimal:'2'");

            elect2=obj.next();
            // switch binario a c1 o binario a c2
            switch(elect2){
                case "0":
                    c1=ModulesConversor.C1Binario(binario);
                    System.out.println("Complemento a 1:"+c1);
                break;

                case "1":
                    c2=ModulesConversor.C2Binario(binario);
                    System.out.println("Complemento a 2:"+c2);
                    System.out.println("Desea convertir el Binario en C2 a decimal 'si' ó 'no'");
                    elect3=obj.next();
                    switch(elect3){
                        case "si":
                            NumDecimal=ModulesConversor.BinarioDecimal(binario);
                            NumDecimalC2=NumDecimal*-1;
                            System.out.println("Decimal:"+NumDecimalC2);
                        break;
                    }
                break;
                case "2":
                    NumDecimal=ModulesConversor.BinarioDecimal(binario);
                    System.out.println("Decimal:"+NumDecimal);
                break;

                default:
                    System.out.println("ERROR");
                break;
            }
            break;

            case "1":
                System.out.println("Ingrese numero Decimal"); 
                numero=obj.nextInt();
                if(numero>=0){
                    Numbinario=ModulesConversor.DecimalBinario(numero);
                    System.out.println("Binario:"+Numbinario);
                }else{
                    //Modulo binario complemento a 1 y a 2
                }
                
            break;

            default:
                System.out.println("ERROR");
            break;
        }   
       
    
    }
}

