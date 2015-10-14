package etag;

import console.JPrompt;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Classe principal da ferramenta e-TAG para controle de eventos na janela.
 *
 * @author Professor Moises Henrique Ramos Pereira
 * @version 3.0
 */
public class Principal extends etag.Controladora {

    /**
     * Método construtor da tela principal da ferramenta e-TAG.
     *
     */
    public Principal() {
        initComponents();
        this.jPanel1.add(this.grafoComponente, 0);
        this.setContentPane(this.jPanelFundo);
        this.ChkGrafoDirecionado.setSelected(this.grafo.getDirecionado());
        /*
         List<TagVertice> listaVertice = new ArrayList<TagVertice>();
         List<TagAresta> listaAresta = new ArrayList<TagAresta>();

         for (Vertice vertice : this.grafo.getMapaVertices().values()) {
         listaVertice.add(new TagVertice(vertice));
         }

         for (Aresta aresta : this.grafo.getArestasGraficas().values()) {
         listaAresta.add(new TagAresta(aresta));
         }*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelFundo = new javax.swing.JPanel();
        ToolBarGrafo = new javax.swing.JToolBar();
        Salvar = new javax.swing.JButton();
        Proximo = new javax.swing.JButton();
        AdicionarAresta = new javax.swing.JButton();
        ChkGrafoDirecionado = new javax.swing.JCheckBox();
        lblGrafoDirecionado = new javax.swing.JLabel();
        RadBtnAdicionarVertice = new javax.swing.JRadioButton();
        lblAdicionarVertice = new javax.swing.JLabel();
        RadBtnRemoverVertice = new javax.swing.JRadioButton();
        lblRemoverItem = new javax.swing.JLabel();
        RadBtnProsseguirTrabalho = new javax.swing.JRadioButton();
        lblProsseguirTrabalho = new javax.swing.JLabel();
        Tela = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        MenuToolbar = new javax.swing.JMenuBar();
        MenuAlgoritmos = new javax.swing.JMenu();
        AGMPrim = new javax.swing.JMenuItem();
        AGMKruskal = new javax.swing.JMenuItem();
        BuscaProfundidade = new javax.swing.JMenuItem();
        BuscaLargura = new javax.swing.JMenuItem();
        Dijkstra = new javax.swing.JMenuItem();
        MenuAnimacoes = new javax.swing.JMenu();
        ColoreVertices = new javax.swing.JMenuItem();
        ColoreArestas = new javax.swing.JMenuItem();
        ColoreVerticesArestas = new javax.swing.JMenuItem();
        MenuSobre = new javax.swing.JMenu();
        Professores = new javax.swing.JMenuItem();
        ETag = new javax.swing.JMenuItem();
        MenuTrabalhoPratico = new javax.swing.JMenu();
        Euleriano = new javax.swing.JMenuItem();
        Unicursal = new javax.swing.JMenuItem();
        Hierholzer = new javax.swing.JMenuItem();
        MatrizAdj = new javax.swing.JMenuItem();
        MatrizIncidente = new javax.swing.JMenuItem();

        jToolBar2.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("e-TAG: Ensino de Teoria Aplicada em Grafos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(330, 530));

        jPanelFundo.setLayout(new java.awt.BorderLayout());

        ToolBarGrafo.setFloatable(false);
        ToolBarGrafo.setRollover(true);

        Salvar.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        Salvar.setText("Salvar");
        Salvar.setFocusable(false);
        Salvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Salvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        ToolBarGrafo.add(Salvar);

        Proximo.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        Proximo.setText("Next");
        Proximo.setFocusable(false);
        Proximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Proximo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProximoActionPerformed(evt);
            }
        });
        ToolBarGrafo.add(Proximo);

        AdicionarAresta.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        AdicionarAresta.setText("Adicionar Aresta");
        AdicionarAresta.setFocusable(false);
        AdicionarAresta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdicionarAresta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AdicionarAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarArestaActionPerformed(evt);
            }
        });
        ToolBarGrafo.add(AdicionarAresta);

        ChkGrafoDirecionado.setFocusable(false);
        ChkGrafoDirecionado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ChkGrafoDirecionado.setMargin(new java.awt.Insets(0, 30, 0, 0));
        ChkGrafoDirecionado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ChkGrafoDirecionado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ChkGrafoDirecionadoItemStateChanged(evt);
            }
        });
        ToolBarGrafo.add(ChkGrafoDirecionado);

        lblGrafoDirecionado.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblGrafoDirecionado.setText("Grafo Direcionado?");
        ToolBarGrafo.add(lblGrafoDirecionado);

        buttonGroup1.add(RadBtnAdicionarVertice);
        RadBtnAdicionarVertice.setFocusable(false);
        RadBtnAdicionarVertice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RadBtnAdicionarVertice.setMargin(new java.awt.Insets(0, 30, 0, 0));
        RadBtnAdicionarVertice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBarGrafo.add(RadBtnAdicionarVertice);

        lblAdicionarVertice.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblAdicionarVertice.setText(" Adicionar Vértice? ");
        ToolBarGrafo.add(lblAdicionarVertice);

        buttonGroup1.add(RadBtnRemoverVertice);
        RadBtnRemoverVertice.setFocusable(false);
        RadBtnRemoverVertice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RadBtnRemoverVertice.setMargin(new java.awt.Insets(0, 30, 0, 0));
        RadBtnRemoverVertice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBarGrafo.add(RadBtnRemoverVertice);

        lblRemoverItem.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblRemoverItem.setText("Remover Itens? ");
        ToolBarGrafo.add(lblRemoverItem);

        buttonGroup1.add(RadBtnProsseguirTrabalho);
        RadBtnProsseguirTrabalho.setSelected(true);
        RadBtnProsseguirTrabalho.setFocusable(false);
        RadBtnProsseguirTrabalho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RadBtnProsseguirTrabalho.setMargin(new java.awt.Insets(0, 30, 0, 0));
        RadBtnProsseguirTrabalho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBarGrafo.add(RadBtnProsseguirTrabalho);

        lblProsseguirTrabalho.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblProsseguirTrabalho.setText("Prosseguir Trabalhando!   ");
        ToolBarGrafo.add(lblProsseguirTrabalho);

        jPanelFundo.add(ToolBarGrafo, java.awt.BorderLayout.PAGE_START);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());
        Tela.addTab("Área de Visualização", jPanel1);

        jTextPane1.setEditable(false);
        jTextPane1.setText("Nesta aba estão descritas as principais funcionalidades do e-TAG:\n\n1) No menu \"Algoritmos\" estão todos os algoritmos de grafos que devem ser implementados pelo usuário. As respectivas funções são abstratas e devem ser implementadas na classe usuária que estender JanelaETAG.java. Elas já estão configuradas com o evento de clique do mouse pela ferramenta.\n\n2) No menu \"Animações\", tem-se as mesmas considerações em 1, porém o código está implementado na classe usuária Principal.java para que os alunos possam estudar o código que permite animações.\n\n3) O menu \"Sobre\" apenas mostra algumas informações sobre a ferramenta e-TAG.\n\n4) Sobre os botões que se encontram logo abaixo da barra de menu: o botão \"Salvar\" apenas salva as informações do grafo atual em um arquivo de texto Grafo.txt; o botão \"Next\" serve para acompanhar passo-a-passo a animação gerada pelos algoritmos; e o botão \"Adionar Aresta\" permite adicionar uma nova aresta no grafo, bastando selecionar dois vértices do diagrama na Área de Visualização e clicar nesse botão.\n\n5) O campo checkbox \"Grafo Direcionado?\", quando marcado, informa que o grafo ali representado no diagrama é um dígrafo, ou seja, as arestas são setas orientadas. Caso contrário, informa que o grafo não é direcionado, cujas arestas não são setas.\n\n6) O campo radio \"Adicionar Vértice?\", quando marcado, permite adicionar vértices no grafo clicando com o mouse dentro da Área de Visualização.\n\n7) O campo radio \"Remover Itens?\", quando marcado, permite deletar vértices ou arestas clicando com o mouse sobre o item gráfico desejado.\n\n8) O campo radio \"Prosseguir Trabalhando!\", quando marcado, permite manipular os vértices e arestas do grafo com o mouse, sem criar novos vértices e sem remover itens com os cliques do mouse. Esses três campos radio são mutuamente exclusivos.\n\n9) A aba \"Área de Visualização\" permite ver e interagir com o diagrama do grafo corrente.");
        jTextPane1.setMaximumSize(new java.awt.Dimension(123, 240));
        jTextPane1.setPreferredSize(new java.awt.Dimension(350, 350));
        jScrollPane1.setViewportView(jTextPane1);

        Tela.addTab("Manual de Uso", jScrollPane1);

        jPanelFundo.add(Tela, java.awt.BorderLayout.CENTER);

        MenuAlgoritmos.setText("Algoritmos");

        AGMPrim.setText("AGM Prim");
        AGMPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGMPrimActionPerformed(evt);
            }
        });
        MenuAlgoritmos.add(AGMPrim);

        AGMKruskal.setText("AGM Kruskal");
        AGMKruskal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGMKruskalActionPerformed(evt);
            }
        });
        MenuAlgoritmos.add(AGMKruskal);

        BuscaProfundidade.setText("Busca em Profundidade");
        BuscaProfundidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaProfundidadeActionPerformed(evt);
            }
        });
        MenuAlgoritmos.add(BuscaProfundidade);

        BuscaLargura.setText("Busca em Largura");
        BuscaLargura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaLarguraActionPerformed(evt);
            }
        });
        MenuAlgoritmos.add(BuscaLargura);

        Dijkstra.setText("Algortimo de Dijkstra");
        Dijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DijkstraActionPerformed(evt);
            }
        });
        MenuAlgoritmos.add(Dijkstra);

        MenuToolbar.add(MenuAlgoritmos);

        MenuAnimacoes.setText("Animações");

        ColoreVertices.setText("Colore todos os vértices");
        ColoreVertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColoreVerticesActionPerformed(evt);
            }
        });
        MenuAnimacoes.add(ColoreVertices);

        ColoreArestas.setText("Colore todas as arestas");
        ColoreArestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColoreArestasActionPerformed(evt);
            }
        });
        MenuAnimacoes.add(ColoreArestas);

        ColoreVerticesArestas.setText("Colore vértices e arestas");
        ColoreVerticesArestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColoreVerticesArestasActionPerformed(evt);
            }
        });
        MenuAnimacoes.add(ColoreVerticesArestas);

        MenuToolbar.add(MenuAnimacoes);

        MenuSobre.setText("Sobre");

        Professores.setText("Professores");
        Professores.setToolTipText("Professores envolvidos no projeto do e-TAG");
        Professores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfessoresActionPerformed(evt);
            }
        });
        MenuSobre.add(Professores);

        ETag.setText("e-TAG");
        ETag.setToolTipText("Descreve os objetivos da ferramenta e-TAG");
        ETag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ETagActionPerformed(evt);
            }
        });
        MenuSobre.add(ETag);

        MenuToolbar.add(MenuSobre);

        MenuTrabalhoPratico.setText("Traballho Prático");

        Euleriano.setText("Verficar Euleriano");
        Euleriano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EulerianoActionPerformed(evt);
            }
        });
        MenuTrabalhoPratico.add(Euleriano);

        Unicursal.setText("Verificar Unicursal");
        Unicursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnicursalActionPerformed(evt);
            }
        });
        MenuTrabalhoPratico.add(Unicursal);

        Hierholzer.setText("Ciclo Euler");
        Hierholzer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HierholzerActionPerformed(evt);
            }
        });
        MenuTrabalhoPratico.add(Hierholzer);

        MatrizAdj.setText("Matriz Adjacência");
        MatrizAdj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatrizAdjActionPerformed(evt);
            }
        });
        MenuTrabalhoPratico.add(MatrizAdj);

        MatrizIncidente.setText("Matriz Incidência");
        MatrizIncidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatrizIncidenteActionPerformed(evt);
            }
        });
        MenuTrabalhoPratico.add(MatrizIncidente);

        MenuToolbar.add(MenuTrabalhoPratico);

        setJMenuBar(MenuToolbar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        this.salvarDados();
    }//GEN-LAST:event_SalvarActionPerformed

    private void ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProximoActionPerformed
        this.processaFuncionalidadeNext();
    }//GEN-LAST:event_ProximoActionPerformed

    private void ChkGrafoDirecionadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ChkGrafoDirecionadoItemStateChanged
        this.alteraEstadoCheckBox();
    }//GEN-LAST:event_ChkGrafoDirecionadoItemStateChanged

    private void AdicionarArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarArestaActionPerformed
        this.adicionaAresta();
    }//GEN-LAST:event_AdicionarArestaActionPerformed

    private void ETagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ETagActionPerformed
        this.exibeSobreETag();
    }//GEN-LAST:event_ETagActionPerformed

    /**
     * Área dos eventos (personalizados ou não) disparados pela ferramenta.
     *
     */
    private void ProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfessoresActionPerformed
        this.exibeSobreProfessores();
    }//GEN-LAST:event_ProfessoresActionPerformed

    private void ColoreVerticesArestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColoreVerticesArestasActionPerformed
        this.animacaoColorirVerticesArestas();
    }//GEN-LAST:event_ColoreVerticesArestasActionPerformed

    private void ColoreArestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColoreArestasActionPerformed
        this.animacaoColorirArestas();
    }//GEN-LAST:event_ColoreArestasActionPerformed

    private void ColoreVerticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColoreVerticesActionPerformed
        this.animacaoColorirVertices();
    }//GEN-LAST:event_ColoreVerticesActionPerformed

    private void DijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DijkstraActionPerformed
        this.algoritmoDijkstra();
    }//GEN-LAST:event_DijkstraActionPerformed

    private void BuscaLarguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaLarguraActionPerformed
        this.algoritmoBuscaLargura();
    }//GEN-LAST:event_BuscaLarguraActionPerformed

    private void BuscaProfundidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaProfundidadeActionPerformed
        this.algoritmoBuscaProfundidade();
    }//GEN-LAST:event_BuscaProfundidadeActionPerformed

    private void AGMKruskalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGMKruskalActionPerformed
        this.algoritmoAGMKruskal();
    }//GEN-LAST:event_AGMKruskalActionPerformed

    private void AGMPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGMPrimActionPerformed
        this.algoritmoAGMPrim();
    }//GEN-LAST:event_AGMPrimActionPerformed

    private void EulerianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EulerianoActionPerformed
        List<Vertice> listaVertices = new ArrayList<Vertice>();
        List<Aresta> listaArestas = new ArrayList<Aresta>();

        listaVertices.addAll(this.grafo.getMapaVertices().values());
        listaArestas.addAll(this.grafo.getArestasGraficas().values());

        TagGrafo grafo = new TagGrafo(listaVertices, listaArestas);

        if (grafo.VerificaConexibilidade() && grafo.VerificaVerticesGrauPar()) {
            JPrompt.printPane("O grafo é Euleriano");
        } else {
            JPrompt.printPane("O grafo não é Euleriano");
        }

    }//GEN-LAST:event_EulerianoActionPerformed

    private void UnicursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnicursalActionPerformed
        List<Vertice> listaVertices = new ArrayList<Vertice>();
        List<Aresta> listaArestas = new ArrayList<Aresta>();

        listaVertices.addAll(this.grafo.getMapaVertices().values());
        listaArestas.addAll(this.grafo.getArestasGraficas().values());

        TagGrafo grafo = new TagGrafo(listaVertices, listaArestas);

        if (grafo.VerificaConexibilidade() && grafo.VerificaParVerticesGrauImpar()) {
            JPrompt.printPane("O grafo é Unicursal");
        } else {
            JPrompt.printPane("O grafo não é Unicursal");
        }
    }//GEN-LAST:event_UnicursalActionPerformed

    private void HierholzerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HierholzerActionPerformed
        List<Vertice> listaVertices = new ArrayList<Vertice>();
        List<Aresta> listaArestas = new ArrayList<Aresta>();

        listaVertices.addAll(this.grafo.getMapaVertices().values());
        listaArestas.addAll(this.grafo.getArestasGraficas().values());

        TagGrafo grafo = new TagGrafo(listaVertices, listaArestas);
        ArrayList<TagAresta> C1 = new ArrayList<TagAresta>();

        if (grafo.VerificaConexibilidade() && grafo.VerificaVerticesGrauPar()) {

            while (grafo.getListaArestas().size() > 1) {

                grafo.VerificarCiclo(grafo.getListaVertices().get(0), new ArrayList<TagVertice>(), grafo.getListaVertices().get(0));

                C1.addAll(grafo.getListaArestasCiclo());
                ArrayList<TagVertice> teste = new ArrayList<TagVertice>();
                teste.addAll(grafo.getListaVerticesCiclo());

                grafo.getListaArestas().removeAll(C1);
                
                for (TagAresta aresta : C1){
                    this.grafo.removeArestaGrafica(aresta.getID(), aresta);
                }
            }
        }
        //For abaixo deverá ser feito antes de exercutar o presente método
        //for (TagVertice vertice : aGrafo.getListaVertices())
        //{
        //    if (this.GrauVertice(vertice))
        //        throw new NotImplementedException();
        //}

        //Pegar ciclo do vértice
        //this.getCiclo(null, null, null);
        //Dar dispose nas arestas desse ciclo
    }//GEN-LAST:event_HierholzerActionPerformed

    private void MatrizAdjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatrizAdjActionPerformed
        List<Vertice> listaVertices = new ArrayList<Vertice>();
        List<Aresta> listaArestas = new ArrayList<Aresta>();

        listaVertices.addAll(this.grafo.getMapaVertices().values());
        listaArestas.addAll(this.grafo.getArestasGraficas().values());

        TagGrafo grafo = new TagGrafo(listaVertices, listaArestas);
        StringBuilder Painel = new StringBuilder();
        int aux;

        if (this.ChkGrafoDirecionado.isSelected() == false) {
            //Então é grafo
            System.out.print("\nGRAFO:\n");
            System.out.print("Matriz de Adjacências:\n\n");

            int numeroVertices = this.grafo.getMapaVertices().keySet().size();
            int matrizAdj[][] = new int[numeroVertices][numeroVertices];
            String valorVertice[] = new String[numeroVertices];
            int m = 0;
            System.out.print("\t");
            for (Vertice vertice : this.grafo.getMapaVertices().values()) {
                valorVertice[m] = vertice.getValor();
                System.out.print("   Vért " + valorVertice[m]);
                m = m + 1;
            }
            System.out.print("\n");

            for (int i = 0; i < this.grafo.getMapaVertices().keySet().size(); i++) {
                System.out.print("Vértice " + valorVertice[i] + ":\t");
                for (int j = 0; j < this.grafo.getMapaVertices().keySet().size(); j++) {
                    System.out.print(grafo.getMatrizAdjacenciaGrafo()[i][j] + "\t");
                }
                System.out.print("\n");
            }

        } else {
            //Então é dígrafo 
            System.out.print("\nDÍGRAFO:\n");
            System.out.print("Matriz de Adjacências:\n\n");

            int numeroVertices = this.grafo.getMapaVertices().keySet().size();
            int matrizAdj[][] = new int[numeroVertices][numeroVertices];
            String valorVertice[] = new String[numeroVertices];
            int m = 0;
            System.out.print("\t");
            for (Vertice vertice : this.grafo.getMapaVertices().values()) {
                valorVertice[m] = vertice.getValor();
                System.out.print("   Vért " + valorVertice[m]);
                m = m + 1;
            }
            System.out.print("\n");

            for (int i = 0; i < this.grafo.getMapaVertices().keySet().size(); i++) {
                System.out.print("Vértice " + valorVertice[i] + ":\t");
                for (int j = 0; j < this.grafo.getMapaVertices().keySet().size(); j++) {
                    System.out.print(grafo.getMatrizAdjacenciaDigrafo()[i][j] + "\t");
                }
                System.out.print("\n");
            }
        }
    }//GEN-LAST:event_MatrizAdjActionPerformed

    private void MatrizIncidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatrizIncidenteActionPerformed
        List<Vertice> listaVertices = new ArrayList<Vertice>();
        List<Aresta> listaArestas = new ArrayList<Aresta>();

        listaVertices.addAll(this.grafo.getMapaVertices().values());
        listaArestas.addAll(this.grafo.getArestasGraficas().values());

        TagGrafo grafo = new TagGrafo(listaVertices, listaArestas);
        
        if (this.ChkGrafoDirecionado.isSelected() == false) {
            //Então é grafo 
            System.out.print("\nGRAFO:\n");
            System.out.print("Matriz de Incidências:\n\n");

            int numeroVertices = this.grafo.getMapaVertices().keySet().size();
            int numeroArestas = this.grafo.getArestasGraficas().size();
            String valorVertice[] = new String[numeroVertices];
            String valorAresta[] = new String[numeroArestas];

            int m = 0;
            System.out.print("\t");

            for (Vertice vertice : this.grafo.getMapaVertices().values()) {
                valorVertice[m] = vertice.getValor();
                System.out.print("   Vért " + valorVertice[m]);
                m = m + 1;
            }
            System.out.print("\n");

            int k = 0;
            for (Aresta aresta : this.grafo.getArestasGraficas().values()) {
                valorAresta[k] = aresta.getValor();
                k = k + 1;
            }

            for (int i = 0; i < this.grafo.getArestasGraficas().size(); i++) {

                System.out.print("Aresta " + valorAresta[i] + ":\t");
                for (int j = 0; j < this.grafo.getMapaVertices().keySet().size(); j++) {
                    System.out.print(grafo.getMatrizIncidenciaGrafo()[i][j] + "\t");
                }
                System.out.print("\n");
            }
        } else {
            //Então é dígrafo 
            System.out.print("\nDÍGRAFO:\n");
            System.out.print("Matriz de Incidências:\n\n");

            int numeroVertices = this.grafo.getMapaVertices().keySet().size();
            int numeroArestas = this.grafo.getArestasGraficas().size();
            String valorVertice[] = new String[numeroVertices];
            String valorAresta[] = new String[numeroArestas];

            int m = 0;
            System.out.print("\t");

            for (Vertice vertice : this.grafo.getMapaVertices().values()) {
                valorVertice[m] = vertice.getValor();
                System.out.print("   Vért " + valorVertice[m]);
                m = m + 1;
            }
            System.out.print("\n");

            int k = 0;
            for (Aresta aresta : this.grafo.getArestasGraficas().values()) {
                valorAresta[k] = aresta.getValor();
                k = k + 1;
            }

            for (int i = 0; i < this.grafo.getArestasGraficas().size(); i++) {
                System.out.print("Aresta " + valorAresta[i] + ":\t");

                for (int j = 0; j < this.grafo.getMapaVertices().keySet().size(); j++) {
                    System.out.print(grafo.getMatrizIncidenciaDigrafo()[i][j] + "\t");
                }

                System.out.print("\n");
            }
        }
    }//GEN-LAST:event_MatrizIncidenteActionPerformed

    /**
     * Método principal para execução da janela gráfica da ferramenta.
     *
     * @param args : argumentos em linha de comando.
     */
    public static void main(String args[]) throws Exception {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AGMKruskal;
    private javax.swing.JMenuItem AGMPrim;
    private javax.swing.JButton AdicionarAresta;
    private javax.swing.JMenuItem BuscaLargura;
    private javax.swing.JMenuItem BuscaProfundidade;
    private javax.swing.JCheckBox ChkGrafoDirecionado;
    private javax.swing.JMenuItem ColoreArestas;
    private javax.swing.JMenuItem ColoreVertices;
    private javax.swing.JMenuItem ColoreVerticesArestas;
    private javax.swing.JMenuItem Dijkstra;
    private javax.swing.JMenuItem ETag;
    private javax.swing.JMenuItem Euleriano;
    private javax.swing.JMenuItem Hierholzer;
    private javax.swing.JMenuItem MatrizAdj;
    private javax.swing.JMenuItem MatrizIncidente;
    private javax.swing.JMenu MenuAlgoritmos;
    private javax.swing.JMenu MenuAnimacoes;
    private javax.swing.JMenu MenuSobre;
    private javax.swing.JMenuBar MenuToolbar;
    private javax.swing.JMenu MenuTrabalhoPratico;
    private javax.swing.JMenuItem Professores;
    private javax.swing.JButton Proximo;
    private javax.swing.JRadioButton RadBtnAdicionarVertice;
    private javax.swing.JRadioButton RadBtnProsseguirTrabalho;
    private javax.swing.JRadioButton RadBtnRemoverVertice;
    private javax.swing.JButton Salvar;
    private javax.swing.JTabbedPane Tela;
    private javax.swing.JToolBar ToolBarGrafo;
    private javax.swing.JMenuItem Unicursal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblAdicionarVertice;
    private javax.swing.JLabel lblGrafoDirecionado;
    private javax.swing.JLabel lblProsseguirTrabalho;
    private javax.swing.JLabel lblRemoverItem;
    // End of variables declaration//GEN-END:variables

    @Override
    protected JRadioButton getJRadioButton1() {
        return RadBtnAdicionarVertice;
    }

    @Override
    protected JRadioButton getJRadioButton2() {
        return RadBtnRemoverVertice;
    }

    @Override
    protected JPanel getJPanelFundo() {
        return jPanelFundo;
    }

    @Override
    protected JCheckBox getJCheckBox2() {
        return ChkGrafoDirecionado;
    }

    @Override
    public void algoritmoAGMPrim() {
        JPrompt.printPane("Algoritmo ainda não programado no e-TAG.");
    }

    @Override
    public void algoritmoAGMKruskal() {
        this.MatrizAdjacencia();
    }

    @Override
    public void algoritmoBuscaProfundidade() {
        JPrompt.printPane("Algoritmo ainda não programado no e-TAG.");
    }

    @Override
    public void algoritmoBuscaLargura() {
        JPrompt.printPane("Algoritmo ainda não programado no e-TAG.");
    }

    @Override
    public void algoritmoDijkstra() {
        JPrompt.printPane("Algoritmo ainda não programado no e-TAG.");
    }

    /**
     * Prosseguir implementando os seus algoritmos aqui ou nos próprios eventos.
     *
     */
    // Implementar aqui.
    public void MatrizAdjacencia() {
        Map<String, Vertice> listaVertices = this.grafo.getMapaVertices();
        Map<String, Aresta> listaAresta = this.grafo.getArestasGraficas();
        int matriz[][] = null;
        int linha;
        int coluna;

        for (Aresta item : listaAresta.values()) {
            linha = Integer.parseInt(item.getPartida().getID().substring(2, item.getPartida().getID().length()));
            coluna = Integer.parseInt(item.getDestino().getID().substring(2, item.getDestino().getID().length()));
            matriz[linha][item.getDestino().getID().charAt(2)] = 1;
        }
        /*
         ArrayList<Item> testando = new ArrayList<>();
         for (Item item : this.explorados) {
         Item outroItem = new Item(item.getItem());
         outroItem.setCores("black,green");
         testando.add(outroItem);
         }
         this.explorados.addAll(testando);
         JPrompt.printPane("TESTE", "Clique em next para ver a execução passo-a-passo!");
         */
    }
}
