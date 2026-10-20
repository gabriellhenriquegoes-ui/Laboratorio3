package filmnow;

/**
 * Sistema que mantém os seus filmes prediletos. Podem existir 100 filmes.
 *
 * @author eliane
 *
 */
public class FilmNow {

    private static final int TAMANHO = 100;
    private static final int TAMANHO_HOTLIST = 10;
    private Filme[] filmes; //uma representacao simploria da lista de filmes
    private Filme[] hotList;

    /**
     * Cria o FilmNow.
     */
    public FilmNow() {
        this.filmes = new Filme[TAMANHO];
        this.hotList = new Filme[TAMANHO_HOTLIST];
    }

    /**
     * Acessa a lista de filmes mantida.
     *
     * @return O array de filmes.
     */
    public Filme[] getFilmes() {
        return this.filmes.clone();
    }

    /**
     * Acessa a lista hot list.
     *
     * @return O array hot list.
     */
    public Filme[] getHotList() {
        return this.hotList.clone();
    }

    /**
     * Acessa os dados de um filme específico.
     *
     * @param posicao Posição do filme no sistema.
     * @return Dados do filme. Null se não há filme na posição.
     */
    public Filme getFilme(int posicao) {
        return filmes[posicao];
    }

    /**
     * Adiciona um filme em uma posição. Se já existir filme na posição, sobrescreve o anterior.
     *
     * @param posicao Posição do filme.
     * @param nome    Nome do filme.
     * @param ano     Ano de lançamento do filme.
     * @param local   Local onde o filme pode ser assitido.
     */
    public boolean cadastraFilme(int posicao, String nome, String ano, String local) {
        Filme novo = new Filme(nome, ano, local);
        if (!(jaexiste(novo))) {
            this.filmes[posicao] = novo;
            return true;
        }
        return false;
    }

    private boolean jaexiste(Filme filme){
        for (int i = 0; i < filmes.length; i++) {
            if (this.filmes[i] != null && this.filmes[i].equals(filme)) {
                return true;
            }
        }
        return false;
    }
    public boolean atribuirHot(int filme, int posição){
        if(this.filmes[filme].getStatus().equals("")){
            hotList[posição] = this.filmes[filme];
            return true;
        }else{
            return false;
        }
    }
}