package robosZup;

import robosZup.ladosNSLO;

public class robos {
	private Integer x = 0;
	private Integer y = 0;
	private char lado = 'n';

	//recebe as coordenadas x e  y do robo e o lado N,S,L,O
 	public void setPosicao(Integer x, Integer y, char lado) {
	    this.x = x;
	    this.y = y;
	    this.lado = lado;
	}
 	// Recebe um comando e o Robo executa 
    public void exeComando(String comandos) {
    	Object comando;		    	
        for (int i = 0; i < comandos.length(); i++) {
            comando = comandos.charAt(i); // L� os 3 caracteres do comando
            
            if (comando.equals('L')) { // Esquerda
                vireEsquerda();
            } else if (comando.equals('R')) { // Direita
                vireDireita();
            } else if (comando.equals('M')) { // Mover o r
                moverRobo();
            }
        }
    }
 // Movimentar o robo
    private void moverRobo() {
        if (lado == 'n') { // dire��o NORTE, incrementa a coordenada Y
            this.y++;
        } else if (lado == 'l') { // dire��o LESTE, incrementa a coordenada X
            this.x++;
        } else if (lado == 's') { // dire��o SUL, decrementa a coordenada Y
            this.y--;
        } else if (lado == 'o') { // dire��o OESTE, decrementa a coordenada X
            this.x--;
        }
    }
    // Robo vira a esquerda
    private void vireEsquerda() {
    	if(lado == 'n'){ // Se a orienta��o j� estiver pro NORTE (orienta��o n�o pode ficar negativa)
    		lado = 'o'; // Orienta��o recebe OESTE
    	}
    	else
    		lado = 'n'; // Se n�o, coloca para o norte   	      
    }
    
    // Robo vira a direita
    private void vireDireita() {
    	
    	if(lado == 'o'){ // Se a orienta��o j� estiver pro OESTE (orienta��o n�o pode ficar  > 4)
    		lado = 'n'; // Orienta��o recebe NORTE
    	}
    	else
    		lado = 'o'; // Se n�o, incrementa o valor de Orienta��o      		
    }
    // Mostrando onde o Robo se encontra    
    public String mostraPosicaorobo() {
        
    	char cardial = 'N'; 
            	
    	// Formando a resposta de acordo com o valores das coordenadas X,Y(j� calculadas no executarComandos) e da dire��o.
        if (lado == 'n') {
            cardial = 'N';
        } else if (lado == 'l') {
            cardial = 'L';
        } else if (lado == 's') {
            cardial = 'S';
        } else if (lado == 'o') {
            cardial = 'O';
        }
        return x+" "+y+" "+ cardial;        
    }
    
    
}