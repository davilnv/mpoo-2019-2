package problema_colheita;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fruta {
	private boolean isClimaterica;
	public String nome;
	private String data;
	private Date dataFormatada; 
	
	
	public Fruta() {}
	
	public Fruta(String nome) {
		this.nome = nome;
	}
	
	public Fruta(boolean isClimaterica) {
		this.isClimaterica = isClimaterica;
	}
	
	public Fruta(String nome, String data) throws ParseException {
		this.nome = nome;
		this.data = data;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		this.dataFormatada = formato.parse(data);
	}

	public boolean isClimaterica() {
		return isClimaterica;
	}

	public void setClimaterica(boolean isClimaterica) {
		this.isClimaterica = isClimaterica;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Date getDataFormatada() {
		return dataFormatada;
	}

	public void setDataFormatada(Date dataFormatada) {
		this.dataFormatada = dataFormatada;
	}
}
