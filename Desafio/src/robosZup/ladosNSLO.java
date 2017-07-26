package robosZup;

public class ladosNSLO {
	//definidas os lados para posicionamento do robo
		
		private int x;
		private int y;
		private char lado;
		// var declaradas como 'final' pois seus valores não serão alterados
		private final char NORTE	= 'N';
		private final char SUL 		= 'S';
		private final char LESTE 	= 'L';
		private final char OESTE 	= 'O';
		
		public ladosNSLO(int x, int y, char lado) {
			this.x = x;
			this.y = y;
			this.lado = 'n';
		}

}
