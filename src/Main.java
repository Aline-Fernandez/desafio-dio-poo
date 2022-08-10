import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
      Curso curso1 = new Curso();
      curso1.setTitulo("Curso Java");
      curso1.setDescricao("Descrição curso Java");
      curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();
      curso2.setTitulo("Curso Js");
      curso2.setDescricao("Descrição curso Js");
      curso2.setCargaHoraria(4);

      Conteudo conteudo = new Curso();

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("Mentoria Java");
      mentoria.setDescricao("Descrição mentoria Java");
      mentoria.setData(LocalDate.now());

//      System.out.println(curso1);
//      System.out.println(curso2);
//      System.out.println(mentoria);

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");
      bootcamp.setDescricao("Descrição Bootcamp Java Developer");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria);

      Dev devAline =new Dev();
      devAline.setNome("ALine");
      devAline.inscrerBootcamp(bootcamp);
      System.out.println("Conteudos Incritos Aline: " + devAline.getConteudosInscritos());

      devAline.progredir();
      devAline.progredir();
      System.out.println("-");
      System.out.println("Conteudos concluidos Aline: " + devAline.getConteudosInscritos());
      System.out.println("Conteudos concluidos Aline: " + devAline.getConteudosConcluidos());
      System.out.println("XP:" + devAline.calcularTotalxp());

      System.out.println("---------");

      Dev devWilson = new Dev();
      devWilson.setNome("Wilson");
      devWilson.inscrerBootcamp(bootcamp);
      System.out.println("Conteudos Incritos Wilson: " + devWilson.getConteudosInscritos());
      
      devWilson.progredir();
      devWilson.progredir();

      System.out.println("-");

      System.out.println("Conteudos Concluidos Wilson: " + devWilson.getConteudosInscritos());
      System.out.println("Conteudos Concluidos Wilson: " + devWilson.getConteudosConcluidos());
      System.out.println("XP:" + devWilson.calcularTotalxp());








    }
}
