import java.util.Scanner;

//Algoritmo para calculos, conversiones y verificaciones de numeros decimales y binario
public class Conversor {
    
    public static void main(String[] args) {
        
        int num, numDecimal, posicion1, posicion2, expo;
        float promedioDecimal;
        String subCadena, numBinario, elect, binario, c1, c2, binExpo;
        boolean valorMain, valorBinario;
        
        // valorBinario es la variable booleana donde se guarda el valor que retorna el modulo verificarBinario
        // valorMain es la variable que se utiliza para la operacion booleana del repetir hasta principal
        
        valorMain = false;
        Scanner obj = new Scanner(System.in);
        //hola mundo
        // menú de navegación
        do {
            System.out.println("Seleccione una de las opciones-----------------------'*'");
            System.out.println();
            System.out.println("Decimal a Binario:-----------------------------------'1'");
            System.out.println("Binario a Decimal:-----------------------------------'2'");
            System.out.println("Seleccione Subcadena del Binario:--------------------'3'");
            System.out.println("Promedio números Binarios:---------------------------'4'");
            System.out.println("Binario en Complemento a 1:--------------------------'5'");
            System.out.println("Binario en Complemento a 2:--------------------------'6'");
            System.out.println("Verificar si un Binario es válido:-------------------'7'");
            System.out.println("Multiplicar un binario por 2 a la 'n':---------------'8'");
            System.out.println("El Binario representa un número positivo o negativo:-'9'");
            System.out.println();
            System.out.println("Terminar.--------------------------------------------'0'");
            System.out.println();
            
            elect = obj.next();
            
            switch (elect) {
                case "1":
                    System.out.println("Ingrese un número Decimal:");
                    num = obj.nextInt();
                    numBinario = Modules.decimalABinario(num);
                    System.out.println("Binario: " + numBinario);
                    break;
                    
                case "2":
                    // Esta verificacion la utilizamos en casi todos los casos donde se ingresa un binario
                    do {// Verificacion de que si el binario es valido, sino este se va a repetir hasta que lo sea
                        System.out.println("Ingrese un número Binario:");
                        binario = obj.next();
                        valorBinario = Modules.verificarBinario(binario);
                        if (valorBinario == false) {// si es verdadero que no es un binario se muestra ERROR
                            System.out.println("ERROR.");
                        }
                    } while (valorBinario == false);// repite mientras sea verdadero que el binario es invalido
                    // valorBinario es donde se asigna el valor booleano que retorna el modulo verificarBinario
                    numDecimal = Modules.signoMagDecimal(binario);
                    System.out.println("Decimal: " + numDecimal);
                    break;
                    
                case "3":
                    do {
                        System.out.println("Ingrese un número Binario:");
                        binario = obj.next();
                        valorBinario = Modules.verificarBinario(binario);
                        if (valorBinario == false) {
                            System.out.println("ERROR.");
                        }
                    } while (valorBinario == false);
                    System.out.println("Ingrese 1ra posicion:");
                    posicion1 = obj.nextInt();
                    System.out.println("Ingrese 2da posicion:");
                    posicion2 = obj.nextInt();
                    subCadena = Modules.subCadena(binario, posicion1, posicion2);
                    System.out.println("Binario de la posicion: " + posicion1 + " hasta la posicion: " + posicion2
                            + " es: " + subCadena);
                    break;
                    
                case "4":
                    promedioDecimal = Modules.ingresoBinario();
                    System.out.println("El promedio de números binarios ingresados en decimal es de: " + promedioDecimal);
                    break;
                    
                case "5":
                    do {
                        System.out.println("Ingrese Numero Binario");
                        binario = obj.next();
                        valorBinario = Modules.verificarBinario(binario);
                        if (valorBinario == false) {
                            System.out.println("ERROR");
                        }
                    } while (valorBinario == false);
                    c1 = Modules.enComplementoA1(binario);
                    System.out.println("Complemento a 1:" + c1);
                    break;
                case "6":
                    
                    do {
                        System.out.println("Ingrese Numero Binario");
                        binario = obj.next();
                        valorBinario = Modules.verificarBinario(binario);
                        if (valorBinario == false) {
                            System.out.println("ERROR");
                        }
                    } while (valorBinario == false);
                    c2 = Modules.enComplementoA2(binario);
                    System.out.println("Complemento a 2:" + c2);
                    break;
                    
                case "7": // Este caso lo hicimos diferente al resto en la validacion del binario para que no repita si es invalido sino que muestre el mensaje por pantalla
                    System.out.println("Ingrese Numero Binario");
                    binario = obj.next();
                    valorBinario = Modules.verificarBinario(binario);
                    if (valorBinario == true) {
                        System.out.println("El binario es valido");
                    } else {
                        System.out.println("El binario es invalido");
                    }
                    break;
                    
                case "8":
                    do {
                        System.out.println("Ingrese un número Binario: ");
                        binario = obj.next();
                        valorBinario = Modules.verificarBinario(binario);
                        if (valorBinario == false) {
                            System.out.println("ERROR.");
                        }
                    } while (valorBinario == false);
                    System.out.println("Ingrese el exponente: ");
                    expo = obj.nextInt();// expo es la variable entera el cual es 2 elevado ese valor ingresado
                    binExpo = Modules.base2PorBinario(binario, expo);
                    System.out.println("El binario: " + binExpo);
                    break;
                    
                case "9":
                    do {
                        System.out.println("Ingrese un número Binario: ");
                        binario = obj.next();
                        valorBinario = Modules.verificarBinario(binario);
                        if (valorBinario == false) {
                            System.out.println("ERROR.");
                        }
                    } while (valorBinario == false);
                    valorBinario = Modules.verificarSigno(binario);
                    if (valorBinario) {
                        System.out.println(binario + ": Representa un número positivo.");
                    } else {
                        System.out.println(binario + ": Representa un número negativo.");
                    }
                    break;
                    
                case "0":
                    valorMain = true;// A valorMain se le asigna true para parar la ejecución
                    break;
                    
                default:
                    System.out.println("ERROR.");// Si se ingresa un valor no válido para el switch en la variable elect se muestra ERROR
                    break;
            }
            System.out.println("");
        } while (valorMain == false);
    }
    
}
