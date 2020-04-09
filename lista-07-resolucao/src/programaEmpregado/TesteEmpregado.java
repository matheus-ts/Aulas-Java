package programaEmpregado;

public class TesteEmpregado {
    public static void main(String[] args) {

        //Atribuindo valores para o objeto usuario
        Empregado usuario = new Empregado();
        System.out.println("====================================================================");
        usuario.setNome("João");
        usuario.reajusteSalario(5.400);
        usuario.setCargo("Analista de sistemas");
        //
        //Crriando outro objeto chamado Desenvolvedor
        System.out.println("====================================================================");
        Empregado desenvolvedor = new Empregado();
       desenvolvedor.setNome("Diego");
       desenvolvedor.reajusteSalario(10.400);
       desenvolvedor.setCargo("Desenvolvedor Full Stack");
        //

    }
}
