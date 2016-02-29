package rpg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jogador {
    
    private String nome;
    private String email;
    private String senha;
    private static Boolean Status;
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getStatus() {
		return Status;
	}

	public void setStatus(Boolean status) {
		Status = status;
	}
    
    public void Logar(String mail, String senha){
    	setEmail(mail);
    	setSenha(senha);
        if (getEmail().equals("a@a.com") && getSenha().equals("123")){
            setStatus(true);
            System.out.println("Logado com sucesso");
        } else {
        	setStatus(false);
            System.out.println("***********************************************");
            System.out.println("Login ou senha invalido"); 
            System.out.println("Email: " + mail + " Senha: " + senha);
            System.out.println("***********************************************");
        }
    }

	public void Logar(){
    	try{
	    BufferedReader in = new BufferedReader(new     InputStreamReader(System.in));  
	    
	    String em = "";
	    String se = "";
	    boolean logou = false;
	    
	    while(!logou){
	    System.out.print("Digite o nome do Usuario: ");  
	    em = in.readLine().toString();  
	    System.out.print("Digite a senha: ");  
	    se = in.readLine().toString();
	    Logar(em,se);
	    logou = getStatus();
	    }
    	}catch (Exception e){
    		System.out.println(e);
    	}
	
    }
    
    public void escolherPers(String nome, String classe, int x, int y){
    	
    	Personagem pers = new Personagem(nome,x,y);    	
    	pers.setClasse(classe);
    }
    
    public Personagem escolherP(){
    	try {  
    	    BufferedReader in = new BufferedReader(new     InputStreamReader(System.in));  
    	    
    	    String nPers;
    	    String classe;
    	    
    	    System.out.print("Digite o nome do Personagem: ");  
    	    nPers = in.readLine();  
    	    System.out.print("Escolha a Classe: ");  
    	    classe = in.readLine();  

        	Personagem pers = new Personagem(nPers,5,5);    
        	pers.setClasse(classe);

        	return pers;
    	} catch (IOException exception) {  
    	    exception.printStackTrace();
    	}    
    		return null;
    }
}