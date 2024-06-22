public abstract class CalculoMedia {
  public static float calcularMedia(float[] notas) {
    float somaNotas = 0;

    for (float nota : notas) {
      somaNotas += nota;
    }

    return somaNotas / notas.length;
  }
}
