package entities;

public class Employee {
    private String id;
    private String nome;
    private Double salario;


   public Employee () {

   }

    public Employee(String id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentage) {
        salario += salario * percentage / 100;
    }

    @Override
    public String toString() {
        return "Funcionário: " +
                "id=" + id +
                ", nome=" + nome +
                ", salario=" + salario;

    }



}
