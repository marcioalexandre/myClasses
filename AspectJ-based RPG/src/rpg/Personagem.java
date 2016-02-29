package rpg;

public class Personagem {

	private String nome;
	private String classe;
	private int level;
	private int dano;
	private int vida;
	private int posicaoX;
	private int posicaoY;
	
	public Personagem(String nome, int x, int y){
		setPosicaoX(x);
		setPosicaoY(y);
		setNome(nome);
		setVida(10);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public void Andar(String dir){
		switch (dir){
		case "esq":
			if (getPosicaoX() == 0) {
				System.out.println("Colado na parede esq");
			} else {
				posicaoY -= 1;
			}
			break;
		case "dir":
			if (getPosicaoX() == 10) {
				System.out.println("Colado na parede dir");
			} else {
				posicaoY += 1;
			}
			break;
		case "sub":
			if (getPosicaoY() == 0) {
				System.out.println("Colado na parede sub");
			} else {
				posicaoX += 1;
			}
			break;
		case "des":
			if (getPosicaoY() == 10) {
				System.out.println("Colado na parede des");
			} else {
				posicaoX -= 1;
			}
			break;
		default:
			System.out.println("Movimentacao invalida");
			break;
		}
	}

	public void Atacar(){
		System.out.println("Atacando...");
  	}

	public String levelUP(){
		setLevel(getLevel() + 1);
		setDano(getDano() + 2);
		return "Level UP";
	}


}