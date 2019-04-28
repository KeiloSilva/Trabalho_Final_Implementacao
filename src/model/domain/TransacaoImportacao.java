/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Keilo
 */
@Entity
@Table(name="transacao")
public class TransacaoImportacao implements Lote {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="detalhe")
    private char detalhe;
    @Column(name="numeroConta")
    private String numeroconta;
    @Column(name="numeroPlastico")
    private String numeroplastico;
    @Column(name="valorTransacao")
    private double valortransacao;
    @Column(name="dataTransacao")
    private String datatransacao;
    @Column(name="horaTransacao")
    private String horatransacao;
    @Column(name="codigoEstabelecimento")
    private String codigoestabelecimento;
    @Column(name="NumeroLote")
    private String numeroLote;
    @Column(name="TipoLote")
    private String tipolote;
    
    
    @Override
    public Long getId() {
         return id;
    }

    public void setId(Long id) {
         this.id = id;
    }

    /**
     * @return the detalhe
     */
    
    public char getDetalhe() {
        return detalhe;
    }

    /**
     * @param detalhe the detalhe to set
     */
    public void setDetalhe(char detalhe) {
        this.detalhe = detalhe;
    }

    /**
     * @return the numeroconta
     */
    
    public String getNumeroconta() {
        return numeroconta;
    }

    /**
     * @param numeroconta the numeroconta to set
     */
    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    /**
     * @return the numeroplastico
     */
    
    public String getNumeroplastico() {
        return numeroplastico;
    }

    /**
     * @param numeroplastico the numeroplastico to set
     */
    public void setNumeroplastico(String numeroplastico) {
        this.numeroplastico = numeroplastico;
    }

    /**
     * @return the valortransacao
     */
    
    public double getValortransacao() {
        return valortransacao;
    }

    /**
     * @param valortransacao the valortransacao to set
     */
    public void setValortransacao(double valortransacao) {
        this.valortransacao = valortransacao;
    }

    /**
     * @return the datatransacao
     */
    
    public String getDatatransacao() {
        return datatransacao;
    }

    /**
     * @param datatransacao the datatransacao to set
     */
    public void setDatatransacao(String datatransacao) {
        this.datatransacao = datatransacao;
    }

    /**
     * @return the horatransacao
     */
    
    public String getHoratransacao() {
        return horatransacao;
    }

    /**
     * @param horatransacao the horatransacao to set
     */
    public void setHoratransacao(String horatransacao) {
        this.horatransacao = horatransacao;
    }

    /**
     * @return the codigoestabelecimento
     */
    
    public String getCodigoestabelecimento() {
        return codigoestabelecimento;
    }

    /**
     * @param codigoestabelecimento the codigoestabelecimento to set
     */
    public void setCodigoestabelecimento(String codigoestabelecimento) {
        this.codigoestabelecimento = codigoestabelecimento;
    }

    public void setNumeroLote(String lote) {
        this.numeroLote=lote;
    }
    public String getNumeroLote(){
        return numeroLote;
    }
    public void setTipoLote(String lt){
            this.tipolote=lt;
    }
    @Override
    public String getTipoLote() {
        return "Transacao";
    }
    @Override
    public String toString(){
        return "Transacao[Detalhe "+detalhe+",NumeroConta="+numeroconta+", NumeroPlastico="+numeroplastico+", ValorTranscao="+valortransacao+", Data="+datatransacao+", Horario="+horatransacao+", CodigoEstabelecimento="+codigoestabelecimento+"]";
    }

   
}
