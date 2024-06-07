package br.com.ouvidoria.gestaoouvidoria.entidades;

public class Elogio extends Manifestacao {

	private String elogio;

	public Elogio(String nomeUsuario, int codigoPesquisa, int tipoManifestacao, String elogio) {
		super(nomeUsuario, codigoPesquisa, tipoManifestacao);
		this.elogio = elogio;
	}

	public String getElogio() {
		return elogio;
	}

	public void setElogio(String elogio) {
		this.elogio = elogio;
	}

	@Override
	public String toString() {

		return "\n- Nome do usuário: " + getNomeUsuario() + "\n- Código de pesquisa:" + getCodigoPesquisa()
				+ "\n- Tipo De manifestação: " + getTipoManifestacao() + "\n- Número da manifestação: "
				+ getQuantidadeManifestacao() + "\n- Elogio: " + getElogio();

	}
}
