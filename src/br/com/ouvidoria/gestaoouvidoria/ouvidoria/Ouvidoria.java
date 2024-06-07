package br.com.ouvidoria.gestaoouvidoria.ouvidoria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.ouvidoria.gestaoouvidoria.entidades.Manifestacao;

public class Ouvidoria {

	private ArrayList<Manifestacao> manifestacoes = new ArrayList<Manifestacao>();

	public int getTamanhoLista() {
		return manifestacoes.size();
	}

	public void listarManifestacoes() {

		if (!manifestacoes.isEmpty()) {

			StringBuilder manifestacoesLista = new StringBuilder("Lista de Manifestações:\n");

			for (Manifestacao manifestacao : manifestacoes) {

				manifestacoesLista.append("- Nome do usuário: ").append(manifestacao.getNomeUsuario())
						.append("\n- Código de pesquisa: ").append(manifestacao.getCodigoPesquisa())
						.append("\n- Tipo De manifestação: ").append(manifestacao.getTipoManifestacao())
						.append("\n- Número da manifestação: ")
						.append(manifestacao.getQuantidadeManifestacao()).append("\n\n");
			}

			JOptionPane.showMessageDialog(null, manifestacoesLista.toString());

		} else {

			JOptionPane.showMessageDialog(null, "Não há manifestações listadas!");

		}

	}

	public void pesquisarManifestacoes(int codigo) {

		if (!manifestacoes.isEmpty()) {

			String manifestacoesLista = "Lista de Manifestações: \\n";

			for (Manifestacao manifestacao : manifestacoes) {

				if (manifestacao.getCodigoPesquisa() == codigo) {

					JOptionPane.showMessageDialog(null, manifestacoesLista);
					break;

				}

			}

		} else {

			JOptionPane.showMessageDialog(null, "Não há manifestações!");

		}

	}

	public void adicionarManifestacoes(Manifestacao novaManifestacao) {

		manifestacoes.add(novaManifestacao);

	}

	public void removerManifestacoes(int codigo) {

		for (Manifestacao manifestacao : manifestacoes) {

			if (manifestacao.getCodigoPesquisa() == codigo) {
				manifestacoes.remove(manifestacao);
				break;
			}
		}
	}
}
