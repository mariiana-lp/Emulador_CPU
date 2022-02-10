package main;

import java.util.List;

import java.util.HashMap;

public class CPU {
    public static HashMap<String, Integer> registros = new HashMap<String, Integer>();

    public static String funcionesCPU(String[] subrutina) {

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

        String resultado;
        int index = 0;
        int contador = 0;
        List<String> Instrucciones = List.of(subrutina);
        int NoIns = Instrucciones.size();

        while (index < NoIns) {

            if (contador > 49999) {
                System.out.println("Maximo numero de instrucciones ejecutadas");
                break;
            }

            if (Instrucciones.get(index).startsWith("MOV R")) {
                String[] MOVR = subrutina[index].split(" ")[1].split(",");
                CPU.registros.put(MOVR[1], CPU.registros.get(MOVR[0]));
                System.out.println("se entro a la instruccion MOV Rxx");
                index++;
                contador++;
                continue;
            } else if (Instrucciones.get(index).startsWith("MOV")) {
                String[] valores = subrutina[index].split(" ")[1].split(",");
                CPU.registros.put(valores[1], Integer.parseInt(valores[0]));
                System.out.println("se entro a la instruccion MOV d");
                index++;
                contador++;
            } else if (Instrucciones.get(index).startsWith("ADD")) {
                String[] ADD = subrutina[index].split(" ")[1].split(",");
                CPU.registros.put(ADD[0], CPU.registros.get(ADD[0]) + CPU.registros.get(ADD[1]));
                System.out.println("se entro a la instruccion ADD");
                index++;
                contador++;
            } else if (Instrucciones.get(index).startsWith("DEC")) {
                String[] DEC = subrutina[index].split(" ");
                CPU.registros.put(DEC[1], CPU.registros.get(DEC[1]) - 1);
                System.out.println("se entro a la instruccion DEC");
                index++;
                contador++;
            } else if (Instrucciones.get(index).startsWith("INC R")) {
                String[] INC = subrutina[index].split(" "); //"INC Rxx" -> ["INC","Rxx"]
                CPU.registros.put(INC[1], CPU.registros.get(INC[1]) + 1);
                System.out.println("se entro a la instruccion INC");
                index++;
                contador++;
            } else if (Instrucciones.get(index).startsWith("INV R")) {
                String[] INV = subrutina[index].split(" ");
                int x = Integer.reverse(CPU.registros.get(INV[1]));
                CPU.registros.put(INV[1], x);
                System.out.println("se entro a la instruccion INV");
                index++;
                contador++;
            } else if (Instrucciones.get(index).startsWith("JMP")) {
                String[] JMP = subrutina[index].split(" ")[1].split(",");
                index = Integer.parseInt(JMP[0]) - 1;
                System.out.println("se entro a la instruccion JMP");
                contador++;
            } else if (Instrucciones.get(index).startsWith("JZ")) {
                if (CPU.registros.get("R00") == 0) {
                    String[] JMP = subrutina[index].split(" ")[1].split(",");
                    index = Integer.parseInt(JMP[0]) - 1;

                } else {
                    index++;
                }
                System.out.println("se entro a la instruccion JZ");
                contador++;
            } else if (Instrucciones.get(index).startsWith("NOP")) {
                System.out.println("se entro a la instruccion NOP");
                index++;
                contador++;
            }
        }
        resultado = String.valueOf(CPU.registros.get("R42"));
        System.out.println("Este es el contador " + contador);
        return resultado;
    }

    public static void main(String[] args) {

        String[] subrutina = {"MOV 5,R00", "MOV 10,R01", "JZ 7", "ADD R02,R01", "DEC R00", "JMP 3", "MOV R02,R42"};
        CPU.funcionesCPU(subrutina);

        System.out.println("El resultado del R42 es "+ CPU.funcionesCPU(subrutina));
    }
}
