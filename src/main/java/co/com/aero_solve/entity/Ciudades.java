package co.com.aero_solve.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ciudades")
public class Ciudades implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Ciudades() {
		super();
	}

	public Ciudades(int idCiudad, String nomCiudad) {
		super();
		this.idCiudad = idCiudad;
		this.nomCiudad = nomCiudad;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_ciudad")
	private int idCiudad;

	@Column(name="nom_ciudad")
	private String nomCiudad;

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNomCiudad() {
		return nomCiudad;
	}

	public void setNomCiudad(String nomCiudad) {
		this.nomCiudad = nomCiudad;
	}

	@Override
	public String toString() {
		return "Ciudades [idCiudad=" + idCiudad + ", nomCiudad=" + nomCiudad + "]";
	}
}