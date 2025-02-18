/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeproduto;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class Produto {

    public Produto(String codigo1, String nome1, String descricao1, double preco1, int quantidade1) {
    }
    private String nome;
    private String codigo;
    private String descricao;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }   

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    private void cadastrar(String nome, String codigo, String descricao, double preco, int quantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    
    
    
    
    
}
