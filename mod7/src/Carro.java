public class Carro {
    private String modelo;

    private String placa;

    private Boolean estaLigado;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Boolean getEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(Boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void ligar() {
       setEstaLigado(true);
    }

    public void desligar() {
        setEstaLigado(false);
    }
}
