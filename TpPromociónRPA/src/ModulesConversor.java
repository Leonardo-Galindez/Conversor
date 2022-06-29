public class ModulesConversor {
    
    //Modulo para verificar si el numero binario ingresado es correcto
    public static boolean esBinario(String bin){
        boolean valor;
        int i,cadena;
        valor=true;
        cadena=bin.length();
        while(valor=true){
            for(i=0;i<cadena;i++){
                if(bin.charAt(i)!='1'||bin.charAt(i)!='0'){
                    valor=false;
                }
            }
        }
        return valor;
    }
    //modulo para verificar si un numero decimal es negativo
    public static boolean esNegativo(int num){
        boolean valor;
        valor=false;
        if(num>0){
            valor=true;
        }
        return valor;

    }

    //Modulo Decimal a BinarioS
    public static String DecimalBinario(int num){
        String binario;
        binario="";
        while (num>0){

            if(num%2!=0){
                binario =  '1'+binario ;
                      }else{
                if(num%2==0){
                    binario ='0'+ binario  ;
                }
            }
            num=num/2;
        }
        return binario;
    }
    //Modulo para saber si el binario representa un numero negativo o no
    public static String C2binario(String b){
        int pos;
        pos=b.length();
        for(int i=0;i<pos;i++){

            System.out.println("pos:"+i+"  "+b.charAt(i));

            if(b.charAt(0)=='1'){
                b='-'+b;   
            }
        }   
        return b;
    }      
}
