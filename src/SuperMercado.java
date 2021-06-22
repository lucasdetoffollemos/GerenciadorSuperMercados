
import java.util.ArrayList;


public class SuperMercado {
    private  ArrayList<Produto>  produtosCadastrados= new ArrayList<Produto>();

    public ArrayList<Produto> getProdutosCadastrados() {
        return produtosCadastrados;
    }

    public void setProdutosCadastrados(ArrayList<Produto> produtosCadastrados) {
        this.produtosCadastrados = produtosCadastrados;
    }

    public void insereProduto(Produto p){
            produtosCadastrados.add(p);
    }
    
    public void removeProduto(int cod){
        for(int i =0; i< produtosCadastrados.size(); i++){
            if(cod == produtosCadastrados.get(i).getCodigo()){
                produtosCadastrados.remove(i);
            }
        }
    }
    
    public Produto editaProduto(int cod, String novaDescricao, double novoPreco){
        
        Produto p = new Produto(cod, novaDescricao, novoPreco);
         for(int i =0; i< produtosCadastrados.size(); i++){
            if(cod == produtosCadastrados.get(i).getCodigo()){
                produtosCadastrados.set(i, p);
            }
        }
        
        return p;
    
    }
    
}
