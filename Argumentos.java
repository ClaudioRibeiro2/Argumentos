public class Argumentos {
	public static void main(String[] args){
		int len = args.length; // Pega o tamanho do array args que é passado pelo CMD
		String[] array;
		// Qualquer argumento que for passado por linha comando vai ser tranformado em array de Strings
		if (len >= 2) {
			System.out.println("Segue abaixo a lista de argumentos:");
			for (int i = 0;i < len;i++){
				String a = args[i];
				System.out.printf("%s%n", a);
			}
		} else {
			System.out.println("Favor, passar pelo menos 2 argumentos.");
		}
		
	} // Fim do método de classe main
} // Fim da classe Argumentos