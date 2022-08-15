package controller;

public class OperacoesController {

	//concatena de 100000 posições 
	
    public void concatenaString() {
	String cadeia = " ";
	double tempoInicial = System.nanoTime();
	for (int i = 0; i < 100000; i++) {
		cadeia = cadeia+"a";
	}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		// tempo total nS - 10^-9S
		 tempoTotal = tempoTotal / Math.pow(10, 9);
		 System.out.println("String 1000 ==>"+tempoTotal+"S ");
    }
//concatena de 100000 posicoes e mbuffer de strings
		 public void concatenaBuffer() {
			 StringBuffer buffer = new StringBuffer();
			 double tempoInicial = System.nanoTime(); 
			 for (int i = 0; i < 100000; i++) {
				 buffer.append("a");
			 }
			 double tempoFinal = System.nanoTime();
			 double tempoTotal = tempoFinal - tempoInicial;
			 // tempo total nS - 10^-9S
			 tempoTotal = tempoTotal / Math.pow (10, 9);
			 System.out.println("Buffer 1000 ==>"+tempoTotal+"S ");
		 }
}

