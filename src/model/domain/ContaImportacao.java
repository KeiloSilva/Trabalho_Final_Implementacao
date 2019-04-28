package model.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import model.domain.Lote;

@Entity
@Table(name="Conta")
public class ContaImportacao implements Lote {
	
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name="id")
        private Long id;
        @Column(name="tipo")
	private char tipo;
        @Column(name="cpf")
	private String cpf;
        @Column(name="valor_Limite")
	private Double valorLimite;
        @Column(name="dia_Vencimento_Fatura")
	private Integer diaVencimentoFatura;
        @Column(name="Numero_Conta")
	private String numeroConta;
        @Column(name="Numero_Lote")
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
        
	@Override
	public String getTipoLote() {
		return "Conta";
	}
        public void setTipoLote(String lt){
            this.tipolote=lt;
        }

        
	/*public ContaImportacao() {
		super();
	}*/
       
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
        
	public Double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(Double valorLimite) {
		this.valorLimite = valorLimite;
	}
        
	public Integer getDiaVencimentoFatura() {
		return diaVencimentoFatura;
	}

	public void setDiaVencimentoFatura(Integer diaVencimentoFatura) {
		this.diaVencimentoFatura = diaVencimentoFatura;
	}
        
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
        public String getLote(){
            return numeroLote;
        }
        public void setLote(String lote) {
            this.numeroLote=lote;
        }
       
	@Override
	public String toString() {
		return "ContaImportacao [tipo=" + tipo + ", cpf=" + cpf + ", valorLimite=" + valorLimite
				+ ", diaVencimentoFatura=" + diaVencimentoFatura + ", numeroConta=" + numeroConta + "]";
	}

    
	
	
	
	

}
