
package com.Unit.crudpetshop;

public class Pet {
    
    public int codigo;
    public String nome;
    public String apelido;
    public String sexo;
    public String dataEntrada;
    public String idade;
    public String tiporacao;
    public double quantidaderacao;
    public double somaracao;
    public double peso;
    public String dataVenda;
    public String cpf;

    public Double getSomaracao()
    {
        return somaracao;
    }


    public void setSomaracao(Double somaracao)
    {
        this.somaracao += quantidaderacao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getQuantidaderacao() {
        return quantidaderacao;
    }

    public void setQuantidaderacao(double quantidaderacao) {
        this.quantidaderacao = quantidaderacao;
    }


    public String getTiporacao() {
        return tiporacao;
    }

    public void setTiporacao(String tiporacao) {
        this.tiporacao = tiporacao;
    }
    
    
    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

 
    public String getdataEntrada() {
        return dataEntrada;
    }

    public void setdataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
