package br.com.sistema;

public class Modulos extends Conteudo {



    private int cargaHoraria;

        @Override
        public double calcularXp() {
            return XP_PADRAO * cargaHoraria;
        }

        public Modulos() {
        }


        public int getCargaHoraria() {
            return cargaHoraria;
        }

        public void setCargaHoraria(int cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
        }

        @Override
        public String toString() {
            return "Curso{" +
                    "titulo='" + getTitulo() + '\'' +
                    ", descricao='" + getDescricao() + '\'' +
                    ", cargaHoraria=" + cargaHoraria +
                    '}';
        }
    }