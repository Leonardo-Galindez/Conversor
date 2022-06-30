import java.util.Scanner;
//Algoritmo para conversion de numeros decimales y bionarios
public class Conversor {
    public static void main(String[]args){
        int acumDecimal,numero,NumDecimal,acum,cont,posicion2,posicion1;
        String Subcadena,Numbinario,elect1,binario,c1,c2;
        float promedio;
        boolean valor,valorBinario;
        acumDecimal=0;
        promedio=0;
        acum=0;
        cont=0;
        valorBinario=false;
        valor=false;
        Scanner obj=new Scanner(System.in);
        //menú de navegación
        do {
            System.out.println("Decimal a binario:-------------------'1'");
            System.out.println("Binario a Decimal:-------------------'2'");
            System.out.println("Seleccione Subcadena:----------------'3'");
            System.out.println("Promedio numeros Binarios:-----------'4'");//En proceso
            System.out.println("Binario a Complemento a 1:-----------'5'");
            System.out.println("Binario a Complemento a 2:-----------'6'");
            System.out.println("Binario en Signo Magnitud a Decimal--'7'");
            System.out.println("Terminar-----------------------------'8'");
            elect1=obj.next();
            switch(elect1){
                case "1":
                System.out.println("Ingrese numero Decimal"); 
                numero=obj.nextInt();
                if(numero>=0){
                    Numbinario=ModulesConversor.DecimalBinario(numero);
                    System.out.println("Binario:"+Numbinario);
                }else{
                    //Si ingresa un numero negativo
                    //consultar
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
                    System.out.println("Ingrese binario");
                    binario=obj.next();
                    System.out.println("Ingrese 1ra posicion");
                    posicion1=obj.nextInt();
                    System.out.println("Ingrese 2da posicion");
                    posicion2=obj.nextInt();
                    Subcadena=ModulesConversor.Subcadena(binario,posicion1, posicion2);
                    System.out.println("Binario de la posicion:"+posicion1+"   hasta la posicion:"+posicion2+":"+Subcadena);
                break;

                //En proceso
                case "4": 
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
                case "5":
                    System.out.println("Ingrese Numero Binario");
                    binario=obj.next();
                    c1=ModulesConversor.C1Binario(binario);
                    System.out.println("Complemento a 1:"+c1);
                break;
                case "6":
                    System.out.println("Ingrese Numero Binario");
                    binario=obj.next();
                    c2=ModulesConversor.C2Binario(binario);
                    System.out.println("Complemento a 2:"+c2);
                break;
                case "7": 
                    System.out.println("Ingrese Numero Binario");
                    binario=obj.next();
                    NumDecimal=ModulesConversor.SignoMagDecimal(binario);
                    System.out.println("Decimal:"+NumDecimal);
                break;
                case "8": 
                    valor=true;
                break;
                default:
                    System.out.println("ERROR");
                break;
            }  
        }while(valor==false);
    }
}

