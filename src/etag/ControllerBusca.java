/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author brusg
 */
public class ControllerBusca {

    public ArrayList<Vertice> getListaVisitados() {
        return listaVisitados;
    }

    public void setListaVisitados(ArrayList<Vertice> listaVisitados) {
        this.listaVisitados = listaVisitados;
    }

    public Grafo getG() {
        return G;
    }

    public void setG(Grafo G) {
        this.G = G;
    }

    public String getTipoBusca() {
        return tipoBusca;
    }

    public void setTipoBusca(String tipoBusca) {
        this.tipoBusca = tipoBusca;
    }

    private ArrayList<Vertice> listaVisitados;
    private Grafo G;
    private String tipoBusca;
   
    public ControllerBusca(String tipoBusca) {
        listaVisitados = new ArrayList<Vertice>();
        G = new Grafo();
        this.tipoBusca = tipoBusca;
    }
    
    //procedimento Busca(G: Grafo)
    public void Busca(Grafo G){
        try
        {
            listaVisitados = new ArrayList<Vertice>();
            this.G = G;

            //Para Cada vértice v de G:
            for (Vertice v : G.getMapaVertices().values() ){
                //Marque v com cor branca
                v.setCores("FFF"); //TODO: Verificar como colore nesse etag maluco do Môs.
            }


            //Para Cada vértice v de G:
            for (Vertice v : G.getMapaVertices().values() ){
                //Se v não foi visitado:
                if(!listaVisitados.contains(v)){
                    
                    //parâmetro para indicar o tipo da busca
                    if (!tipoBusca.isEmpty() && tipoBusca.equals("P")){
                    
                        BuscaProfundidade(v);
                        
                    }else if (!tipoBusca.isEmpty() && tipoBusca.equals("L")){
                        
                        BuscaLargura(v); 
                        
                    }else{
                    
                        throw new Exception("Tipo de busca mal definido amiguinho!");
                        
                    }
                    
                }
        }
        }
        catch (Exception e){
            e.getMessage(); //dar Print nesse cara aqui
        }
            
    }
    
    //procedimento Busca-Largura(v: vértice)
    public void BuscaLargura(Vertice v){ 
        
        //Inicializar F
        List<Vertice> Fila = new LinkedList<Vertice>();
        
        //Marcar v com a cor cinza
        v.setCores("Cinza");//TODO: Verificar essa cor também.
        listaVisitados.add(v);
        
        //DÚVIDA: Para um vertice ir pra lsita de visitados, basta ficar cinza? ou Preto?

        //Colocar v no final de F
        Fila.add(v); //Quem tá na fila é a galera que tá esperando pra explorar
        //todos os seus vértices adjacentes.
        
        //Enquanto F não vazio:
        while (Fila.isEmpty()){
            
            //u = primeiro elemento de F
            Vertice u = new Vertice(Fila.get(0)); 
                                   
            //Para cada vértice w adjacente a u:
            for (Vertice w : G.getVerticesAdjacentes(u.getID())){
                
                //Se w não foi visitado:
                if (!listaVisitados.contains(w)){
                    
                    //Marcar w com a cor cinza
                    w.setCores("Cinza");
                    listaVisitados.add(w);     
                    
                    //Colocar w no final de F
                    Fila.add(w);
                }
            }    
            
            //Retirar u de F
            Fila.remove(u); //ou Fila.remove(0); 
   
            //Marcar u com cor Preta
            u.setCores("Heriklys");
        }
    }
    
    //procedimento Busca-Prof(v: vértice)
    public void BuscaProfundidade(Vertice v){
        
        //Marque v com cor cinza
        v.setCores("cinza");
        
        for (Vertice w : G.getVerticesAdjacentes(v.getID())){
            if (!listaVisitados.contains(w)){
                BuscaProfundidade(w);
            }
        }
        
        v.setCores("preto");
        
    }
    
}