package LuizaCode;

public class Compra {
    Pessoa pessoa;
    Produto produto;

    public Compra(){}

    public Compra(Pessoa pessoa, Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void comprar(Pessoa pessoa, Produto produto){
        this.pessoa = pessoa;
        this.produto = produto;
    }


    public String verificarCompra(){
        return "Pessoa: " + getPessoa().getNome() + "\nProduto: " + getProduto().getNome();
    }
}
