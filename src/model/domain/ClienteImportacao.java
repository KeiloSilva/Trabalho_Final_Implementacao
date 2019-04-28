package model.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import model.domain.Lote;

@Entity
@Table(name="Cliente")
public class ClienteImportacao implements Lote {
	
	//TODO needs refactoring
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name="id")
        private Long id;
        @Column(name="tipo")
	private char tipo;
        @Column(name="cpf")
	private String cpf;
        @Column(name="nome")
	private String nome;
        @Column(name="endereco")
	private String endereco;
        @Column(name="bairro")
	private String bairro;
        @Column(name="cidade")
	private String cidade;
        @Column(name="estado")
	private String estado;
        @Column(name="dataHoraCadastro")
	private Date dataHoraCadastro;
        @Column(name="TipoLote")
        private String tipolote;
        @Column(name="NumeroLote")
        private String numeroLote;
        
        public ClienteImportacao(){
            
        }
        @Override
        public Long getId() {
              return id;
        }
        public void setId(Long id) {
           this.id = id;
        }
	
	@Override
	public String getTipoLote() {
		return "Cliente";
	}
        public void setTipoLote(String lt){
            this.tipolote=lt;
        }
        
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
        
	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
        
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
        
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
        
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
        
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
        
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
        
	public Date getDataHoraCadastro() {
		return dataHoraCadastro;
	}

	public void setDataHoraCadastro(Date dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}
        
        public void setNumeroLote(String lote) {
            this.numeroLote=lote;
        }
        public String getNumeroLote(){
            return numeroLote;
        }
	@Override
	public String toString() {
		return "ClienteImportacao [tipo=" + tipo + ", cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", dataHoraCadastro="
				+ dataHoraCadastro + "]";
	}	

        
	
	
	

}
