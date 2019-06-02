package entidades;

public class Login {
	
	private String email;
	private String senha;
	Cliente cliente;
	
	
	public Login(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public String getSiuaçao() {
		String situacao = "";
		if(email == cliente.getEmail() && senha == cliente.getSenha()) {
			situacao = "Usuario Logado!";
		}
		else {
			situacao = "Os dados informados estão incorretos! Tente novamente";
		}
		return situacao;
	}

}
