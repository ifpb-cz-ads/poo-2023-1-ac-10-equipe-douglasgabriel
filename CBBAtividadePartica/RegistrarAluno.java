package CBBAtividadePartica;

/*
 * Abra sua IDE NetBeans e implemente a classe RegistraAluno com os dois
 * métodos sobrecarregados imprimir, como foi mostrado.
 * Após isso, crie duas classes AppRegistraAluno e AppRegistraAluno2. Na primeira
 * classe, instancie um objeto que representa um aluno com seus respectivos dados e
 * imprima essas informações utilizando o método imprimir sem parâmetros, que imprime
 * apenas as informações pessoais do aluno. Na segunda classe, instancie um outro aluno
 * com seus dados, mas dessa vez utilize o método imprimir que recebe como parâmetros
 * as notas do aluno, imprimindo-as na saída do sistema junto com o nome do aluno.
 */

public class RegistrarAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contatorEstudante;

    public String getNome(){ //Get Nome
        return nome; 
    }

    public void setNome (String nome){ //Set Nome
        this.nome = nome;
    }

    public String getEndereco (){ //Get endereço
        return endereco;
    }

    public void setEndereco (String endereco){ //Set endereço
        this.endereco = endereco;
    }

    public int getIdade (){ //Get idade
        return idade;
    }

    public void setIdade (int idade){ //Set idade
        this.idade = idade;
    }

    public double getNotaMatematica(){ //Get nota de matematica
        return notaMatematica;
    }

    public double getNotaPortugues(){ //Get nota de portugues
        return notaPortugues;
    }

    public double getNotaGeografia(){ //Get nota de geografia
        return notaGeografia;
    }

    public void setNotaMatematica(double nota){ //Set nota de matematica
        this.notaMatematica = nota;
    }

    public void setNotaPortugues(double nota){ //Set nota de portugues
        this.notaPortugues = nota;
    }

    public void setNotaGeografia(double nota){ //Set nota de geografia
        this.notaGeografia = nota;
    }

    public double getMedia (){ //Get media
        double resultado = 0;
        resultado = (notaMatematica + notaGeografia + notaPortugues) / 3;
        return resultado;
    }

    public static void setContadorEstudante(){ //Set contador estudante
        contatorEstudante +=1;
    }

    public static int getContadorEstudante(){ //Get contador estudante
        return contatorEstudante;
    }

    public void imprimir(){ //Imprimir sem atributos
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Idade: " + idade);
    }

    public void imprimir(double mNota, double pNota, double gNota){ //Imprimir com atributos
        System.out.println("Nome: " + nome);
        System.out.println("Nota Matematica: " + mNota);
        System.out.println("Nota Portugues: " + pNota);
        System.out.println("Nota Geografia: " + gNota);
    }
}
