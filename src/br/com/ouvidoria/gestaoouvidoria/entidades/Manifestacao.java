package br.com.ouvidoria.gestaoouvidoria.entidades;

public class Manifestacao {

	private String nomeUsuario;
	private int codigoPesquisa;
	private int tipoManifestacao;
	private int quantidadeManifestacao;

	private static int contador = 1;

	public Manifestacao(String nomeUsuario, int codigoPesquisa, int tipoManifestacao) {
		this.nomeUsuario = nomeUsuario;
		this.codigoPesquisa = codigoPesquisa;
		this.tipoManifestacao = tipoManifestacao;
		this.quantidadeManifestacao = contador++;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public int getCodigoPesquisa() {
		return codigoPesquisa;
	}

	public void setCodigoPesquisa(int codigoPesquisa) {
		this.codigoPesquisa = codigoPesquisa;
	}

	public int getTipoManifestacao() {
		return tipoManifestacao;
	}

	public void setTipoManifestacao(int tipoManifestacao) {
		this.tipoManifestacao = tipoManifestacao;
	}

	public int getQuantidadeManifestacao() {
		return quantidadeManifestacao;
	}
}
