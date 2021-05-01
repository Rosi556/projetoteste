package LuizaCode;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;

        Scanner scan = new Scanner(System.in);

        Produto produto1 = new Produto(123434, "Fone");
        Produto produto2 = new Produto(432344, "Teclado");

        Pessoa user = new Pessoa();
        Endereco end = new Endereco();
        end.setLogradouro("Rua Rosicleite");
        end.setCidade("Recife");
        end.setEstado("PE");

        user.setNome("Rosicleite");
        user.setEndereco(end);
        user.setNumero("004");

        Compra compra = new Compra();


        System.out.println("Escolha um produto: \n" + produto1.getNome() +
                " ou " + produto2.getNome());
        int escolha = scan.nextInt();
        switch (escolha) {
            case 1:
                compra.comprar(user, produto1);
                break;
            case 2:
                compra.comprar(user, produto2);
                break;
            default:
                System.out.println("Produto não disponível.");
        }

        System.out.println(compra.verificarCompra());

        // Teste do método consultar endereço
        System.out.println(user.consultaEndereco(end));
        //System.out.println(user.consultaEndereco("Rua Rosicleite","Recife" ,"PE").toString());

    }
}
