package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class VerificarArquivos {
    public static void main(String[] args) {
        // Caminhos corretos fornecidos
        String arquivo1 = "C:\\Users\\joseb\\OneDrive\\Desktop\\ajudarisaac\\arquivoaconsultar.txt"; // Caminho do primeiro arquivo
        String arquivo2 = "C:\\Users\\joseb\\OneDrive\\Desktop\\ajudarisaac\\lista_arquivos_existente4097.txt";  // Caminho do segundo arquivo
        String arquivoNaoEncontrados = "C:\\Users\\joseb\\OneDrive\\Desktop\\ajudarisaac\\arquivos_nao_encontrados.txt";  // Caminho do arquivo de saída

        try {
            // Carregar os nomes dos arquivos do segundo TXT em um Set para comparação rápida
            Set<String> arquivosNoSegundoTxt = carregarArquivosDoSegundoTxt(arquivo2);

            // Criar o arquivo de saída para os arquivos não encontrados
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoNaoEncontrados));

            // Verificar os arquivos do primeiro TXT e escrever os não encontrados no arquivo de saída
            verificarArquivosNoPrimeiroTxt(arquivo1, arquivosNoSegundoTxt, writer);

            // Fechar o escritor após o processo
            writer.close();

            System.out.println("Processo concluído. Arquivos não encontrados foram salvos em: " + arquivoNaoEncontrados);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Função para carregar os arquivos do segundo TXT em um Set
    private static Set<String> carregarArquivosDoSegundoTxt(String arquivo2) throws IOException {
        Set<String> arquivosNoSegundoTxt = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo2))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                arquivosNoSegundoTxt.add(linha.trim().toLowerCase()); // Adiciona os arquivos no Set (em minúsculas)
            }
        }
        return arquivosNoSegundoTxt;
    }

    // Função para verificar os arquivos do primeiro TXT e escrever os não encontrados em um arquivo de saída
    private static void verificarArquivosNoPrimeiroTxt(String arquivo1, Set<String> arquivosNoSegundoTxt, BufferedWriter writer) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo1))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Remover o prefixo "- " (caso exista) e converter para minúsculo
                String nomeArquivo = linha.trim().replaceFirst("^\\-\\s*", "").toLowerCase();

                if (arquivosNoSegundoTxt.contains(nomeArquivo)) {
                    System.out.println("Arquivo encontrado: " + nomeArquivo);
                } else {
                    System.out.println("Arquivo não encontrado: " + nomeArquivo);
                    // Escreve o nome do arquivo que não foi encontrado no arquivo de saída
                    writer.write(nomeArquivo + System.lineSeparator());
                }
            }
        }
    }
}
