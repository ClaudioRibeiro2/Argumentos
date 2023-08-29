public class Sobrecarga {
    public static int max (int... numeros){ // Método static é sempre um método de classe
        int max = Integer.MIN_VALUE; // max armzena o menor valor possivel na maquina
        System.out.printf("NUM_MIN: %d%n",max);
        for (int num : numeros) // for wich, percorre todos os numeros informados
            max = (num > max) ? num : max; // Ternário que percorre todos comparando que é o maior numero e depois o atribui em int num 
        return max;
    }
    public static double max (double... numeros){
        double max = Double.MIN_VALUE;
        System.out.printf("NUM_MIN: %.325f%n",max);
        for (double num : numeros)
            max = (num > max) ? num : max;
        return max;
    }
}