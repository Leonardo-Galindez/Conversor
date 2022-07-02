import java.util.Scanner;
//Algoritmo para calculos, conversiones y verificaciones de numeros decimales y binario
public class Conversor {
    public static void main(String[]args){
        int num,NumDecimal,posicion1,posicion2,expo;
        float PromedioDecimal;
        String Subcadena,Numbinario,elect1,binario,c1,c2,BinExpo;
        boolean valorMain,valorBinario;
        valorMain=false;
        Scanner obj=new Scanner(System.in);
        //menú de navegación
        do {
            System.out.println("Seleccione una de las opciones-----------------------'*'");
            System.out.println();
            System.out.println("Decimal a binario:-----------------------------------'1'");
            System.out.println("Binario a Decimal:-----------------------------------'2'");
            System.out.println("Seleccione Subcadena del binario:--------------------'3'");
            System.out.println("Promedio numeros Binarios:---------------------------'4'");
            System.out.println("Binario a Complemento a 1:---------------------------'5'");
            System.out.println("Binario a Complemento a 2:---------------------------'6'");
            System.out.println("Verificar si un binario es valido--------------------'7'");
            System.out.println("Multiplicar por 2 a la n por un binario--------------'8'");
            System.out.println("El binario representa un numero positivo o negativo--'9'");
            System.out.println();
            System.out.println("Terminar---------------------------------------------'0'");
            elect1=obj.next();
            switch(elect1){
                case "1":
                    System.out.println("Ingrese numero Decimal"); 
                    num=obj.nextInt();
                    Numbinario=ModulesConversor.decimalAbinario(num);
                    System.out.println("Binario:"+Numbinario);
                break;
                case "2": 
                    do{
                        System.out.println("Ingrese Numero Binario");
                        binario=obj.next();
                        valorMain=ModulesConversor.esBinario(binario);
                        if(valorMain==true){
                            System.out.println("ERROR");
                        }
                    }while(valorMain==true);
                    NumDecimal=ModulesConversor.SignoMagDecimal(binario);
                    System.out.println("Decimal:"+NumDecimal);
                break;
                case "3": 
                    do{
                        System.out.println("Ingrese Numero Binario");
                        binario=obj.next();
                        valorMain=ModulesConversor.esBinario(binario);
                        if(valorMain==true){
                            System.out.println("ERROR");
                        }
                    }while(valorMain==true);
                    System.out.println("Ingrese 1ra posicion");
                    posicion1=obj.nextInt();
                    System.out.println("Ingrese 2da posicion");
                    posicion2=obj.nextInt();
                    Subcadena=ModulesConversor.Subcadena(binario,posicion1, posicion2);
                    System.out.println("Binario de la posicion:"+posicion1+" hasta la posicion:"+posicion2+" es:"+Subcadena);
                break;
                case "4": 
                    PromedioDecimal=ModulesConversor.IngresoBinario();
                    System.out.println("El promedio de numeros binarios ingresados en decimal es de:"+PromedioDecimal);
                break;
                case "5":
                    do{
                        System.out.println("Ingrese Numero Binario");
                        binario=obj.next();
                        valorMain=ModulesConversor.esBinario(binario);
                        if(valorMain==true){
                            System.out.println("ERROR");
                        }
                    }while(valorMain==true);
                    c1=ModulesConversor.enComplementoA1(binario);
                    System.out.println("Complemento a 1:"+c1);
                break;
                case "6":
                    do{
                        System.out.println("Ingrese Numero Binario");
                        binario=obj.next();
                        valorMain=ModulesConversor.esBinario(binario);
                        if(valorMain==true){
                            System.out.println("ERROR");
                        }
                    }while(valorMain==true);
                    c2=ModulesConversor.enComplementoA2(binario);
                    System.out.println("Complemento a 2:"+c2);
                break;
                case "7": 
                    System.out.println("Ingrese Numero Binario");
                    binario=obj.next();
                    valorBinario=ModulesConversor.esBinario(binario);
                    if(valorBinario==false){
                        System.out.println("El binario es valido");
                    }else{
                        System.out.println("El binario es invalido");
                    }
                break;
                case "8": 
                    do{
                        System.out.println("Ingrese Numero Binario");
                        binario=obj.next();
                        valorMain=ModulesConversor.esBinario(binario);
                        if(valorMain==true){
                            System.out.println("ERROR");
                        }
                    }while(valorMain==true);
                    System.out.println("Ingrese exponenete");
                    expo=obj.nextInt();
                    BinExpo=ModulesConversor.base2PorBinario(binario,expo);
                    System.out.println("El binario:"+BinExpo);
                break;
                case "9": 
                    do{
                        System.out.println("Ingrese Numero Binario");
                        binario=obj.next();
                        valorMain=ModulesConversor.esBinario(binario);
                        if(valorMain==true){
                            System.out.println("ERROR");
                        }
                    }while(valorMain==true);
                    valorMain=ModulesConversor.esNegativo(binario);
                    if(valorMain){
                        System.out.println(binario+" :Representa un numero positivo");
                    }else{
                        System.out.println(binario+" :Representa un numero negativo");
                    }
                break;
                case "0": 
                valorMain=true;
                break;
                default:
                    System.out.println("ERROR");
                break;
            } 
            System.out.println(""); 
        }while(valorMain==false);
    }
}

