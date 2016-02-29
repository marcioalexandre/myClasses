package rpg;

public class Teste2 {

	public static void main(String args[]){
		Jogador joao = new Jogador();
		joao.Logar();
		Partida part = new Partida();
		part.startPartida("Coisa", joao, 5);
	}
}
