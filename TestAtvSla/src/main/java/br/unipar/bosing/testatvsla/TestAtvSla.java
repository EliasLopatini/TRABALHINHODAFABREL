/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.bosing.testatvsla;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 00236544
 */
public class TestAtvSla {

    public static void main(String[] args) {
       //SELECIONANDO ONDE EU QUERO CRIAR A PASTA COLOCANDO O CAMINHO PARA CRIAR ELA
        String pasta = "C:/Users/00236544/pasta1/";
       //CRIANDO UM ARQUIVO DE TEXTO
        String nomeArquivo = "tabuada.txt";

        File pastaArquivos = new File(pasta);

        //CRIAR A PASTA SE ELA NAO EXISTIR
        if (!pastaArquivos.exists()) {
            if (pastaArquivos.mkdirs()) {
                System.out.println("Pasta criada com sucesso!");
                //PASTA CRIADA COM SUCESSO
            } else {
                System.out.println("Falha ao criar a pasta.");
                return;
                //ENCERRA O PROGRAMA SE NAO FOR POSSIVEL CRIAR A PASTA
            }
        }
        //PUXO A PASTA E O ARQUIVO QUE CRIEI LA EM CIMA
        File arquivo = new File(pasta + nomeArquivo);

        try {
            // CRIO O ARQUIVO
            arquivo.createNewFile();
            System.out.println("Arquivo criado com sucesso!");

            // LAÇO DA TABUADA
            FileWriter writer = new FileWriter(arquivo);
            for (int i = 1; i <= 10; i++) {
                int resultado = 9 * i;
                writer.write("9 x " + i + " = " + resultado + "\n");
            }
            writer.close();

            // LE O ARQUIVO E IMPRIME ELE NO CONSOLE
            Scanner scanner = new Scanner(arquivo);
            System.out.println("Conteúdo do arquivo:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();

            // EXCLUI O ARQUIVO
            if (arquivo.delete()) {
                System.out.println("Arquivo excluído com sucesso!");
            } else {
                System.out.println("Falha ao excluir o arquivo.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
    

