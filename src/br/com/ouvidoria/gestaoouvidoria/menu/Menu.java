package br.com.ouvidoria.gestaoouvidoria.menu;

import javax.swing.JOptionPane;

import br.com.ouvidoria.gestaoouvidoria.entidades.Elogio;
import br.com.ouvidoria.gestaoouvidoria.entidades.Reclamacao;
import br.com.ouvidoria.gestaoouvidoria.entidades.Sugestao;
import br.com.ouvidoria.gestaoouvidoria.ouvidoria.Ouvidoria;

public class Menu extends Ouvidoria {

	public static void main(String[] args) {

		int opcao;
		Ouvidoria minhaOuvidoria = new Ouvidoria();

		do {

			String opcaoStr = JOptionPane.showInputDialog(
					"Manifestações:\n 1 - Listar \n 2 - Pesqusar \n 3 - Adicionar \n 4 - Remover \n 5 - Sair \n\n Digite a opção escolhida:");
			opcao = Integer.parseInt(opcaoStr);

			if (opcao == 1) {

				minhaOuvidoria.listarManifestacoes();

			} else if (opcao == 2) {

				if (minhaOuvidoria.getTamanhoLista() > 0) {

					String codigoStr = JOptionPane
							.showInputDialog("Insira o código da manifestação há ser pesquisada: ");
					int codigo = Integer.parseInt(codigoStr);

					minhaOuvidoria.pesquisarManifestacoes(codigo);

				} else {

					JOptionPane.showMessageDialog(null, "Não há manifestações!");

				}

			} else if (opcao == 3) {

				// nomeUsuario
				String usuraioStr = JOptionPane.showInputDialog("Digite seu nome: \n");

				// codigoPesquisa
				String codigoStr = JOptionPane.showInputDialog("Insira o código da sua manifestação");
				int codigo = Integer.parseInt(codigoStr);

				// tipoManifestacao
				String tipoManifestacaoStr = JOptionPane.showInputDialog(
						"Qual o tipo de manifestação preferida? \n 1°) Elogio \n 2°) Reclamação \n 3°) Sujestão");
				int tipoManifestacao = Integer.parseInt(tipoManifestacaoStr);

				// 1°) Elogio
				if (tipoManifestacao == 1) {

					String elogioStr = JOptionPane.showInputDialog("Digite o seu elogio:\n");

					Elogio novoElogio = new Elogio(usuraioStr, codigo, tipoManifestacao, elogioStr);

					minhaOuvidoria.adicionarManifestacoes(novoElogio);
					JOptionPane.showMessageDialog(null, "Adicionado com sucesso");

					// 2°) Reclamação
				} else if (tipoManifestacao == 2) {

					String reclamacaoStr = JOptionPane.showInputDialog("Digite a sua reclamação:\n");

					Reclamacao novaReclamacao = new Reclamacao(usuraioStr, codigo, tipoManifestacao, reclamacaoStr);

					minhaOuvidoria.adicionarManifestacoes(novaReclamacao);
					JOptionPane.showMessageDialog(null, "Adicionado com sucesso");

					// 3°) Sujestão
				} else if (tipoManifestacao == 3) {

					String sujestaoStr = JOptionPane.showInputDialog("Digite a sua sujesão:\n");

					Sugestao novaSujestao = new Sugestao(usuraioStr, codigo, tipoManifestacao, sujestaoStr);

					minhaOuvidoria.adicionarManifestacoes(novaSujestao);
					JOptionPane.showMessageDialog(null, "Adicionado com sucesso");

				} else {

					JOptionPane.showMessageDialog(null, "Opção inválida!");

				}

			} else if (opcao == 4) {

				String codigoStr = JOptionPane.showInputDialog("Insira o código da manifestação há ser removida:");
				int codigo = Integer.parseInt(codigoStr);

				minhaOuvidoria.removerManifestacoes(codigo);
				JOptionPane.showMessageDialog(null, "Removido com sucesso");

			} else if (opcao != 5) {

				JOptionPane.showMessageDialog(null, "Opção inválida!");

			}

		} while (opcao != 5);

		JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema!");
	}
}
