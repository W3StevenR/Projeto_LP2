package Trab;
import java.util.ArrayList;

public class Região {

    private String nome;
    private String sigla;
    private Double area;
    private int populacao;
    private float IDH;
    private float PIB;
    private ArrayList<Estado> estados;
    
    public Região(){}

    public Região(String nome, String sigla, Double area, int populacao, float IDH, float PIB, ArrayList<Estado> estados){
        this.nome = nome;
        this.sigla = sigla;
        this.area = area;
        this.populacao = populacao;
        this.IDH = IDH;
        this.PIB = PIB;
        this.estados = estados;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }


    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    public String getSigla(){
        return this.sigla;
    }


    public void setArea(Double area){
        this.area = area;
    }
    public Double getArea(){
        return this.area;
    }


    public void setPopulacao(int populacao){
        this.populacao = populacao;
    }
    public int getPopulacao(){
        return this.populacao;
    }


    public void setIDH(float IDH){
        this.IDH = IDH;
    }
    public float getIDH(){
        return this.IDH;
    }


    public void setPIB(float PIB){
        this.PIB = PIB;
    }
    public float getPIB(){
        return this.PIB;
    }
    
    
    public ArrayList<Estado> getEstado(){
        return this.estados;
      }
      
      public void setEstado(ArrayList<Estado> estados){
        this.estados = estados;
      }


    public float PIBperCapita(float PIB, int populacao){

        float perCapita;

        perCapita = PIB/populacao;
     
        return perCapita;
    }

    public Double densidade(Double area, int populacao){

        Double popul_densidade;
        
        popul_densidade = populacao/area;

        return popul_densidade;
    }

    public void getInformacao(){

        System.out.println("NOME: " + getNome());
        System.out.println("SIGLA: " + getSigla());
        System.out.println("ÁREA: " + getArea());
        System.out.println("POPULAÇÃO: " + getPopulacao());
        System.out.println("IDH: " + getIDH());
        System.out.println("PIB: " + getPIB());
        System.out.println("ESTADOS: " + getEstado());
    }
}


