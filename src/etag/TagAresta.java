/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etag;

/**
 *
 * @author FlavioTavares
 */
public class TagAresta {
    
    private String ID;
    private int Valor;
    private TagVertice VerticeOrigem;
    private TagVertice VerticeDestino;

    public TagAresta(int aValor, String aID, TagVertice aVerticePartida, TagVertice aVerticeDestino){
        this.ID = aID;
        this.Valor = aValor;
        this.VerticeOrigem = aVerticePartida;
        this.VerticeDestino = aVerticeDestino;
    }
    
    /*
    public TagAresta(Aresta aAresta) {
        this.ID = aAresta.getID();
        this.Valor = aAresta.getValor();
        this.VerticeOrigem = aAresta.getPartida().getID();
        this.VerticeDestino = aAresta.getDestino().getID();
        //this.VerticeOrigem = aAresta.getPartida();
        //this.VerticeDestino = aAresta.getDestino();
    }
    */
    public String getID() {
        return ID;
    }

    public int getValor() {
        return Valor;
    }

    public TagVertice getVerticeOrigem() {
        return VerticeOrigem;
    }

    public TagVertice getVerticeDestino() {
        return VerticeDestino;
    }
    
}
