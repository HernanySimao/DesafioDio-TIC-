import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCarga_horaria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCarga_horaria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHernany = new Dev();
        devHernany.setNome("Hernany");
        devHernany.inscreverbootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Hernany" + devHernany.getConteudosInscritos());

        devHernany.progredir();
        devHernany.progredir();
        devHernany.progredir();
        devHernany.progredir();
        devHernany.progredir();
        devHernany.progredir();
        devHernany.progredir();
        devHernany.progredir();
        devHernany.progredir();
        devHernany.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Hernany" + devHernany.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Hernany" + devHernany.getConteudosConcluidos());
        System.out.println("XP:" + devHernany.calculartotalxp());

        System.out.println("----------");

        Dev devSimao = new Dev();
        devSimao.setNome("Simao");
        devSimao.inscreverbootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Simao" + devSimao.getConteudosInscritos());

        devSimao.progredir();
        devSimao.progredir();
        devSimao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Simao" + devSimao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Simao" + devSimao.getConteudosConcluidos());
        System.out.println("XP:" + devSimao.calculartotalxp());

    }
    }
