import dio.desafio.dominio.Bootcamp;
import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Dev;
import dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Instanciando cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java completo");
        curso1.setDescricao("Aprenda Java do zero até o avançado");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de HTML e CSS");
        curso2.setDescricao("Aprenda a criar páginas com HTML e estilização com CSS");
        curso2.setCargaHoraria(8);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso de JavaScript para iniciantes");
        curso3.setDescricao("Aprenda os primeiros passos na linguagem JavaScript");
        curso3.setCargaHoraria(15);

        // Instanciando mentorias
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java: POO");
        mentoria1.setDescricao("Mentoria sobre programação orientada a objetos com Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria: Carreira em Front-end");
        mentoria2.setDescricao("Mentoria sobre como construir sua carreira em Front-end");
        mentoria2.setData(LocalDate.now());

        // Instanciando Bootcamps
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Girls in Tech: Java");
        bootcamp1.setDescricao("Bootcamp para mulheres na área de tecnologia");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Front-end developer");
        bootcamp2.setDescricao("Aprenda programação front-end com HTML, CSS e JavaScript");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(mentoria2);

        // Instanciando Devs
        Dev aluno1 = new Dev();
        aluno1.inscreverBootcamp(bootcamp1);
        aluno1.setNome("Patricia Baria");
        aluno1.progredir();
        System.out.println("Conteúdos inscritos Aluno 1: " + aluno1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Aluno 1: " + aluno1.getConteudosConcluidos());
        System.out.println("Total XP: " + aluno1.calcularTotalXp());

        System.out.println("--------------------------");

        Dev aluno2 = new Dev();
        aluno2.inscreverBootcamp(bootcamp2);
        aluno2.setNome("João Silva");
        aluno2.progredir();
        System.out.println("Conteúdos inscritos Aluno 2: " + aluno2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Aluno 1: " + aluno2.getConteudosConcluidos());
        System.out.println("Total XP: " + aluno2.calcularTotalXp());

    }
}