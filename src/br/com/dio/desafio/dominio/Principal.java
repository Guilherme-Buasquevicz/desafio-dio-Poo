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


    }
}
