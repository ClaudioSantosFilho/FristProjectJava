package br.com.ouvidoria.gestaoouvidoria.entidades;

public class Reclamacao extends Manifestacao {

	private String reclamacao;

	public Reclamacao(String nomeUsuario, int codigoPesquisa, int tipoManifestacao, String reclamacao) {
		super(nomeUsuario, codigoPesquisa, tipoManifestacao);
		this.reclamacao = reclamacao;
	}

	public String getReclamacao() {
		return reclamacao;
	}

	public void setReclamacao(String reclamacao) {
		this.reclamacao = reclamacao;
	}

	@Override
	public String toString() {

		return "\n- Nome do usuário: " + getNomeUsuario() + "\n- Código de pesquisa:" + getCodigoPesquisa()
				+ "\n- Tipo De manifestação: " + getTipoManifestacao() + "\n- Número da manifestação: "
				+ getQuantidadeManifestacao() + "\n- Reclamação: " + getReclamacao();

	}
}
