package co.com.aero_solve.dao;

import java.util.List;

import co.com.aero_solve.entity.Vuelos;

public interface IVuelosDAO {
	List<Vuelos> getCiudades();
	List<Vuelos> getDestinosById(int idOrigen);
}
