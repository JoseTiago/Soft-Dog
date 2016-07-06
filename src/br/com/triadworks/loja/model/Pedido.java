package br.com.triadworks.loja.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pedido implements Serializable {

	private static final long serialVersonUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer Id;
	
	private String mesa;
	private String lanche1;
	private Integer qtd1;
	private String observacao1;
	
	private String lanche2;
	private Integer qtd2;
	private String observacao2;
	
	private String lanche3;
	private Integer qtd3;
	private String observacao3;
	
	private String lanche4;
	private Integer qtd4;
	private String observacao4;
	
	private String lanche5;
	private Integer qtd5;
	private String observacao5;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getMesa() {
		return mesa;
	}
	public void setMesa(String mesa) {
		this.mesa = mesa;
	}
	public String getLanche1() {
		return lanche1;
	}
	public void setLanche1(String lanche1) {
		this.lanche1 = lanche1;
	}
	public Integer getQtd1() {
		return qtd1;
	}
	public void setQtd1(Integer qtd1) {
		this.qtd1 = qtd1;
	}
	public String getObservacao1() {
		return observacao1;
	}
	public void setObservacao1(String observacao1) {
		this.observacao1 = observacao1;
	}
	public String getLanche2() {
		return lanche2;
	}
	public void setLanche2(String lanche2) {
		this.lanche2 = lanche2;
	}
	public Integer getQtd2() {
		return qtd2;
	}
	public void setQtd2(Integer qtd2) {
		this.qtd2 = qtd2;
	}
	public String getObservacao2() {
		return observacao2;
	}
	public void setObservacao2(String observacao2) {
		this.observacao2 = observacao2;
	}
	public String getLanche3() {
		return lanche3;
	}
	public void setLanche3(String lanche3) {
		this.lanche3 = lanche3;
	}
	public Integer getQtd3() {
		return qtd3;
	}
	public void setQtd3(Integer qtd3) {
		this.qtd3 = qtd3;
	}
	public String getObservacao3() {
		return observacao3;
	}
	public void setObservacao3(String observacao3) {
		this.observacao3 = observacao3;
	}
	public String getLanche4() {
		return lanche4;
	}
	public void setLanche4(String lanche4) {
		this.lanche4 = lanche4;
	}
	public Integer getQtd4() {
		return qtd4;
	}
	public void setQtd4(Integer qtd4) {
		this.qtd4 = qtd4;
	}
	public String getObservacao4() {
		return observacao4;
	}
	public void setObservacao4(String observacao4) {
		this.observacao4 = observacao4;
	}
	public String getLanche5() {
		return lanche5;
	}
	public void setLanche5(String lanche5) {
		this.lanche5 = lanche5;
	}
	public Integer getQtd5() {
		return qtd5;
	}
	public void setQtd5(Integer qtd5) {
		this.qtd5 = qtd5;
	}
	public String getObservacao5() {
		return observacao5;
	}
	public void setObservacao5(String observacao5) {
		this.observacao5 = observacao5;
	}
	public static long getSerialversonuid() {
		return serialVersonUID;
	}
	
	
	
	
}
