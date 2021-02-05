package br.com.supernovatech.javaee.bean;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.enterprise.context.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

/**
 * @author willdkdias
 *
 */
@Named("formrequest")
@RequestScoped
public class FormBeanRequest implements Serializable{

	private Integer contador = 0;
	private LocalDateTime dataHora = LocalDateTime.now();
	private String data = null;
	

	public Integer getContador() {
		return contador;
	}

	public void setContador(Integer contador) {
		this.contador = contador;
	}
	
	
	/**
	 * Método utilizado para o botão com recurso AJAX (listener)
	 * @param evento
	 */
	public void contadorRequest(AjaxBehaviorEvent evento) {
		contador++;
	}

	// Método utilizado para formatar o LocalDateTime em uma String
	public String formatData() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String data = dtf.format(dataHora);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		String hora = dtf1.format(dataHora);
		setData(data + " " + hora);
		return data + " " + hora;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		formatData();
		return data; 
	}
	
}
