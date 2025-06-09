package HelloWorld;

public class Pessoa {

        String nome;
        int data_nascimento;
        String cpf;
        String sexo;

        Pessoa(String nome, int data_nascimento, String cpf, String sexo) {
            this.nome = nome;
            this.data_nascimento = data_nascimento;
            this.cpf = cpf;
            this.sexo = sexo;
        }

        public Pessoa() {
        }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", data_nascimento=" + data_nascimento +
                ", cpf='" + cpf + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    int CalculaIdade(int data_atual){
        int idade = data_nascimento - data_atual;
        return idade;
    }
}
