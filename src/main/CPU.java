package main;

import java.util.List;

import java.util.HashMap;

public class CPU {
    public static HashMap<String, Integer> registros = new HashMap<String, Integer>();

    public static void funcionesCPU(String[] subrutina) {

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

        int index = 0;
        List<String> Instrucciones = List.of(subrutina);
        int NoIns = Instrucciones.size();

        while(index<NoIns)
        {
            if(Instrucciones.get(index).startsWith("MOV R"))
            {
                System.out.println("se entro a la instruccion MOV Rxx");
                index++;
                continue;
            }
            if(Instrucciones.get(index).startsWith("MOV"))
            {
                String accion=subrutina[index].split(" ")[0];
                String[] valores = subrutina[index].split(" ")[1].split(",");
                //valores[0]=instruccion.split(" ")[1].split(",")[0];//Primer numero o registro
                //valores[1]=instruccion.split(" ")[1].split(",")[1];//Segundo registro
                //Hola, puedes oirme?
                // if(accion=="MOV"){
                //if(Integer.parseInt(valores[0])){
                CPU.registros.put(valores[1],Integer.parseInt(valores[0]));
                System.out.println("se entro a la instruccion MOV d");
                index++;
            }
            if(Instrucciones.get(index).startsWith("ADD"))
            {
                System.out.println("se entro a la instruccion ADD");
                index++;
            }
            if(Instrucciones.get(index).startsWith("DEC"))
            {
                System.out.println("se entro a la instruccion DEC");
                index++;
            }
            if(Instrucciones.get(index).startsWith("INC R"))
            {
                System.out.println("se entro a la instruccion INC");
                index++;
            }
            if(Instrucciones.get(index).startsWith("INV R"))
            {
                System.out.println("se entro a la instruccion INV");
                index++;
            }
            if(Instrucciones.get(index).startsWith("JMP"))
            {
                System.out.println("se entro a la instruccion JMP");
                index++;
            }
            if(Instrucciones.get(index).startsWith("JZ"))
            {
                System.out.println("se entro a la instruccion JZ");
                index++;
            }
            if(Instrucciones.get(index).startsWith("NOP"))
            {
                System.out.println("se entro a la instruccion NOP");
                index++;
            }
        }
    }
    public static void main(String[] args) {
        int[] registro = new int[42];
        String[] subrutina = {"MOV 5,R01", "MOV 10,R02", "JZ 7", "ADD R02,R01", "DEC R00", "JMP 3", "MOV R02,R42"};
        CPU.funcionesCPU(subrutina);
        System.out.println(CPU.registros.get("R01"));
        System.out.println(CPU.registros.get("R02"));
    }


}
