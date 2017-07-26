package robosZup;



public class comandos {
	public static void main(String args[]) {
    	
        robos robo1 = new robos(); // Instanciando o Robo 1
        robos robo2 = new robos(); // Instanciando o Robo 2
        
        // Robo 1
        robo1.setPosicao(1, 2,'n');  // Posição do Rover1
        robo1.exeComando("LMLMLMLMM");        // Comandos que o Rover1 vai seguir
        System.out.println(robo1.mostraPosicaorobo());    // Imprime o resultado do comando    
        
        
        // Rover 2
        robo2.setPosicao(3, 3,'l');  // Posição do Rover2 
        robo2.exeComando("MMRMMRMRRM");		// Comandos que o Rover2 vai seguir
        System.out.println(robo2.mostraPosicaorobo()); // Imprime o resultado do comando
    }

}
