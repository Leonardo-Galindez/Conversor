import java.util.Scanner;
//Algoritmo para conversion de numeros decimales y bionarios(Complemento a 2,Complemento a 1)
public class Conversor {
    public static void main(String[]args){
        int num,NumDecimal,posicion1,posicion2,expo;
        float PromedioDecimal;
        String Subcadena,Numbinario,elect1,binario,c1,c2,BinExpo;
        boolean valor;
        valor=false;
        Scanner obj=new Scanner(System.in);
        //menú de navegación4
        do {
            System.out.println("Por favor ingrese una de las siguintes opciones");
            System.out.println("");
            System.out.println("Decimal a binario:-----------------------'1'");
            System.out.println("Binario a Decimal:-----------------------'2'");
            System.out.println("Seleccione Subcadena:--------------------'3'");
            System.out.println("Promedio numeros Binarios:---------------'4'");
            System.out.println("Binario a Complemento a 1:---------------'5'");
            System.out.println("Binario a Complemento a 2:---------------'6'");
            System.out.println("Binario en Signo Magnitud a Decimal------'7'");
            System.out.println("Multiplicar por 2 a la n por un binario--'8'");
            System.out.println("Terminar---------------------------------'9'");
            elect1=obj.next();
            switch(elect1){
                case "1":
                    System.out.println("Ingrese numero Decimal"); 
                    num=obj.nextInt();
                    Numbinario=ModulesConversor.DecimalBinario(num);
                    System.out.println("Binario:"+Numbinario);
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
                    do{
                    System.out.println("Ingrese Numero Binario");
                    binario=obj.next();
                    valor=ModulesConversor.esBinario(binario);
                    }while(valor==true);
                    System.out.println("Ingrese 1ra posicion");
                    posicion1=obj.nextInt();
                    System.out.println("Ingrese 2da posicion");
                    posicion2=obj.nextInt();
                    Subcadena=ModulesConversor.Subcadena(binario,posicion1, posicion2);
                    System.out.println("Binario de la posicion:"+posicion1+" hasta la posicion:"+posicion2+"es :"+Subcadena);
                break;
                case "4": 
                    PromedioDecimal=ModulesConversor.IngresoBinario();
                    System.out.println("El promedio de numeros binarios ingresados en decimal es de:"+PromedioDecimal);
                break;
                case "5":
                    do{
                        System.out.println("Ingrese Numero Binario");
                        binario=obj.next();
                        valor=ModulesConversor.esBinario(binario);
                    }while(valor==true);
                    c1=ModulesConversor.C1Binario(binario);
                    System.out.println("Complemento a 1:"+c1);
                break;
                case "6":
                    do{
                        System.out.println("Ingrese Numero Binario");
                        binario=obj.next();
                        valor=ModulesConversor.esBinario(binario);
                    }while(valor==true);
                    c2=ModulesConversor.C2Binario(binario);
                    System.out.println("Complemento a 2:"+c2);
                break;
                case "7": 
                    do{
                        System.out.println("Ingrese Numero Binario");
                        binario=obj.next();
                        valor=ModulesConversor.esBinario(binario);
                    }while(valor==true);
                    NumDecimal=ModulesConversor.SignoMagDecimal(binario);
                    System.out.println("Decimal:"+NumDecimal);
                break;
                case "8": 
                    do{
                        System.out.println("Ingrese Numero Binario");
                        binario=obj.next();
                        valor=ModulesConversor.esBinario(binario);
                    }while(valor==true);
                    System.out.println("Ingrese exponenete");
                    expo=obj.nextInt();
                    BinExpo=ModulesConversor.base2PorBinario(binario,expo);
                    System.out.println("El binario:"+BinExpo);
                break;
                case "9": 
                    valor=true;
                break;
                default:
                    System.out.println("ERROR");
                break;
            } 
            System.out.println(""); 
        }while(valor==false);
    }
}

