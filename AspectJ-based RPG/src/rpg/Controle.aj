package rpg;

public aspect Controle {
	
	Jogador jog = new Jogador();
	
	pointcut controll() : call(* *.startPartida(..));  
	
    before() : controll() {  
        System.out.println("Checando se usuario esta logado...");    
        if (!jog.getStatus()){
        	throw new NullPointerException();
        } else {
        	System.out.println("***Partida Iniciada***");
        }
    } 
  
    after() returning(): controll() {  
        System.out.println("Partida finalizada com sucesso ");  
    }  
    
    after() throwing (Exception e): controll(){
    	System.out.println("Falha ao iniciar partida, Usuario não logado ");
    }
}
