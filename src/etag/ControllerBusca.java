/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author brusg
 */
public class ControllerBusca {
    
    private ArrayList<Vertice> listaVisitados;
    private ArrayList<ParVertice> listaParVertices;
    private Grafo G;
    private String tipoBusca;
    public ArrayList<Item> listaExplorados;
    
     public ControllerBusca(String tipoBusca) {
        listaVisitados = new ArrayList<Vertice>();
        G = new Grafo();
        this.tipoBusca = tipoBusca;
        listaExplorados = new ArrayList<Item>();
    }

    public ArrayList<ParVertice> getListaParVertices() {
        return listaParVertices;
    }

    public void setListaParVertices(ArrayList<ParVertice> listaParVertices) {
        this.listaParVertices = listaParVertices;
    }
 
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
      
    //procedimento Busca(G: Grafo)
    public void Busca(Grafo G){
 
        listaVisitados = new ArrayList<Vertice>();
        listaParVertices = new ArrayList<ParVertice>();
        this.G = G;

        
            
        //Para Cada vértice v de G:
        for (Vertice v : G.getMapaVertices().values() ){

            for (Vertice x : G.getMapaVertices().values() ){
                Item j = new Item(x.getItem());
                j.setCores("black,white");
                this.listaExplorados.add(j);  
            }
            
                //parâmetro para indicar o tipo da busca
                if (!tipoBusca.isEmpty() && tipoBusca.equals("P")){    
                    
                    if(!listaVisitados.contains(v)){
                       BuscaProfundidade(v); 

//                       adicionar à lista de Arvores. Pra depois lá fora descobrir qual das arvores é o maior componente
                    }
                }else if (!tipoBusca.isEmpty() && tipoBusca.equals("L")){
                    BuscaLargura(v); 

                }

        }

    }
    
    //procedimento Busca-Largura(v: vértice)
    public void BuscaLargura(Vertice v){ 
        //Inicializar F
        List<Vertice> Fila = new LinkedList<Vertice>();
        listaVisitados = new ArrayList<Vertice>();
        String UltimoVerticeNivel;
        int nivel = 0;
        
        //Marcar v com a cor cinza
        listaVisitados.add(v);
        Item j = new Item(v.getItem());
        j.setCores("gray"); 
        this.listaExplorados.add(j);
        
        
        //Colocar v no final de F
        Fila.add(v); //Quem tá na fila é a galera que tá esperando pra explorar
        //todos os seus vértices adjacentes.
        UltimoVerticeNivel = v.getID();
        
        nivel = 1;
        //Enquanto F não vazio:
        while (!Fila.isEmpty()){
            
            //u = primeiro elemento de F
            String u = Fila.get(0).getID(); 
            
            //Para cada vértice w adjacente a u:
            for (Vertice w : G.getVerticesAdjacentes(u)){
                
                //Se w não foi visitado:
                if (!listaVisitados.contains(w)){
                                      
                    if (ManipularPar(v.getID(), w.getID(), nivel)){
                        j = new Item(w.getItem());
                        j.setCores("red,white"); 
                        this.listaExplorados.add(j);
                    }
                                        
                    //Marcar w com a cor cinza
                    
                    listaVisitados.add(w);    
                    j = new Item(w.getItem());
                    j.setCores("gray"); 
                    this.listaExplorados.add(j);
                    
                    //Colocar w no final de F
                    Fila.add(w);
                }
            }    
            
            //Marcar u com cor Preta
            j = new Item(Fila.get(0).getItem());
            j.setCores("black"); 
            this.listaExplorados.add(j);
            
            
            //Se o primeiro da fila for o último vértice do nivel anterior 
            //é porque a fila estará prestes a removê-lo e mudar de nível
            if (Fila.get(0).getID().equals(UltimoVerticeNivel)){
                nivel++;
                UltimoVerticeNivel = Fila.get((Fila.size()-1)).getID();
            }
            
            //Retirar u de F
            Fila.remove(0); 
            
        }
    }
    
    //procedimento Busca-Prof(v: vértice)
    public void BuscaProfundidade(Vertice v){
        
        //Marque v com cor cinza
        Item vertice = new Item(v.getItem());
        vertice.setCores("black,gray");
        this.listaExplorados.add(vertice); 
        this.listaVisitados.add(v);
        
        for (Vertice w : G.getVerticesAdjacentes(v.getID())){
            if (!listaVisitados.contains(w)){
                BuscaProfundidade(w);
            }
        }
             
        vertice = new Item(v.getItem());
        vertice.setCores("black");
        this.listaExplorados.add(vertice); 
    }
    
    
    public boolean ManipularPar(String Va, String Vb, int geodesica){
        
        if (!this.listaParVertices.isEmpty()){
            
            for (ParVertice v: this.listaParVertices){

                //se aquele vertice existir 
                if ((v.getVa().equals(Va) && v.getVb().equals(Vb)) 
                    || (v.getVa().equals(Vb) && v.getVb().equals(Va))){
                    if (geodesica < v.getGeodesica()){
                        v.setGeodesica(geodesica);
                        return true;
                    }
                    else{
                        return false;
                    }
                }
            }
            
        }
        listaParVertices.add(new ParVertice(Va, Vb, geodesica));

        return true;//lançar exceção
    }
}