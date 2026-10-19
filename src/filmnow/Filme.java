package filmnow;

import java.util.Objects;

public class Filme {
    private String nome;
    private String ano;
    private String local;

    public Filme(String nome, String ano, String local){
        this.nome = nome;
        this.ano = ano;
        this.local = local;
    }
    public String getNome(){
        return this.nome;
    }
    public String getAno(){
        return this.ano;
    }
    @Override
    public String toString(){
        return this.nome;
    }
    @Override
    public int hashCode(){
        return Objects.hash(nome, ano);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Filme)){
            return false;
        }
        Filme oFilme = (Filme) o;
        return this.nome.equals(oFilme.getNome()) && this.ano.equals(oFilme.getAno());
        }
    }
