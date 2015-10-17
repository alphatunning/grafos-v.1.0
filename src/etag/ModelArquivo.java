package etag;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author Keyla
 */
public class ModelArquivo {
    
    public static void main(){
    
    /* Modelo de como deve ser inserido o caminho caso ele não esteja na raiz*/
   //Path caminho = Paths.get("C:/Users/Keyla/Desktop/Grafo - Facebook.txt");
        
        /*Neste caso o arquivo Grafo - Facebook.txt tem que estar dentro da pasta e-TAG*/
        Path caminho = Paths.get("./Grafo - Facebook.txt");  
    
   try{
         byte[] texto = Files.readAllBytes(caminho);
         String leitura = new String(texto);
         
         //Verifica se o arquivo está vazio
	 if (texto.length == 0){
              JOptionPane.showMessageDialog(null,
	      "Erro na leitura do arquivo. Arquivo 'Grafos - Facebook.txt' está vazio, favor adicionar dados no arquivo. Obrigado!",
	      "Erro", JOptionPane.ERROR_MESSAGE);
	  } //fecho o if (file.length == 0) 
         else {
             
               /*Esta parte apenas mostra o que está no arquivo
                para não mostrar basta comentar*/
                JOptionPane.showMessageDialog(null, leitura);
               }
         } catch(Exception erro){
              //Verifica se o arquivo está no diretório correto
              JOptionPane.showMessageDialog(null,
	      "Erro na leitura do arquivo. Favor verificar se o arquivo 'Grafo - Facebook.txt' consta na pasta 'e-TAG' do sistema. Caso não conste, favor adicioná-lo. Obrigado!",
	      "Erro", JOptionPane.ERROR_MESSAGE);
       }
    }   
}
