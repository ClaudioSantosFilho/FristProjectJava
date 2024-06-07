package br.com.ouvidoria.gestaoouvidoria.entidades;

public class Sugestao extends Manifestacao {

	private String sugestao;

	public Sugestao(String nomeUsuario, int codigoPesquisa, int tipoManifestacao, String sugestao) {
		super(nomeUsuario, codigoPesquisa, tipoManifestacao);
		this.sugestao = sugestao;
	}

	public String getSugestao() {
		return sugestao;
	}

	public void setSugestao(String sugestao) {
		this.sugestao = sugestao;
	}

	@Override
	public String toString() {

		return "\n- Nome do usuário: " + getNomeUsuario() + "\n- Código de pesquisa:" + getCodigoPesquisa()
				+ "\n- Tipo De manifestação: " + getTipoManifestacao() + "\n- Número da manifestação: "
				+ getQuantidadeManifestacao() + "\n- Reclamação: " + getSugestao();

	}
}
