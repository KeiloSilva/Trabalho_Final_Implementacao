

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraArquivo {
    private String nomeArquivoLeitura;
    
	public BufferedReader abrirArquivo(String arquivo) throws FileNotFoundException {
		File file = new File(arquivo);
		setNomeArquivoLeitura(file.getName());
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		return br;
	}
	
	public List<String> lerArquivo(String arquivo) throws FileNotFoundException,IOException {
        this.nomeArquivoLeitura = arquivo;                
		BufferedReader br = abrirArquivo(arquivo);
		List<String> lista = new ArrayList<>();
		while (br.ready()) {
			lista.add(br.readLine());
		}
		return lista;
	}
        
    private void setNomeArquivoLeitura(String nome){
    	this.nomeArquivoLeitura=nome;
    }
        
    public String getNomeArquivoLeitura(){
    	String[] str= nomeArquivoLeitura.split("_");
        return str[0].toString().toUpperCase();
    }        
}
