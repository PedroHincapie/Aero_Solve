package co.com.aero_solve.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservas")
public class Reservas implements Serializable{
	private static final long serialVersionUID = 1L;

	public Reservas(int idReserva, int idVuelo, int idCedula, String nomCliente, Double vlrTiquete, String fecVenta,
			String soloIda, String fecIda, String fecRegreso) {
		super();
		this.idReserva = idReserva;
		this.idVuelo = idVuelo;
		this.idCedula = idCedula;
		this.nomCliente = nomCliente;
		this.vlrTiquete = vlrTiquete;
		this.fecVenta = fecVenta;
		this.soloIda = soloIda;
		this.fecIda = fecIda;
		this.fecRegreso = fecRegreso;
	}

	public Reservas() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_reserva")
	private int idReserva;

	@Column(name="id_vuelo")
	private int idVuelo;

	@Column(name="id_cedula")
	private int idCedula;

	@Column(name="nom_cliente")
	private String nomCliente;

	@Column(name="vlr_tiquete")
	private Double vlrTiquete;

	@Column(name="fec_venta")
	private String fecVenta;

	@Column(name="solo_ida")
	private String soloIda;

	@Column(name="fec_ida")
	private String fecIda;

	@Column(name="fec_regreso")
	private String fecRegreso;

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getIdCedula() {
		return idCedula;
	}

	public void setIdCedula(int idCedula) {
		this.idCedula = idCedula;
	}

	public String getNomCliente() {
		return nomCliente;
	}

	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}

	public Double getVlrTiquete() {
		return vlrTiquete;
	}

	public void setVlrTiquete(Double vlrTiquete) {
		this.vlrTiquete = vlrTiquete;
	}

	public String getFecVenta() {
		return fecVenta;
	}

	public void setFecVenta(String fecVenta) {
		this.fecVenta = fecVenta;
	}

	public String getSoloIda() {
		return soloIda;
	}

	public void setSoloIda(String soloIda) {
		this.soloIda = soloIda;
	}

	public String getFecIda() {
		return fecIda;
	}

	public void setFecIda(String fecIda) {
		this.fecIda = fecIda;
	}

	public String getFecRegreso() {
		return fecRegreso;
	}

	public void setFecRegreso(String fecRegreso) {
		this.fecRegreso = fecRegreso;
	}

	@Override
	public String toString() {
		return "Reservas [idReserva=" + idReserva + ", idVuelo=" + idVuelo + ", idCedula=" + idCedula + ", nomCliente="
				+ nomCliente + ", vlrTiquete=" + vlrTiquete + ", fecVenta=" + fecVenta + ", soloIda=" + soloIda
				+ ", fecIda=" + fecIda + ", fecRegreso=" + fecRegreso + "]";
	}
}