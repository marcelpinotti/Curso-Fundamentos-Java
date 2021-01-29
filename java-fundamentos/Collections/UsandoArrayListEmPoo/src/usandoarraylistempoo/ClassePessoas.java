package usandoarraylistempoo;

/**
 * @author Marcel Pinotti
 */
public class ClassePessoas implements Comparable<ClassePessoas> {
    //implementação do Comparable para poder usar o metodos compareTo().

    private String nome;
    private int idade;

    public ClassePessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override // Sobrescreve o toString (implícito) para melhor visualização na impressão.
    public String toString() {
        return "[Nome: " + this.nome + " / Idade: " + this.idade + "]";
    }

    @Override
    public int compareTo(ClassePessoas outraPessoa) {
       /** compara duas Strings ordem lexicográfica (alfabética)
       * possível usar o Collections.sort
       * é necessário tratar as excessões, pois se o nome for null dará um erro
       **/
       return this.nome.compareTo(outraPessoa.nome);
    }
}
