import java.util.ArrayList;
public class Carrinho {
    private ArrayList<Produto> listaProdutos;

    public Carrinho() {
        this.listaProdutos = new ArrayList<Produto>();
    }
    
    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    
    public void insereProduto(Produto p){}
    
    public void removeProduto(int cod){}
    
    public double totalAPagar(){
        return 0;
    }
    
    
}
