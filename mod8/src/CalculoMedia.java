public class CalculoMedia {
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;

    CalculoMedia(float nota1, float nota2, float nota3, float nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public float calcularMedia() {
       return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
    }
}
