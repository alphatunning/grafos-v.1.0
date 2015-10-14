/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etag;

import java.util.ArrayList;
import java.util.List;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author FlavioTavares
 */
public class TagGrafo {

    private ArrayList<TagVertice> ListaVertices;
    private ArrayList<TagAresta> ListaArestas;
    private ArrayList<TagAresta> ListaArestasCiclo;
    private ArrayList<TagVertice> ListaVerticesCiclo;
    private int MatrizAdjacenciaGrafo[][];
    private int MatrizAdjacenciaDigrafo[][];
    private int MatrizIncidenciaGrafo[][];
    private int MatrizIncidenciaDigrafo[][];

    public TagGrafo(List<Vertice> aListaVertices, List<Aresta> aListaArestas) {
        this.ListaArestas = new ArrayList<TagAresta>();
        this.ListaVertices = new ArrayList<TagVertice>();
        this.ListaArestasCiclo = new ArrayList<TagAresta>();
        this.ListaVerticesCiclo = new ArrayList<TagVertice>();

        for (Vertice vertice : aListaVertices) {
            TagVertice tv = new TagVertice(Integer.parseInt(vertice.getValor()), vertice.getID());
            this.ListaVertices.add(tv);
        }

        TagVertice verticePartida = null;
        TagVertice verticeDestino = null;

        for (Aresta aresta : aListaArestas) {
            for (TagVertice tv : this.ListaVertices) {
                if (aresta.getPartida().getID().equals(tv.getID())) {
                    verticePartida = tv;
                }

                if (aresta.getDestino().getID().equals(tv.getID())) {
                    verticeDestino = tv;
                }
            }

            TagAresta ta = new TagAresta(Integer.parseInt(aresta.getValor()), aresta.getID(), verticePartida, verticeDestino);

            this.ListaArestas.add(ta);

            verticeDestino.adicionarArestaIncidente(ta);
            verticePartida.adicionarArestaIncidente(ta);
            verticeDestino.adicionarVerticeAdjacente(verticePartida);
            verticePartida.adicionarVerticeAdjacente(verticeDestino);

        }

        inicializaMatrizAdjacenciaDigrafo();
        inicializaMatrizAdjacenciaGrafo();
        inicializaMatrizIncidenciaDigrafo();
        inicializaMatrizIncidenciaGrafo();
    }
    /*
     public TagGrafo(Grafo aGrafo) {
     inicializaMatrizAdjacenciaDigrafo(aGrafo);
     inicializaMatrizAdjacenciaGrafo(aGrafo);
     inicializaMatrizIncidenciaDigrafo(aGrafo);
     inicializaMatrizIncidenciaGrafo(aGrafo);
        
     this.ListaArestas = new ArrayList<TagAresta>();
     this.ListaVertices = new ArrayList<TagVertice>();
        
     for (Aresta aresta : aGrafo.getArestasGraficas().values()) {
     this.ListaArestas.add(new TagAresta(aresta));
     }

     for (Vertice vertice : aGrafo.getMapaVertices().values()) {
     this.ListaVertices.add(new TagVertice(vertice, aGrafo.getVerticesAdjacentes(vertice.getID()), aGrafo.getArestasAdjacentes(vertice.getID())));
     }
     //listaArestas.addall(aGrafo.getArestasGraficas().values());
     //inicializaListaVertice();
     /*
     this.ListaVertices = ListaVertices;
     this.ListaArestas = ListaArestas;
     this.ListaArestasCiclo = ListaArestasCiclo;
     this.MatrizAdjacencia = MatrizAdjacencia;
     this.MatrizIncidencia = MatrizIncidencia;
     for (Aresta aresta : aGrafo.getArestasGraficas().values())
     {
     new TagAresta(aresta);
            
     }
     for (Vertice vertice : aGrafo.getMapaVertices().values()){
     new TagVertice(vertice);
     }
         
     }
     */

    public void inicializaMatrizAdjacenciaGrafo() {

        int numeroVertices = this.ListaVertices.size();//aGrafo.getMapaVertices().keySet().size();
        this.MatrizAdjacenciaGrafo = new int[numeroVertices][numeroVertices];

        for (int i = 0; i <= MatrizAdjacenciaGrafo.length - 1; i++) {

            for (int j = 0; j <= MatrizAdjacenciaGrafo.length - 1; j++) {

                if ((this.MatrizAdjacenciaDigrafo[i][j] == 1) && (this.MatrizAdjacenciaDigrafo[j][i] == 1)) {
                    MatrizAdjacenciaGrafo[i][j] = 2;
                } else if ((this.MatrizAdjacenciaDigrafo[i][j] == 1) && (this.MatrizAdjacenciaDigrafo[j][i] == 0)) {
                    MatrizAdjacenciaGrafo[i][j] = 1;
                } else if ((this.MatrizAdjacenciaDigrafo[i][j] == 0) && (this.MatrizAdjacenciaDigrafo[j][i] == 1)) {
                    MatrizAdjacenciaGrafo[i][j] = 1;
                } else {
                    MatrizAdjacenciaGrafo[i][j] = 0;
                }

            }

        }

    }

    public int[][] getMatrizAdjacenciaGrafo() {
        return this.MatrizAdjacenciaGrafo;
    }

    public void inicializaMatrizAdjacenciaDigrafo() {

        int numeroVertices = this.ListaVertices.size();//aGrafo.getMapaVertices().keySet().size();
        this.MatrizAdjacenciaDigrafo = new int[numeroVertices][numeroVertices];

        for (TagAresta aresta : this.ListaArestas/*aGrafo.getArestasGraficas().values()*/) {

            int partida = new Integer(aresta.getVerticeOrigem().getValor());
            int destino = new Integer(aresta.getVerticeDestino().getValor());

            this.MatrizAdjacenciaDigrafo[partida - 1][destino - 1] = 1;
        }

    }

    public int[][] getMatrizAdjacenciaDigrafo() {
        return this.MatrizAdjacenciaDigrafo;
    }

    public void inicializaMatrizIncidenciaDigrafo() {
        int numeroVertices = this.ListaVertices.size();//aGrafo.getMapaVertices().keySet().size();
        int numeroArestas = this.ListaArestas.size();//aGrafo.getArestasGraficas().size();

        this.MatrizIncidenciaDigrafo = new int[numeroArestas][numeroVertices];
        int contvertice = 0;

        int valorAresta[] = new int[numeroArestas];
        int valorVertice[] = new int[numeroVertices];

        int m = 0;
        for (TagVertice vertice : this.ListaVertices/*aGrafo.getMapaVertices().values()*/) {
            valorVertice[m] = vertice.getValor();
            m = m + 1;
        }

        int k = 0;
        for (TagAresta aresta : this.ListaArestas/*aGrafo.getArestasGraficas().values()*/) {
            int partida = new Integer(aresta.getVerticeOrigem().getValor());
            int destino = new Integer(aresta.getVerticeDestino().getValor());

            this.MatrizIncidenciaDigrafo[contvertice][partida - 1] = 1;
            this.MatrizIncidenciaDigrafo[contvertice][destino - 1] = -1;

            contvertice = contvertice + 1;

            valorAresta[k] = aresta.getValor();
            k = k + 1;
        }

    }

    public int[][] getMatrizIncidenciaDigrafo() {
        return this.MatrizIncidenciaDigrafo;
    }

    public void inicializaMatrizIncidenciaGrafo() {
        int numeroVertices = this.ListaVertices.size();//aGrafo.getMapaVertices().keySet().size();
        int numeroArestas = this.ListaArestas.size();//aGrafo.getArestasGraficas().size();

        this.MatrizIncidenciaGrafo = new int[numeroArestas][numeroVertices];
        int contvertice = 0;

        int valorAresta[] = new int[numeroArestas];
        int valorVertice[] = new int[numeroVertices];

        int m = 0;
        for (TagVertice vertice : this.ListaVertices/*aGrafo.getMapaVertices().values()*/) {
            valorVertice[m] = vertice.getValor();
            m = m + 1;
        }

        int k = 0;
        for (TagAresta aresta : this.ListaArestas/*aGrafo.getArestasGraficas().values()*/) {
            int partida = new Integer(aresta.getVerticeOrigem().getValor());
            int destino = new Integer(aresta.getVerticeDestino().getValor());

            this.MatrizIncidenciaGrafo[contvertice][partida - 1] = 1;
            this.MatrizIncidenciaGrafo[contvertice][destino - 1] = 1;

            contvertice = contvertice + 1;

            valorAresta[k] = aresta.getValor();
            k = k + 1;
        }
    }

    public int[][] getMatrizIncidenciaGrafo() {
        return this.MatrizIncidenciaGrafo;
    }

    public void inicializaListaVertice(Grafo aGrafo) {
        for (Vertice vertice : aGrafo.getMapaVertices().values()) {

        }
    }

    public ArrayList<TagVertice> getListaVertices() {
        return ListaVertices;
    }

    public void setListaVertices(ArrayList<TagVertice> ListaVertices) {
        this.ListaVertices = ListaVertices;
    }

    public ArrayList<TagAresta> getListaArestas() {
        return ListaArestas;
    }

    public void setListaArestas(ArrayList<TagAresta> ListaArestas) {
        this.ListaArestas = ListaArestas;
    }

    public ArrayList<TagVertice> getListaVerticesCiclo() {
        return ListaVerticesCiclo;
    }

    public boolean VerificarCiclo(TagVertice aVertice, ArrayList<TagVertice> aVerticesVisitados, TagVertice aVerticeOrigem) {

        for (TagAresta aresta : this.getListaArestas()) {
            if (aresta.getVerticeOrigem().equals(aVerticeOrigem) && aresta.getVerticeDestino().equals(aVertice)
                    || aresta.getVerticeOrigem().equals(aVertice) && aresta.getVerticeDestino().equals(aVerticeOrigem)) {
                this.ListaArestasCiclo.add(aresta);
            }
        }

        aVerticesVisitados.add(aVertice);
        this.ListaVerticesCiclo.add(aVertice);

        for (TagVertice vertice : aVertice.getListaVerticesAdjacentes()) {
            if (vertice != aVerticeOrigem) {
                /*
                for (TagAresta aresta : this.getListaArestas()) {
                    if (aresta.getVerticeOrigem().equals(aVerticeOrigem) && aresta.getVerticeDestino().equals(aVertice)
                            || aresta.getVerticeOrigem().equals(aVertice) && aresta.getVerticeDestino().equals(aVerticeOrigem)) {
                        this.ListaArestasCiclo.add(aresta);
                    }
                }
                */
                if (!aVerticesVisitados.contains(vertice)) {
                    if (VerificarCiclo(vertice, aVerticesVisitados, aVertice)) {
                        return true;
                    }
                } else {
                    if (aVertice != aVerticeOrigem)
                        return true;
                    
                }
            }
        }
        return false;
    }

    public List<TagAresta> getListaArestasCiclo() {
        return ListaArestasCiclo;
    }

    public void RemoveAresta() {
        for (TagAresta arestaCiclo : this.ListaArestasCiclo) {
            for (TagAresta aresta : this.getListaArestas()) {
                if (arestaCiclo.getID().equals(aresta.getID())) {
                    this.getListaArestas().remove(aresta);
                }
            }
        }
    }

    //Verifica se existem par vértices de grau ímpar
    public boolean VerificaParVerticesGrauImpar() {
        int cont = 0;

        for (TagVertice vertice : this.getListaVertices()) {
            if (vertice.getListaArestasIncidentes().size() % 2 != 0) {
                cont++; //Para cada vértice de grau impar
            }
        }

        if (cont % 2 == 0 && cont != 0) {
            return true;
        }

        return false;
    }

    //Verifica se todos os vértices possuem grau par
    public boolean VerificaVerticesGrauPar() {
        int cont = 0;

        for (TagVertice vertice : this.getListaVertices()) {
            if (vertice.getListaArestasIncidentes().size() % 2 == 0) {
                cont++; //Para cada vértice de grau par 
            }
        }

        if (getListaVertices().size() == cont) //Se todos os vértices possuem grau par
        {
            return true;
        }

        return false;
    }

    //Verifica se o grafo é conexo
    public boolean VerificaConexibilidade() {
        List<TagVertice> Visitados = new ArrayList<TagVertice>();

        for (TagVertice vertice : this.getListaVertices()) {
            for (TagVertice va : vertice.getListaVerticesAdjacentes()) {
                //if va já tá dentro de visitados, então não poe.
                if (!Visitados.contains(va)) {
                    Visitados.add(va);
                }
            }
        }

        if (Visitados.size() == this.getListaVertices().size()) {
            return true;
        }

        return false;
    }

}
