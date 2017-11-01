package co.com.aero_solve.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vuelos")
public class Vuelos implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Vuelos(int id, int id_origen, String nom_origen, int id_dest, String nom_dest, String horaInic,
			String horaFin, int vlr_ida, int vlr_idavuelta, Double porc_finsemana) {
		super();
		this.id = id;
		this.id_origen = id_origen;
		this.nom_origen = nom_origen;
		this.id_dest = id_dest;
		this.nom_dest = nom_dest;
		this.horaInic = horaInic;
		this.horaFin = horaFin;
		this.vlr_ida = vlr_ida;
		Vlr_idavuelta = vlr_idavuelta;
		this.porc_finsemana = porc_finsemana;
	}
	
	public Vuelos() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;

	@Column(name="id_origen")
	private int id_origen;

	@Column(name="nom_origen")
	private String nom_origen;

	@Column(name="id_dest")
	private int id_dest;

	@Column(name="nom_dest")
	private String nom_dest;

	@Column(name="hora_inic")
	private String horaInic;

	@Column(name="hora_fin")
	private String horaFin;

	@Column(name="vlr_ida")
	private int vlr_ida;

	@Column(name="Vlr_idavuelta")
	private int Vlr_idavuelta;

	@Column(name="porc_finsemana")
	private Double porc_finsemana;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_origen() {
		return id_origen;
	}

	public void setId_origen(int id_origen) {
		this.id_origen = id_origen;
	}

	public String getNom_origen() {
		return nom_origen;
	}

	public void setNom_origen(String nom_origen) {
		this.nom_origen = nom_origen;
	}

	public int getId_dest() {
		return id_dest;
	}

	public void setId_dest(int id_dest) {
		this.id_dest = id_dest;
	}

	public String getNom_dest() {
		return nom_dest;
	}

	public void setNom_dest(String nom_dest) {
		this.nom_dest = nom_dest;
	}

	public String getHoraInic() {
		return horaInic;
	}

	public void setHoraInic(String horaInic) {
		this.horaInic = horaInic;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public int getVlr_ida() {
		return vlr_ida;
	}

	public void setVlr_ida(int vlr_ida) {
		this.vlr_ida = vlr_ida;
	}

	public int getVlr_idavuelta() {
		return Vlr_idavuelta;
	}

	public void setVlr_idavuelta(int vlr_idavuelta) {
		Vlr_idavuelta = vlr_idavuelta;
	}

	public Double getPorc_finsemana() {
		return porc_finsemana;
	}

	public void setPorc_finsemana(Double porc_finsemana) {
		this.porc_finsemana = porc_finsemana;
	}

	@Override
	public String toString() {
		return "Vuelos [id=" + id + ", id_origen=" + id_origen + ", nom_origen=" + nom_origen + ", id_dest=" + id_dest
				+ ", nom_dest=" + nom_dest + ", horaInic=" + horaInic + ", horaFin=" + horaFin + ", vlr_ida=" + vlr_ida
				+ ", Vlr_idavuelta=" + Vlr_idavuelta + ", porc_finsemana=" + porc_finsemana + "]";
	}
}