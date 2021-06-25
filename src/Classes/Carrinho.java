package Classes;

import Classes.Produto;
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
        
    }
    
    public void removeProduto(int cod, int i){ 
      
        if(cod == listaProdutos.get(i).getCodigo()){
            listaProdutos.remove(i);
        }

    }
    
    public double totalAPagar(){
        double totalPagar = 0;
        
        for(int i =0; i< listaProdutos.size(); i++){
            totalPagar = totalPagar + listaProdutos.get(i).getPreco();
        }
        
        return totalPagar;
    }
    
    
}
