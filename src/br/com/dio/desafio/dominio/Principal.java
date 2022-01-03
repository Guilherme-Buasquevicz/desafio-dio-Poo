package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.setTitulo("Curso java ");
        c1.setDescricao("Curso de java para iniciantes ");
        c1.setCargaHoraria(8);

        System.out.println(c1);

        Curso c2 = new Curso();
        c2.setTitulo("Curso javass ");
        c2.setDescricao("Curso de javass para iniciantes ");
        c2.setCargaHoraria(8);

        System.out.println(c2);

        Mentoria m1 = new Mentoria();

        m1.setTitulo("Mentoria de java ");
        m1.setDescricao("Mentoria sobre java ");
        m1.setData(LocalDate.now());

        System.out.println(m1);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp java developer");
        bootCamp.setDescricao(" descrição bootcamp de java");
        bootCamp.getConteudos().add(c1);
        bootCamp.getConteudos().add(c2);
        bootCamp.getConteudos().add(m1);

        Dev devGuilherme = new Dev();
        devGuilherme.inscreverBootCamp(bootCamp);
        devGuilherme.setNome("Guilherme ");

        System.out.println("Conteudos inscritos Gui " + devGuilherme.getConteudosInscritos());

        devGuilherme.progredir();

        System.out.println("Conteudos inscritos Gui " + devGuilherme.getConteudosInscritos());
        System.out.println("Conteudos concluidos Gui " + devGuilherme.getConteudosConcluidos());
        System.out.println("XP " + devGuilherme.calcularTotXp());

        System.out.println("-------------------");

        Dev devPedro = new Dev();
        devPedro.inscreverBootCamp(bootCamp);
        devPedro.setNome("Pedro ");

        System.out.println("Conteudos inscritos Pedro " + devPedro.getConteudosInscritos());

        devPedro.progredir();

        System.out.println("Conteudos inscritos Pedro " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos concluidos Pedro " + devPedro.getConteudosConcluidos());
        System.out.println("XP " + devPedro.calcularTotXp());
    }
}
