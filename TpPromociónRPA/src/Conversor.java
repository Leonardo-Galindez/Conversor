import java.util.Scanner;

//Algoritmo para calculos, conversiones y verificaciones de numeros decimales y binario
public class Conversor {
    public static void main(String[] args) {
        int num, NumDecimal, posicion1, posicion2, expo;
        float PromedioDecimal;
        String Subcadena, Numbinario, elect, binario, c1, c2, BinExpo;
        boolean valorMain, valorBinario;
        // valorBinario es la variable booleana donde se guarda el valor que retorna el
        // modulo esBinario
        // valorMain es la variable que se utiliza para la operacion booleana del
        // repetir hasta principal
        valorMain = false;
        Scanner obj = new Scanner(System.in);
        // menú de navegación
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
            elect = obj.next();
            switch (elect) {
                case "1":
                    System.out.println("Ingrese numero Decimal");
                    num = obj.nextInt();
                    Numbinario = ModulesConversor.decimalAbinario(num);
                    System.out.println("Binario:" + Numbinario);
                    break;
                case "2":
                    // Esta verificaion la utilizamos en casi todos los casos donde se ingresa un
                    // binario
                    do {// Verificacion de que si el binario es valido, sino este se va a repetir hasta
                        // que lo sea
                        System.out.println("Ingrese Numero Binario");
                        binario = obj.next();
                        valorBinario = ModulesConversor.verificarBinario(binario);
                        if (valorBinario == true) {// si es verdadero que no es un binario se muestra ERROR
                            System.out.println("ERROR");
                        }
                    } while (valorBinario == true);// repite mientras sea verdadero que el binario es invalido
                    // valorBinario es donde se asigna el valor booleano que retorna el modulo
                    // esBinario
                    NumDecimal = ModulesConversor.SignoMagDecimal(binario);
                    System.out.println("Decimal:" + NumDecimal);
                    break;
                case "3":
                    do {
                        System.out.println("Ingrese Numero Binario");
                        binario = obj.next();
                        valorBinario = ModulesConversor.verificarBinario(binario);
                        if (valorBinario == true) {
                            System.out.println("ERROR");
                        }
                    } while (valorBinario == true);
                    System.out.println("Ingrese 1ra posicion");
                    posicion1 = obj.nextInt();
                    System.out.println("Ingrese 2da posicion");
                    posicion2 = obj.nextInt();
                    Subcadena = ModulesConversor.Subcadena(binario, posicion1, posicion2);
                    System.out.println("Binario de la posicion:" + posicion1 + " hasta la posicion:" + posicion2
                            + " es:" + Subcadena);
                    break;
                case "4":
                    PromedioDecimal = ModulesConversor.IngresoBinario();
                    System.out.println("El promedio de numeros binarios ingresados en decimal es de:" + PromedioDecimal);
                    break;
                case "5":
                    do {
                        System.out.println("Ingrese Numero Binario");
                        binario = obj.next();
                        valorBinario = ModulesConversor.verificarBinario(binario);
                        if (valorBinario == true) {
                            System.out.println("ERROR");
                        }
                    } while (valorBinario == true);
                    c1 = ModulesConversor.enComplementoA1(binario);
                    System.out.println("Complemento a 1:" + c1);
                    break;
                case "6":
                    do {
                        System.out.println("Ingrese Numero Binario");
                        binario = obj.next();
                        valorBinario = ModulesConversor.verificarBinario(binario);
                        if (valorBinario == true) {
                            System.out.println("ERROR");
                        }
                    } while (valorBinario == true);
                    c2 = ModulesConversor.enComplementoA2(binario);
                    System.out.println("Complemento a 2:" + c2);
                    break;
                case "7": // Este caso lo hicimos diferente al resto en la validacion del binario para que
                          // no repita si es invalido sino que muestre el mensaje por pantallal
                    System.out.println("Ingrese Numero Binario");
                    binario = obj.next();
                    valorBinario = ModulesConversor.verificarBinario(binario);
                    if (valorBinario == false) {
                        System.out.println("El binario es valido");
                    } else {
                        System.out.println("El binario es invalido");
                    }
                    break;
                case "8":
                    do {
                        System.out.println("Ingrese Numero Binario");
                        binario = obj.next();
                        valorBinario = ModulesConversor.verificarBinario(binario);
                        if (valorBinario == true) {
                            System.out.println("ERROR");
                        }
                    } while (valorBinario == true);
                    System.out.println("Ingrese exponenete");
                    expo = obj.nextInt();// expo es la variable entera el cual es 2 elevado ese exponente ingresado
                    BinExpo = ModulesConversor.base2PorBinario(binario, expo);
                    System.out.println("El binario:" + BinExpo);
                    break;
                case "9":
                    do {
                        System.out.println("Ingrese Numero Binario");
                        binario = obj.next();
                        valorBinario = ModulesConversor.verificarBinario(binario);
                        if (valorBinario == true) {
                            System.out.println("ERROR");
                        }
                    } while (valorBinario == true);
                    valorBinario = ModulesConversor.verifiacarSigno(binario);
                    if (valorBinario) {
                        System.out.println(binario + " :Representa un numero positivo");
                    } else {
                        System.out.println(binario + " :Representa un numero negativo");
                    }
                    break;
                case "0":
                    valorMain = true;// valor main se le asigna true para parar la ejecucicion
                    break;
                default:
                    System.out.println("ERROR");// Si se ingresa en un valor no valido para el switch en la variable
                                                // elect se muestra ERROR
                    break;
            }
            System.out.println("");
        } while (valorMain == false);
    }
}
