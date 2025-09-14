package ProjetoFinal;

public class Paciente {
    private Integer id;
    private String nome;
    private Integer idade;
    private String sintoma;

    private static Integer contadorId = 0;

    public Paciente(String nome, Integer idade, String sintoma) {
        this.id = ++contadorId;
        this.nome = nome;
        this.idade = idade;
        this.sintoma = sintoma;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
    public String exibirInfo() {
        return "ID: " + id + " | Nome: " + nome + " | Idade: " + idade + " | Sintoma: " + sintoma;
    }
}