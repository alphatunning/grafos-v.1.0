/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etag;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author FlavioTavares
 */
public class TagVertice {
    
    private String ID;
    private int Valor;
    private List<TagVertice> ListaVerticesAdjacentes;
    private List<TagAresta> ListaArestasIncidentes;
    
    public TagVertice (int aValor, String aID)
    {
        this.ListaVerticesAdjacentes = new ArrayList<TagVertice>();
        this.ListaArestasIncidentes = new ArrayList<TagAresta>();
        
        this.ID = aID;
        this.Valor = aValor;
        
    }
    
    public void adicionarArestaIncidente(TagAresta aAresta){
        this.ListaArestasIncidentes.add(aAresta);
    }
    
    public void adicionarVerticeAdjacente(TagVertice aVertice){
        this.ListaVerticesAdjacentes.add(aVertice);
    }
    
    /*
    public TagVertice(Vertice aVertice, Set<Vertice> aSetVertice, Set<Aresta> aSetAresta)
    {
        this.ID = aVertice.getID();
        this.Valor = aVertice.getValor();
        
        this.ListaVerticesAdjacentes = new ArrayList<TagVertice>();
        this.ListaArestasIncidentes = new ArrayList<TagAresta>();
        
        for (Vertice v : aSetVertice){
            this.ListaVerticesAdjacentes.add(new TagVertice(v));
        }
        
        //MatIncid[new Integer(aVertice.getValor())][];
        
        
//this.ListaArestasIncidentes = 
        this.Grau = getGrau();
        
    }
    
    public TagVertice(Vertice aVertice){
        this.ID = aVertice.getID();
        this.Valor = aVertice.getValor();
    }
    */    

    public List<TagVertice> getListaVerticesAdjacentes() {
        return ListaVerticesAdjacentes;
    }

    public List<TagAresta> getListaArestasIncidentes() {
        return ListaArestasIncidentes;
    }

    public String getID() {
        return ID;
    }

    public int getValor() {
        return Valor;
    }
}
