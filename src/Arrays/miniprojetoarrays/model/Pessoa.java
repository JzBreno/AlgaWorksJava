package Arrays.miniprojetoarrays.model;

public class Pessoa {

    private String nome;
    private int anoNascimento;
    private String sexo;
    private String cpf;

    public Pessoa(String nome, int anoNascimento, String sexo, String cpf) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", sexo='" + sexo + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
