public class Carro {
    
   private String modelo;
    private String marca;
     private int ano;
     private String cor;

public Carro(String modelo, String marca, int ano, String cor) {
    this.modelo = modelo;
    this.marca = marca;
    this.ano = ano;
    this.cor = cor;
}

public String getmodelo() {
    return this.modelo;
}

public String getmarca() {
    return this.marca;
}

public int getano() {
return this.ano;
}

public void setAno(int anoNovo) {
    this.ano = anoNovo;
}
public String getcor() {
    return this.cor;
}
public void setCor(String CorNovo) {
    this.cor = CorNovo;

}

}

