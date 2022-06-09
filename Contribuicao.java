public class Contribuicao {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica("Guilherme", 1000000, 500);

        System.out.printf("%s%s%.2f%n", pf1.getNome(), " vai pagar o valor de :R$",pf1.calcularImposto());

        PessoaJuridica pj1 = new PessoaJuridica("SoulCode", 500000, 45);
        System.out.printf("%s%s%.2f%n", pj1.getNome(), " vai pagar o valor de :R$",pj1.calcularImposto());
    }
}
