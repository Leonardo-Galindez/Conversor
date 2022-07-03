import java.util.Scanner;

public class ModulesConversor {
    // 1:Modulo para verificar si el numero binario ingresado es correcto
    public static boolean verificarBinario(String b) {
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
        return valorBin;
    }
    // 2:modulo para verificar si un numero es postivo o negativo
    public static boolean verifiacarSigno(String b) {
        boolean valorSig;
        valorSig = false;
        if (b.charAt(0) == '0') {
            valorSig = true;
        }
        return valorSig;
    }

    // 3:Modulo sub cadena
    public static String Subcadena(String b, int pos1, int pos2) {
        int i, cant;
        String bin;
        bin = "";
        cant = b.length();
        if (pos1 >= 0 && pos1 < cant && pos2 >= 0 && pos2 < cant && pos1<=pos2) {//Validacion para que las posiciones no sean menores a 0 ni mayores a cantidad de caracteres
            //pos1 siempre tiene que ser menor que pos2
            for (i = pos1; i <= pos2; i++) {
                bin = bin + b.charAt(i);
            }
        } else {
            bin = "ERROR";
        }
        return bin;
    }

    // 4: Modulo para sacar el Complemento a 1 de un binario
    public static String enComplementoA1(String b) {
        int i, pos;
        String binarioA1;
        binarioA1 = "";
        pos = b.length();
        for (i = 0; i < pos; i++) {
            if (b.charAt(i) == '1') {
                binarioA1 = binarioA1 + '0';
            } else {
                binarioA1 = binarioA1 + '1';  
            }
        }
        return binarioA1;
    }

    // 5: Modulo para sacar el Complemento a 2 de un binario
    public static String enComplementoA2(String b) {
        int posMain, posSub, i;
        String binC2, binarioC2;
        binC2 = "";
        binarioC2 = "";
        boolean valor;
        valor = false;
        posMain = b.length();
        i = posMain - 1;
        while (valor == false && i >= 0) {// verifica de derecha a izquierda por recorrido parcial hasta encontrar el primer 1
                                          
            if (b.charAt(i) == '1') {
                valor = true;
                binC2 = b.charAt(i) + binC2;
            } else {
                binC2 = b.charAt(i) + binC2;
            }
            i--;
        }
        // bincC2 tiene la parte de la cadena ingresada hasta inclusive el primer 1
        posSub = binC2.length();
        posMain = posMain - posSub;// le restamos a posMain para obtener la cantidad de caracteres que tenemos en
                                   // la cadena despues del primer 1
        for (i = posMain; i > 0; i--) {// For para ir concatenando los caracteres de la cadena a partir de la posicion
                                       // del primer 1
            binarioC2 = binarioC2 + b.charAt(i);
        }
        binarioC2 = ModulesConversor.enComplementoA1(binarioC2);// llamamos al modulo c1 para invertir los valores a
                                                                // partir de la posicion del primer 1
        binarioC2 = binarioC2 + binC2;// Concatenamos la cadena despues del primer 1 y la cadena antes del primer 1
                                      // inclusive
        return binarioC2;
    }

    // 6:modulo binario en signo magnitud a decimal
    public static int SignoMagDecimal(String b) {
        String bin;
        int i, j, decimal;
        boolean valorDec;
        i = 0;
        bin = "";
        valorDec = ModulesConversor.verifiacarSigno(b);// llamada al modulo verifiacarSigno para saber el signo del
                                                       // numero que representa el binario
        if (valorDec) {// si valorDec es true osea negativo
            for (j = i; j < b.length(); j++) {
                bin = bin + b.charAt(j);
            }
            decimal = ModulesConversor.BinarioADecimal(bin);//el modulo BinarioADecimal nos retorna un numero positivo
        } else {// si valorDec es false osea positivo
            i = 1;// a i lo inicializamos en 1 porque en l aposicion 0 esta el caracter 0
            for (j = i; j < b.length(); j++) {
                bin = bin + b.charAt(j);
            }
            decimal = ModulesConversor.BinarioADecimal(bin);// el modulo BinarioADecimal nos retorna un numero positivo
            decimal = decimal * -1; // pero como el binario ingresado representaba un numero negativo lo
                                    // multiplicamos por -1
        }
        return decimal;
    }

    // 6:Modulo Binario a Decimal
    public static int BinarioADecimal(String b) {
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

    // 7:Modulo Decimal a Binario
    public static String decimalAbinario(int nroDec) {
        String binario;
        char signo;
        binario = "";
        if (nroDec >= 0) {
            signo = '0';
        } else {
            signo = '1';
            nroDec = nroDec * -1;
        }
        while (nroDec > 0) {
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

    // 8:Modulo que retorna el binario ingresado con n ceros a la izquierda
    public static String base2PorBinario(String b, int n) {
        int i;
        for (i = 0; i < n; i++) {
            b = b + '0';
        }
        return b;
    }

    // 9:Modulo acumuldor de binarios
    public static float IngresoBinario() {
        boolean valor;
        int Decimal, cont;
        float promedio, acum;
        cont = 0;
        acum = 0;
        String b;
        valor = false;
        Scanner obj = new Scanner(System.in);
        while (valor == false) {
            do {
                System.out.println("Ingrese Numero Binario");
                b = obj.next();
                valor = ModulesConversor.verificarBinario(b);
            } while (valor == true);
            Decimal = ModulesConversor.SignoMagDecimal(b);
            acum = acum + Decimal;
            cont++;
            if (Decimal == 0) {
                valor = true;
                cont--;
            }
        }
        promedio = acum / cont;
        return promedio;
    }
}
