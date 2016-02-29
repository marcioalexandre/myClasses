package rpg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Partida {

	static Cenario cen = new Cenario();	

	public void startPartida(String nCenario, Jogador jog, int qntCriaturas){
		Jogador teste = new Jogador();		
		cen.setNome("rua");
		cen.gerarMapa();

		Random rand = new Random();

		for (int i = 0; i <= 5; i++){
			int x = rand.nextInt(10);
			int y = rand.nextInt(10);
			cen.inserir(x, y, "C");
		}
		
		cen.inserir(5, 5, "C");
		
		cen.inserir(5, 6, "X");

		Personagem pers = teste.escolherP();
		Boolean cont = true;
		int r = 0;
		while (cont){
			r++;
			System.out.println("");
			System.out.println("*********Rodada ["+r+"]**********");
			System.out.println("");
			System.out.println("------------Cenario---------------");			
			cen.imprimir();
			System.out.println("");
			System.out.println("------------Personagem------------");
			System.out.println("Personagem: "+pers.getNome());
			System.out.println("Vida: "+pers.getVida());
			System.out.println("Level: "+pers.getLevel());
			System.out.println("Posicao: |"+pers.getPosicaoX() +"|"+ pers.getPosicaoY()+"|");
			String ver = cen.verificar(pers.getPosicaoX(), pers.getPosicaoY());
			if (ver == "C" || ver == "X"){
				System.out.println("Existe um monstro nesse local");				
			}
			System.out.println("");
			System.out.println("------------Movimentos------------");
			System.out.println("1 - ANDAR - esq / dir / sub / des");
			System.out.println("2 - ATACAR");
			System.out.println("3 - SAIR");
			System.out.println("");
			cont = Movimentar(pers);
			if (pers.getVida() <= 0){
				System.out.println("Personagem morto");
				cont = false;
			}
		}		
		System.out.println("Fim do jogo");
	}

	public static boolean Movimentar(Personagem pers){
		Boolean res = false;
		try{
			String mov = "";
			String dir = "";
			BufferedReader in = new BufferedReader(new     InputStreamReader(System.in));
			System.out.print("Digite sua jogada: ");  
			mov = in.readLine();	
				switch (mov){
				case "andar":
					System.out.print("Digite a direcao: ");  
					dir = in.readLine();				
					pers.Andar(dir);
					res = true;
					break;
				case "atacar":
					pers.Atacar();
					String ver = cen.verificar(pers.getPosicaoX(), pers.getPosicaoY());
					if (ver == "C")
						pers.levelUP();
						cen.morte(pers.getPosicaoX(), pers.getPosicaoY());
					if (ver == "X"){
						pers.setVida(pers.getVida() - 5);
						System.out.println("Cuidado, atacou um monstro muito forte");
					}
					if (ver == "N")
						System.out.println("Sem monstros nesse local");	
					res = true;
					break;
				case "sair":
					res = false;
					break;
				}
		}catch(IOException exception) {  
			exception.printStackTrace();
		}  		
		return res;
	}

}
