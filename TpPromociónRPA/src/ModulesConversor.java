import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public class ModulesConversor {
    
    //1:Modulo para verificar si el numero binario ingresado es correcto
    public static boolean esBinario(String bin){
        boolean valor;
        int i,cadena;
        valor=false;
        i=0;
        cadena=bin.length();

        while(valor==false && i<cadena){
            if(bin.charAt(i)!='1' && bin.charAt(i)!='0'){
               valor=true;
            }
            i++;
        }
        return valor;
    }



    //2:modulo para verificar si un numero decimal es negativo
    public static boolean esNegativo(int num){
        boolean valor;
        valor=false;
        if(num>0){
            valor=true;
        }
        return valor;

    }



    //3:



    //4: Modulo para sacar el Complemento a 1 de un binario
    public static String C1Binario(String b){
        int i,pos;
        String binario;
        binario="";
        pos=b.length();
        for(i=0;i<pos;i++){
            if(b.charAt(i)=='1'){
                binario=binario+'0';
            }else{
                if(b.charAt(i)=='0'){
                    binario=binario+'1';
                }
            }
        }
        return binario;
    }

    //5: Modulo para sacar el Complemento a 2 de un binario
    public static String C2Binario(String b){
        
        int pos,i,j;
        String binarioC2;
        binarioC2="";
        boolean valor;
        valor=false;

        pos=b.length();
        i=pos-1;
        while( valor==false && i>=0){
            if(b.charAt(i)=='1'){
                valor=true;
                binarioC2= b.charAt(i)+binarioC2;

                for(j=i-1;j>=0;j--){
                    if(b.charAt(j)=='1'){
                        binarioC2='0'+binarioC2;
                    }else{
                        if(b.charAt(j)=='0'){
                            binarioC2='1'+binarioC2;
                        }
                    }
                }
            }else{
                binarioC2= b.charAt(i)+binarioC2;
            }
            
            i--;
        }
        return binarioC2;
    }   
    //7:Modulo Binario a Decimal




    //7:Modulo Decimal a Binario
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
    /*public static String C2binario(String b){
        int pos;
        pos=b.length();
        for(int i=0;i<pos;i++){

            System.out.println("pos:"+i+"  "+b.charAt(i));

            if(b.charAt(0)=='1'){
                b='-'+b;   
            }
        }   
        return b;
    }   */   
}
