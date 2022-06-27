package Trab;
public class Estado extends Região{
    
    private String capital;


    public Estado(){}

    public Estado(String nome, String sigla, String capital, Double area, int populacao, float IDH, float PIB, Estado estados){
        this.capital = capital;
    }

    
    public void setCapital(String capital){
        this.capital = capital;
    }
    public String getCapital(){
        return this.capital;
    }

}