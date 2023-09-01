/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exuml;

/**
 *
 * @author unifccicarelli
 */

    class Aluno{
    private String nome;
    private String RA;
    private String curso;

        public Aluno(String nome, String RA, String curso) {
            this.nome = nome;
            this.RA = RA;
            this.curso = curso;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getRA() {
            return RA;
        }

        public void setRA(String RA) {
            this.RA = RA;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }
        
    }
    
    class Disciplina{
    private String codigo;
    private String nome;

            public Disciplina(String codigo, String nome) {
                this.codigo = codigo;
                this.nome = nome;
            }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
            
    
    }
    
    class Professor{
    private String nome;
    private String departamento;

        public Professor(String nome, String departamento) {
            this.nome = nome;
            this.departamento = departamento;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }
    
    
    }
    
    
    public class ExUML {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("alice", "123", "dor");
        Aluno aluno2 = new Aluno ("BOB BOB", "2222", "Java");
        Disciplina disciplina1 = new Disciplina("assa", "Java");
        Disciplina disciplina2 = new Disciplina("dsd", "Física");
        
        Professor professor = new Professor("Carlos","java");
        
        System.out.println("Aluno 1: " + aluno1.getNome() + ", " + aluno1.getRA() + ", " + aluno1.getCurso());
        
    }
    /*
    
    Minha esolha foi composição pois achei mais fácil :)
    mas também pois no meu pensar, sem a existencia de um professor e disciplina, 
    não existe um aluno. Sem alunos, não existe professor, e sem ninguém para ensinar 
    ou aprender, não existe disciplina...
    filosofei
    */
}
