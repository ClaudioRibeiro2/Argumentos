public class TestePassagem {
	
	public static void main(String[] args){ // O que cmd recebe é um argumento
		int a = 20;
		
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