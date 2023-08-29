public class TestePassagem {
	
	public static void main(String[] args){ // O que cmd recebe é um argumento
		int a = 20;
		// Método de instacia só pode ser invocado quando o objeto que é pertecente é chamado
		// Método de clase E SÓ PODE SER STATIC pode ser invocada em qualquer situação.
		// Casting int i = (int) 1.2425 - retorna 1
		// O escopo do Parâmetro é apenas no método
		// O escopo da variável só exite desde onde ela foi declarada até o final do bloco {}
		// Sobrecarga de métodos: mesmo nome, com assinaturas diferentes
		// Sobreamento: quando um paremetro tem o mesmo nome de um atributo.
		Passador p = new Passador(a); // a em Passador(a) é um paremetro
		System.out.printf("p antes = %d\n", p.getUmNumero());
		TestePassagem t = new TestePassagem();
		t.umMetodo(p);
		System.out.printf("p depois = %d\n", p.getUmNumero());
	} // Fim do método main
	
	public void umMetodo(Passador umPassador){
		System.out.printf("[m] p antes = %d\n", umPassador.getUmNumero());
        umPassador.setUmNumero(umPassador.getUmNumero() + 1);
        System.out.printf("[m] p depois = %d\n", umPassador.getUmNumero());
	}
} // Fim da classe TestePassagem