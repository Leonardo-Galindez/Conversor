import java.util.Scanner;
public class Modules {
    
    public static boolean verificarBinario(String b) {
        // 1: Módulo para verificar si el número binario ingresado es correcto
        // b es la cadena de caracteres que vamos a analizar para verificar si cada uno de sus caracteres son 1nos y 0ros
        
        boolean valorBin;
        int i, cadena;
        valorBin = false;
        i = 0;
        cadena = b.length();
        while (valorBin == false && i < cadena) {
            if (b.charAt(i) != '1' && b.charAt(i) != '0') {
                valorBin = true;
            }
            i++;
        }
        return !valorBin;
    }
    
    public static boolean verificarSigno(String b) {
        // 2: Módulo para verificar si un número es positivo o negativo
        // b es la cadena de caracteres que ingresa el usuario para analizar si el caracter en la posicion 0 es 1, nro negativo, o 0, nro positivo
        boolean valorSig;
        valorSig = false;
        if (b.charAt(0) == '0') {
            valorSig = true;
        }
        return valorSig;
    }

    public static String subCadena(String b, int pos1, int pos2) {
        // 3: Módulo para obtener una subcadena
        // b es la cadena de caracteres que ingresa el usuario
        // pos1 es la primera posicion 
        // pos2 es la segunda posicion
        // retorna la subcadena que va de pos1 hasta pos2 inclusive
        int i, cant;
        String bin;
        bin = "";
        cant = b.length();
        if (pos1 >= 0 && pos1 < cant && pos2 >= 0 && pos2 < cant && pos1<=pos2) {
            // Validación para que las posiciones no sean menores a 0 ni mayores a cantidad de caracteres
            // pos1 siempre tiene que ser menor que pos2
            for (i = pos1; i <= pos2; i++) {
                bin = bin + b.charAt(i);
            }
        } else {
            bin = "ERROR.";
        }
        return bin;
    }

    public static String enComplementoA1(String b) {
        // 4: Módulo para calcular el Complemento a 1 de un número binario
        // b es la cadena de caracteres a la cual se le convertirán  0 por 1 y 1 por 0
        int i, pos;
        String binarioC1;
        binarioC1 = "";
        pos = b.length();
        for (i = 0; i < pos; i++) {
            if (b.charAt(i) == '1') {
                binarioC1 = binarioC1 + '0';
            } else {
                binarioC1 = binarioC1 + '1';  
            }
        }
        return binarioC1;
    }

    public static String enComplementoA2(String b) {
        // 5: Módulo para calcular el Complemento a 2 de un número binario
        // b es la cadena a la cuál se le aplicará la operación Complemento a 2
        int posMain, i;
        String binC2, binarioC2;
        binC2 = "";
        binarioC2 = "";
        boolean valor;
        valor = false;
        posMain = b.length();
        i = posMain - 1; 
        while (valor == false && i >= 0) {
            // recorre la cadena de derecha a izquierda en un recorrido parcial hasta encontrar el primer 1                          
            if (b.charAt(i) == '1') {
                valor = true;
                binC2 = subCadena(b, i, posMain-1);
            } 
            i--;
        }
        // bincC2 tiene la parte de la cadena ingresada hasta inclusive el primer 1
        binarioC2 = subCadena(b, 0, i);
        // Se obtiene la subcadena restante, que va desde la posición del primer 1, sin incluirlo, hasta la posición 0
        binarioC2 = enComplementoA1(binarioC2);
        // Se llama al módulo enComplementoA1 para invertir los valores a partir de la posicion del primer 1
        binarioC2 = binarioC2 + binC2;
        // Se concatena la subcadena después del primer 1 y la subcadena antes del primer 1 inclusive
        return binarioC2;
    }

    public static int signoMagDecimal(String b) {
        // 6.1: Módulo para convertir de binario en signo magnitud a decimal
        // b es la cadena de binarios que se convertirá a decimal positivo o negativo
        String bin;
        int i, j, decimal, cant;
        boolean valorDec;
        i = 0;
        bin = "";
        valorDec = verificarSigno(b);
        // llamada al modulo verificarSigno para coonocer el signo del número que representa el binario
        cant= b.length();                                             
        if (valorDec) { // si valorDec es true, es decir, número positivo
            for (j = i; j < cant; j++) {
                bin = bin + b.charAt(j);
            }
            decimal = binarioADecimal(bin);
            // El módulo binarioADecimal retorna un número positivo
        } else { // si valorDec es false, es decir, número negativo
            i = 1; // a i lo inicializamos en 1 porque en la posición 0 está el caracter 1
            for (j = i; j < cant; j++) {
                bin = bin + b.charAt(j);
            }
            decimal = binarioADecimal(bin);
            // El módulo binarioADecimal retorna un número positivo
            decimal = decimal * -1; 
            // Como el binario ingresado representaba un número negativo lo multiplicamos por -1
        }
        return decimal;
    }

    public static int binarioADecimal(String b) {
        // 6.2: Módulo para convertir de número Binario a Decimal
        // b es la cadena de caracteres ingresada por el usuario
        int i, pos, decimal, j;
        decimal = 0;
        pos = b.length();
        j = 0;
        for (i = pos - 1; i >= 0; i--) {// Para la conversion de binario a utilizamos un recorrido total de derecha a izquierda
            if (b.charAt(i) == '1') {
                decimal = decimal + 1 * (int) Math.pow(2, j);
            } else {
                decimal = decimal + 0 * (int) Math.pow(2, j);
            }
            j++;
        }
        return decimal;
    }

    public static String decimalABinario(int nroDec) {
        // 7: Módulo para convertir de número Decimal a Binario
        // nroDec es el número decimal ingresado por el usuario para convertir a binario
        String binario;
        char signo;
        binario = "";
        if (nroDec >= 0) { // Validación de signo
            signo = '0';
        } else {
            signo = '1';
            nroDec = nroDec * -1;
        }
        while (nroDec > 0) {
            // Se utiliza un while porque no se conoce la cantidad de veces que se dividirá por 2 el decimal ingresado
            if (nroDec % 2 != 0) {
                binario = '1' + binario;
            } else {
                if (nroDec % 2 == 0) {
                    binario = '0' + binario;
                }
            }
            nroDec = nroDec / 2;
        }
        binario = signo + binario;
        return binario;
    }

    public static String base2PorBinario(String b, int n) {
        // 8: Módulo que retorna el número binario ingresado con 'n' ceros a la izquierda
        // b es la cadena de caracteres ingresada por el usuario
        // n es el exponente ingresado por el usuario
        int i;
        for (i = 0; i < n; i++) {
            b = b + '0';
        }
        return b;
    }

    public static float ingresoBinario() {
        // 9: Módulo acumulador de binarios
        boolean valor;
        int decimal, cont;
        float promedio, acum;
        cont = 0;
        acum = 0;
        String b = "";
        valor = false;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.println("Ingrese un número Binario:");
            b = obj.next();
            decimal = signoMagDecimal(b);
            acum = acum + decimal;
            cont++;
            if (decimal == 0) {
                valor = true;
                cont--;
            }
        } while (valor == false && verificarBinario(b));
        promedio = acum / cont;
        return promedio;
    }
}
