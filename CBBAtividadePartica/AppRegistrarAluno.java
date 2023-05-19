package CBBAtividadePartica;

import java.util.Scanner;

public class AppRegistrarAluno {
    public static void main(String[] args) {
        String nome;
        String endereco;
        int idade;
        double nota;
        Scanner scan = new Scanner(System.in);
        RegistrarAluno aluno = new RegistrarAluno();

        System.out.println("Registar Aluno:");
        System.out.println("Nome:" );
        nome = scan.next();
        aluno.setNome(nome);
        System.out.println();

        System.out.println("Endereco");
        endereco = scan.next();
        aluno.setEndereco(endereco);
        System.out.println();

        System.out.println("Idade: ");
        idade = scan.nextInt();
        aluno.setIdade(idade);
        System.out.println();

        System.out.println("Nota Matematica: ");
        nota = scan.nextDouble();
        aluno.setNotaMatematica(nota);
        System.out.println();

        System.out.println("Nota Portugues: ");
        nota = scan.nextDouble();
        aluno.setNotaPortugues(nota);
        System.out.println();

        System.out.println("Nota Geografia: ");
        nota = scan.nextDouble();
        aluno.setNotaGeografia(nota);

        aluno.imprimir();
    }
}
