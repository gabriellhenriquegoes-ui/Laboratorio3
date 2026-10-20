package filmnow;

import java.util.Objects;

/**
 * Classe do objeto filme.
 */
public class Filme {
    private String nome;
    private String ano;
    private String local;
    private String status;

    /**
     * Construtor do filme.
     * @param nome o nome do filme.
     * @param ano o ano de lançamento.
     * @param local o local para assistir o filme.
     */
    public Filme(String nome, String ano, String local){
        this.nome = nome;
        this.ano = ano;
        this.local = local;
        this.status = "";
    }

    /**
     * Acessa o nome do filme.
     * @return o nome do filme.
     */
    public String getNome(){
        return this.nome;
    }

    /**
     * Acessa o ano de lançamento.
     * @return o ano de lançamento.
     */
    public String getAno(){
        return this.ano;
    }

    /**
     * Atribui um novo status ao filme.
     *
     * @param novo o novo status do filme.
     */
    public void setStatus(String novo){
        this.status = novo;
    }

    /**
     * Pega o status  do filme.
     *
     * @return o status.
     */
    public String getStatus(){
        return this.status;
    }

    /**
     * Representação textual do objeto Filme.
     * @return A representação do filme.
     */
    @Override
    public String toString(){
        return this.status + ' ' + this.nome+", "+this.ano+'\n'+this.local;
    }

    /**
     * gera o codigo hash com base no nome e no ano de lançamento.
     * @return um valor inteiro.
     */
    @Override
    public int hashCode(){
        return Objects.hash(nome, ano);
    }

    /**
     * Compara dois objetos para ver se eles são iguais com base no nome e no ano de lançamento.
     * @param o o objeto a ser comparado.
     * @return valor boolean indicando se são iguais.
     */
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Filme)){
            return false;
        }
        Filme oFilme = (Filme) o;
        return this.nome.equals(oFilme.getNome()) && this.ano.equals(oFilme.getAno());
        }
    }
