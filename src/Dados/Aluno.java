package Dados;

public class Aluno extends Usuario {
    private String departamento;

    public Aluno(String nome, String matricula, String matricula1, String departamento) {
        super(nome, matricula, matricula1);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
