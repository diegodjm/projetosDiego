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
            comando = comandos.charAt(i); // Lê os 3 caracteres do comando
            
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
        if (lado == 'n') { // direção NORTE, incrementa a coordenada Y
            this.y++;
        } else if (lado == 'l') { // direção LESTE, incrementa a coordenada X
            this.x++;
        } else if (lado == 's') { // direção SUL, decrementa a coordenada Y
            this.y--;
        } else if (lado == 'o') { // direção OESTE, decrementa a coordenada X
            this.x--;
        }
    }
    // Robo vira a esquerda
    private void vireEsquerda() {
    	if(lado == 'n'){ // Se a orientação já estiver pro NORTE (orientação não pode ficar negativa)
    		lado = 'o'; // Orientação recebe OESTE
    	}
    	else
    		lado = 'n'; // Se não, coloca para o norte   	      
    }
    
    // Robo vira a direita
    private void vireDireita() {
    	
    	if(lado == 'o'){ // Se a orientação já estiver pro OESTE (orientação não pode ficar  > 4)
    		lado = 'n'; // Orientação recebe NORTE
    	}
    	else
    		lado = 'o'; // Se não, incrementa o valor de Orientação      		
    }
    // Mostrando onde o Robo se encontra    
    public String mostraPosicaorobo() {
        
    	char cardial = 'N'; 
            	
    	// Formando a resposta de acordo com o valores das coordenadas X,Y(já calculadas no executarComandos) e da direção.
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