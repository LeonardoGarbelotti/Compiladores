/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycustomccompiler.simbolos;

/**
 *
 * @author 1511 IRON
 */
public class Simbolo {

    private Integer id;
    private String val;
    private String tipo;
    private String escopo;
    private String nome;

    public Simbolo() {
        this.id = 0;
        this.tipo = "";
        this.val = "";
        this.escopo = "";
        this.nome = "";
    }

    public Simbolo(Integer id, String tipo, String nome, String val, String escopo) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.val = val;
        this.escopo = escopo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEscopo() {
        return escopo;
    }

    public void setEscopo(String escopo) {
        this.escopo = escopo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
