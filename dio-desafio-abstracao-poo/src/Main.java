import br.com.sistema.Aluno;
import br.com.sistema.CursoSAP;
import br.com.sistema.Mentoria;
import br.com.sistema.Modulos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Modulos modulo1 = new Modulos();
        modulo1.setTitulo("Módulo MM");
        modulo1.setDescricao("Gestão de Materiais");
        modulo1.setCargaHoraria(10);

        Modulos modulo2 = new Modulos();
        modulo2.setTitulo("Módulo SD");
        modulo2.setDescricao("Vendas e Distribuição");
        modulo2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de SAP");
        mentoria.setDescricao("Descrição mentoria do curso SAP");
        mentoria.setData(LocalDate.now());

        CursoSAP cursoSAP = new CursoSAP();
        cursoSAP.setNome("Curso SAP");
        cursoSAP.setDescricao("Curso SAP com módulos MM e SD");
        cursoSAP.getConteudos().add(modulo1);
        cursoSAP.getConteudos().add(modulo2);
        cursoSAP.getConteudos().add(mentoria);

        Aluno Rodrigo = new Aluno();
        Rodrigo.setNome("Rodrigo");
        Rodrigo.inscreverCursoSAP(cursoSAP);
        System.out.println("Conteúdos Inscritos Rodrigo:" + Rodrigo.getConteudosInscritos());
        Rodrigo.progredir();
        Rodrigo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rodrigo:" + Rodrigo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rodrigo:" + Rodrigo.getConteudosConcluidos());
        System.out.println("XP:" + Rodrigo.calcularTotalXp());

        System.out.println("-------");

        Aluno Lucas = new Aluno();
        Lucas.setNome("Lucas");
        Lucas.inscreverCursoSAP(cursoSAP);
        System.out.println("Conteúdos Inscritos Lucas:" + Lucas.getConteudosInscritos());
        Lucas.progredir();
        Lucas.progredir();
        Lucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lucas:" + Lucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Lucas:" + Lucas.getConteudosConcluidos());
        System.out.println("XP:" + Lucas.calcularTotalXp());

    }

}






