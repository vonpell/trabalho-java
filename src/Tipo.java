public class Tipo {

	private String nome;

	public Tipo(String n) {
		this.nome = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		if (n == null) {
			throw new RuntimeException("Erro Nome Tipo: nome não pode ser null");
		} else if (n.isEmpty()) {
			throw new RuntimeException("Erro Nome Tipo: nome não pode ser vazio");
		} else {
			this.nome = n;
		}
	}
}
