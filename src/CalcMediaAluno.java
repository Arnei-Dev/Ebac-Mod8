
public class CalcMediaAluno extends Pessoa {

    public static void main(String[] args){
        /*
        Dados do aluno
         */
        Pessoa aluno = new Pessoa();
        aluno.setNomeEscola("Escola Estadual de Ensino Médio José de Alencar");
        aluno.setNome("Mário Arney da Silva Dias");
        aluno.setDisciplina("Programação Java");

        /*
        Notas do aluno
         */
        NotasAluno notas = new NotasAluno();
        notas.setNota1(98);
        notas.setNota2(75);
        notas.setNota3(67);
        notas.setNota4(77);

        /*
        Imprimindo o resultado do calculo da média + info aluno
         */
        System.out.println("-------------------AVALIAÇÃO SIMESTRAL ALUNO----------------------"+
                        "\nINSTITUIÇÃO DE ENSINO: " + aluno.getNomeEscola() +
                        "\nALUNO: " + aluno.getNome() +
                        "\nDISCIPLINA: " + aluno.getDisciplina() +
                        "\nMÉDIA DE PONTUAÇÃO: " + notas.getMediaAluno()+
                        "\n------------------------------FIM---------------------------------");

    }
}
