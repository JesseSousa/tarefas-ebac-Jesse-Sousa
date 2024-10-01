import Pessoa.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoaFisica = new PessoaFisica("João", 30, "123.456.789-00");
        Pessoa pessoaJuridica = new PessoaJuridica("Empresa", 10, "12.345.678/0001-00");

        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Idade: " + pessoaFisica.getIdade());
        System.out.println("CPF: " + ((PessoaFisica) pessoaFisica).getCpf());

        System.out.println("\nPessoa Jurídica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("Idade: " + pessoaJuridica.getIdade());
        System.out.println("CNPJ: " + ((PessoaJuridica) pessoaJuridica).getCnpj());
    }
}
