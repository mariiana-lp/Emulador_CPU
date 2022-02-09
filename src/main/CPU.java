package main;

import java.util.List;

import java.util.HashMap;

public class CPU {
    public static HashMap<String, Integer> registros = new HashMap<String, Integer>();

        registros.put("R00", 0);
        registros.put("R01", 0);
        registros.put("R02", 0);
        registros.put("R03", 0);
        registros.put("R04", 0);
        registros.put("R05", 0);
        registros.put("R06", 0);
        registros.put("R07", 0);
        registros.put("R08", 0);
        registros.put("R09", 0);
        registros.put("R10", 0);
        registros.put("R11", 0);
        registros.put("R12", 0);
        registros.put("R13", 0);
        registros.put("R14", 0);
        registros.put("R15", 0);
        registros.put("R16", 0);
        registros.put("R17", 0);
        registros.put("R18", 0);
        registros.put("R19", 0);
        registros.put("R20", 0);
        registros.put("R21", 0);
        registros.put("R22", 0);
        registros.put("R23", 0);
        registros.put("R24", 0);
        registros.put("R25", 0);
        registros.put("R26", 0);
        registros.put("R27", 0);
        registros.put("R28", 0);
        registros.put("R29", 0);
        registros.put("R30", 0);
        registros.put("R31", 0);
        registros.put("R32", 0);
        registros.put("R33", 0);
        registros.put("R34", 0);
        registros.put("R35", 0);
        registros.put("R36", 0);
        registros.put("R37", 0);
        registros.put("R38", 0);
        registros.put("R39", 0);
        registros.put("R40", 0);
        registros.put("R41", 0);
        registros.put("R42", 0);

    public static void funcionesCPU(String[] subrutina) {




        //String mensaje = "";
        int index = 0;
        //List<String> Instrucciones = List.of(suprutina);
        //int NoIns = Instrucciones.size();

        for (String instruccion:subrutina){
            subrutina[0]="MOV 5,R01";
            String accion=instruccion.split(" ")[0];
            String[] valores = new String [2];
            valores[0]=instruccion.split(" ")[1].split(",")[0];//Primer numero o registro
            valores[1]=instruccion.split(" ")[1].split(",")[1];//Segundo registro

                    if(accion=="MOV"){
                        //if(Integer.parseInt(valores[0])){
                            CPU.registros.put(valores[1],Integer.parseInt(valores[0]));


                        //}

                    }

        }

    }

    public static void main(String[] args) {
        int[] registro = new int[42];
        String[] subrutina = {"MOV 5, R01", "MOV 10,R01", "JZ 7", "ADD R02,R01", "DEC R00", "JMP 3", "MOV R02,R42"};
        CPU.funcionesCPU(subrutina);
        System.out.println(CPU.registros.get("R01"));
    }


}
