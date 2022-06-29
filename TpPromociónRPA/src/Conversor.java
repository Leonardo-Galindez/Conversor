import java.util.Scanner;
public class Conversor {
    public static void main(String[]args){
    
        int acumDecimal,numero,NumDecimal,NumDecimalC2,acum,cont;
        String Numbinario,elect1,elect2,binario,c1,c2,elect3;
        float promedio;
        boolean valor,valor2,valorBinario;
        acumDecimal=0;
        promedio=0;
        acum=0;
        cont=0;
        valorBinario=false;
        valor=false;

        Scanner obj=new Scanner(System.in);

        do {
            System.out.println("Decimal a binario:-------------------'1'");
            System.out.println("Binario a Decimal:-------------------'2'");
            System.out.println("Promedio numeros Binarios:-----------'3'");
            System.out.println("Binario a Complemento a 1:-----------'4'");
            System.out.println("Binario a Complemento a 2:-----------'5'");
            System.out.println("Binario en Signo Magnitud a Decimal--'6'");
            System.out.println("Terminar-----------------------------'7'");


            elect1=obj.next();

            //switch binario a decimal o decimal a bianario

            switch(elect1){

                case "1":
                System.out.println("Ingrese numero Decimal"); 
                numero=obj.nextInt();
                if(numero>=0){
                    Numbinario=ModulesConversor.DecimalBinario(numero);
                    System.out.println("Binario:"+Numbinario);
                }else{
                    //Si ingresa un numero negativo
                }
                break;

                case "2": 
                do{
                    System.out.println("Ingrese Numero Binario");
                    binario=obj.next();
                    valor=ModulesConversor.esBinario(binario);
                }while(valor==true);

                    NumDecimal=ModulesConversor.BinarioDecimal(binario);
                    System.out.println("Decimal:"+NumDecimal);

                break;

                case "3": 

                    while(valorBinario==false){

                        System.out.println("Ingrese binario");
                        binario=obj.next();
                        if(binario.equals("0")){
                            valorBinario=true;
                        }
                        
                        acumDecimal=ModulesConversor.IngresoBinario(binario);
                        acum=acum+acumDecimal;
                        cont++;
                        promedio=acumDecimal/cont;
                    }
                    System.out.println(promedio);
                break;

                case "4":
                    System.out.println("Ingrese Numero Binario");
                    binario=obj.next();
                    c1=ModulesConversor.C1Binario(binario);
                    System.out.println("Complemento a 1:"+c1);

                break;

                case "5":

                    System.out.println("Ingrese Numero Binario");
                    binario=obj.next();
                    c2=ModulesConversor.C2Binario(binario);
                    System.out.println("Complemento a 2:"+c2);

                break;
               
                
            

                case "7": 
                    valor=true;
                break;



                default:
                    System.out.println("ERROR");
                break;
            }  

        }while(valor==false);
        
       
    
    }
}

