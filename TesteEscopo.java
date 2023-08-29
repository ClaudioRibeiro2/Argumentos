public class TesteEscopo {
    public static void main(String[] args){
        if (true){
            int a = 10; // A variavel int a só existe neste bloco {}.
            System.out.println(a); 
        }
        // System.out.println(a); // Esta linha vai dar erro, pois não existe nessa parte do codigo
    }
}