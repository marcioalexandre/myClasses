package rpg;

public aspect Log { 
	
	pointcut logg(): execution(public * *(..));

	before(): logg() {
	    System.err.println("Entrou no metodo:"+ thisJoinPoint.getSignature());

	    Object[] arguments = thisJoinPoint.getArgs();
	    for (int i =0; i < arguments.length; i++){
	        Object argument = arguments[i];
	        if (argument != null){
	            System.err.println("Valor passado: "+ argument);
	        }
	    }
	}
}
    
