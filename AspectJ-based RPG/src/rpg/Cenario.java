package rpg;


public class Cenario {
    
    private String nome;
    //Transformar em array de criaturas
    //ArrayList<Object> mapa = new ArrayList<Object>();
    private String[][] mapa = new String[10][10]; 
    
    public String[][] getMapa() {
		return mapa;
	}

	public void setMapa(String[][] mapa) {
		this.mapa = mapa;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void gerarMapa(){
    	for (int i = 0; i < 10; i++){
    		 for (int j = 0; j < 10; j++) {  
                 mapa[i][j] = "N";  
             }  
    	}
    }

	public void inserir(int i, int j, String s){
		if (mapa[i][j] != "C"){
			mapa[i][j] = s;
		}
		System.out.println("Elemento inserido");
	}
	
	public void morte(int i, int j){
		if (mapa[i][j] == "C"){
			mapa[i][j] = "N";
			System.out.println("Elemento morto");
		}
		if (mapa[i][j] == "X"){
		System.out.println("Elemento muito forte");
		}
	}
    
	public String verificar(int i, int j){
		return mapa[i][j];
	}
	
	public void imprimir(){
		String map = "";
		System.out.println(" |0|1|2|3|4|5|6|7|8|9|");
		for (int i = 0; i < 10; i++){
			map += i + "|";
			for (int j=0;j < 10; j++){
				map += mapa[i][j] + "|";
			}		
		System.out.println(map);
		map = "";
		}
	}
    
    
    
}