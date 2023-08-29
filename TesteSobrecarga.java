public class TesteSobrecarga {
    public static void main(String[] args){
        System.out.printf("Máximo = %d%n",
                          Sobrecarga.max(2, 10, 14, 12, 213, 231411, 123132, 10000000));
        System.out.printf("Máximo = %f%n",
                          Sobrecarga.max(2.5, 10.6, 14.21, 14.20));
    }
} // Fim da classe TesteSobrecarga