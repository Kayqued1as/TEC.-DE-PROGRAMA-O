public class Funcionario {
 
    private String nome;
    private String cargo;
    private double salario;
 
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
 

    public void aumentarSalario(double percentual) {
        this.salario = this.salario + (this.salario * percentual / 100);
    }
 
    
    public double calcularSalarioAnual() {
        return this.salario * 12;
    }
 
    
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário mensal: R$ %.2f%n", salario);
        System.out.printf("Salário anual: R$ %.2f%n", calcularSalarioAnual());
        System.out.println("------------------------------");
    }
 
    
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getCargo() {
        return cargo;
    }
 
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
 
    public double getSalario() {
        return salario;
    }
 
    public void setSalario(double salario) {
        this.salario = salario;
    }
}