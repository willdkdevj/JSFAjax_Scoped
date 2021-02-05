package br.com.supernovatech.javaee.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

@Named
@SessionScoped
public class FormBean implements Serializable {

	private Integer cont = 0;
	private String texto = "(nenhum vez)";
	public Integer getCont() {
		return cont;
	}
	public void setCont(Integer cont) {
		this.cont = cont;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void contador(AjaxBehaviorEvent evento) {
		texto = cont == 0 ? "vez" : "vezes";
		cont++;
	}
}
