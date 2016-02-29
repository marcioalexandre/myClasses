package rpg;

public aspect Move { 

	pointcut movimentacao() : 
		(call(* *.Andar(..)));

	before() : movimentacao() {  
		System.out.println("Personagem vai andar");  
	}  

	after() returning(Object o): movimentacao() {  
		System.out.println("Personagem andou");  
	}  

	after() throwing (Exception e): movimentacao(){
		System.out.println("Parametro passado invalido " + e);
	}

	after() : movimentacao(){
		String movi = "";
		Object[] arg = thisJoinPoint.getArgs();
		Object argument = arg[0];
		if (argument != null){
			switch (argument.toString()){
			case "esq":
				movi = "Esquerda"; 
				break;
			case "dir":
				movi = "Direita"; 
				break;
			case "sub":
				movi = "Cima"; 
				break;
			case "des":
				movi = "Baixo"; 
				break;
			default:
				movi = "Invalido"; 
				break;
			}
		}
		System.out.println("Personagem andou para "+movi);            

	}
}


