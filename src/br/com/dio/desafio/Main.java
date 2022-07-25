package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("//--//--//--//--/ /--//--//--//--//");

        Dev devMorttis = new Dev();
        devMorttis.setNome("Morttis");
        devMorttis.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Morttis: \n" + devMorttis.getConteudosInscritos());

        devMorttis.progredir();
        System.out.println("============ PROGRESSO ============");

        System.out.println("Conteúdos Inscritos Morttis: \n" + devMorttis.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Morttis: \n" + devMorttis.getConteudosInscritos());
        System.out.println("XP:" + devMorttis.calcularTotalXp());

        System.out.println("//--//--//--//--/ /--//--//--//--//");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: \n" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("============ PROGRESSO ============");

        System.out.println("Conteúdos Inscritos Camila: \n" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila: \n" + devCamila.getConteudosInscritos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
    }
}
