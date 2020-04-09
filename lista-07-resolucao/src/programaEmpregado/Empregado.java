package programaEmpregado;

public class Empregado {
        private String nome = "" ;
        private Double salario = 0.0;
        private String cargo = "";


            //Setter nome
    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("nome : " + getNome());
    }
            //Setter salario e já converte o reajuste
    public void reajusteSalario(Double salario) {
        this.salario = salario ;
        System.out.println(String.format("Salario atual:  %.4f", getSalario()));
        System.out.println(String.format("Salario após reajuste: %.4f", calcularReajuste()));
    }

            //Metodo para calcular o resultado
    public double calcularReajuste(){
        Double reajuste = salario*0.15;
        return salario-reajuste;
    }

            //Setter o nome do cargo
    public void setCargo(String cargo) {
        this.cargo = cargo;
        System.out.println("Cargo na empresa: " + getCargo());
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
}
