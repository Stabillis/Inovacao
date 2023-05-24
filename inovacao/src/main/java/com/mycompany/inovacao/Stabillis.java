package com.mycompany.inovacao;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.processos.Processo;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author victo
 */
public class Stabillis {
    // DADOS UTILIZADOS
    private Integer pid;
    private String nome;
    private Double disco;
    private Double ram;

    public static void main(String[] args) {
        Looca looca = new Looca();
        
        List<Processo> nomeProcessos = looca.getGrupoDeProcessos().getProcessos();

        
                //Inovação
                    for (int i = 0; i < nomeProcessos.size(); i++) {
                    if (nomeProcessos.get(i).getUsoCpu() > 75 || nomeProcessos.get(i).getUsoMemoria() > 90) {
                        System.out.println(nomeProcessos.get(i));
                        int option = JOptionPane.showOptionDialog(
                                null, // Componente pai (null indica que não temos um componente pai);;
                                String.format("O processo %s está em estado critico CPU em %.2f e Memoria em %.2f", nomeProcessos.get(i).getNome(), nomeProcessos.get(i).getUsoCpu(), nomeProcessos.get(i).getUsoMemoria()), // Mensagem exibida no pop-up
                                "Stabillis", // Título da janela do pop-up
                                JOptionPane.YES_NO_OPTION, // Tipo de botões (SIM e NÃO)
                                JOptionPane.ERROR_MESSAGE, // Tipo de ícone (interrogação)
                                null, // Ícone personalizado (null indica que usaremos o padrão)
                                new Object[]{"Encerrar o processo", "Não encerrar o processo"}, // Texto dos botões
                                "Botão 1" // Botão padrão selecionado
                        );

                        // Verifica qual botão foi selecionado
                        if (option == JOptionPane.YES_OPTION) {
                            // Código para o Botão 1
                            try {
                                System.out.println(Runtime.getRuntime().exec("kill -9 " + nomeProcessos.get(i).getPid()));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            JOptionPane.showMessageDialog(null, "Sucesso! Processo encerrado.");

                        } else if (option == JOptionPane.NO_OPTION) {
                            // Código para o Botão 2
                            JOptionPane.showMessageDialog(null, "Ok, você optou  por não encerrar o processo. Obrigado!");
                        }
                    }
                }
                    }

    }

