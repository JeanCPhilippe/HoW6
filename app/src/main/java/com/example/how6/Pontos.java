package com.example.how6;

public class Pontos
{


    // Cria as variáveis para conter os atributos e mostra-los
    private String nome;
    private int imagem;
    private String Endereço;
    private String Desc;
    public Pontos(String nome,int imagem,String Endereço, String Desc)
    {
        this.nome = nome;
        this.imagem = imagem;
        this.Endereço = Endereço;
        this.Desc = Desc;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }
}
