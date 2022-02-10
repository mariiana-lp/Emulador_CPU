package main;

import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;

public class logica {

    public static void main(String[] args) {
        List<Registro> lista = new ArrayList<>();
        Registro R01 = new Registro("R01", 0);
        lista.add(R01);
        Registro R02 = new Registro("R02", 1);
        lista.add(R02);
        //ADD_calculaMood(R01, R02);
        int y = Integer.reverse(1);
        System.out.println(y);

        double x = Math.pow(2, 32)-1;
        System.out.println(x);



    }
    public static int MOV_copiarValor(Registro rxx, Registro ryy){
        ryy.valor = rxx.valor;
        return ryy.valor;
    }

    public static int MOV_actualizarValor(int d, Registro rxx){
        rxx.valor = d;
        return rxx.valor;
    }

    public static void ADD_calculaMood(Registro rxx, Registro ryy){
        double operacion = (rxx.valor+ ryy.valor)%Math.pow(2,32);
        int resultado_operacion= (int)operacion;
        System.out.println(resultado_operacion);

    }

    // TODO: 9/02/22 pendiente de revision
    public static int DEC_decrementa(Registro rxx){
        if(rxx.valor == 0){
            double aux = Math.pow(2,32)-1;
            rxx.valor = (int)aux;

        }else{
        rxx.valor = rxx.valor -1;
        }

        return rxx.valor;
    }

    // TODO: 9/02/22 pendiente de revision
    public static int INC_aumenta(Registro rxx){
        double aux = rxx.valor;
        if(aux == Math.pow(2,32)-1){
            rxx.valor = 0;
        }else
            rxx.valor = rxx.valor + 1;

        return rxx.valor;
    }

    // TODO: 9/02/22 pendiente de revision
    public static int INV_inversionBitaBit(Registro rxx){
        /*String cadena;
        cadena = String.valueOf(rxx.valor);
        rxx.valor = (Integer)rxx.valor;*/

        int x =Integer.reverse(rxx.valor);
        return x;

    }

    public static void NOP(){}

}
