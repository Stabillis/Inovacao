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
                    if(nomeProcessos.get(i).getUsoCpu()> 75 || nomeProcessos.get(i).getUsoMemoria() > 90){
                System.out.println(nomeProcessos.get(i));
            int option = JOptionPane.showOptionDialog(
                null, // Componente pai (null indica que não temos um componente pai)
                "Escolha uma opção", // Mensagem exibida no pop-up
                "Pop-up com Botões", // Título da janela do pop-up
                JOptionPane.YES_NO_OPTION, // Tipo de botões (SIM e NÃO)
                JOptionPane.QUESTION_MESSAGE, // Tipo de ícone (interrogação)
                null, // Ícone personalizado (null indica que usaremos o padrão)
                new Object[]{"Botão 1", "Botão 2"}, // Texto dos botões
                "Botão 1" // Botão padrão selecionado
        );

        // Verifica qual botão foi selecionado
        if (option == JOptionPane.YES_OPTION) {
            // Código para o Botão 1
            
            try {
                System.out.println(Runtime.getRuntime().exec("kill -9 7073"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Obrigado! Processo encerrado.");
            
            
        } else if (option == JOptionPane.NO_OPTION) {
            // Código para o Botão 2
            System.out.println("Obrigado! Processo não encerrado.");
        }
    }
                
            }
        }

    }

