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
    
    public void insereProduto(Produto p){
        listaProdutos.add(p);
        
        System.out.println("Código: " + p.getCodigo());
        System.out.println("Código: " + p.getDescricao());
        System.out.println("Código: " + p.getPreco());
    }
    
    public void removeProduto(int cod){}
    
    public double totalAPagar(){
        return 0;
    }
    
    
}
