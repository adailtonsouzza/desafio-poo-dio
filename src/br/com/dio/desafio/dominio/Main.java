package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso React");
        curso2.setDescricao("POO");
        curso2.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descricao para mentorial");
        mentoria.setData(LocalDate.now());




//        System.out.println(curso1);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devAdailton = new Dev();
        devAdailton.setNome("Adailton");
        devAdailton.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos de Adailton: " + devAdailton.getConteudosInscritos());
        devAdailton.progredir();
        devAdailton.progredir();
        System.out.println("Conteúdos Inscritos de Adailton: " + devAdailton.getConteudosInscritos());
        System.out.println("Conteúdos Conclúidos de Adailton: " + devAdailton.getConteudoConcluidos());
        System.out.println("XP: " + devAdailton.calcularTotalXp());

    }
}
