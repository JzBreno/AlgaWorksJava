package POO;

public class Carro {
    private static  String Pais;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private float peso;
    private float altura;
    private float largura;
    private float comprimento;
    private float FIPE;
    private Pessoa proprietario;

    public Carro(String marca, String modelo, String cor, String placa, float peso, float altura, float largura, float comprimento, float FIPE, Pessoa proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.comprimento = comprimento;
        this.FIPE = FIPE;
        this.proprietario = proprietario;
    }

    public Carro() {
    }

    static String chamaPais(){
        return Pais;
    }
    static void SetPais(String var){
        Pais = var;
    }
    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                ", FIPE=" + FIPE +
                ", proprietario=" + proprietario +
                '}';
    }

    public Pessoa getProprietario(Pessoa pessoa) {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getFIPE() {
        return FIPE;
    }

    public void setFIPE(float FIPE) {
        this.FIPE = FIPE;
    }
}
