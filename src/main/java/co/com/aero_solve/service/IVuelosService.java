package co.com.aero_solve.service;

import java.util.List;

import co.com.aero_solve.entity.Vuelos;

public interface IVuelosService {
	List<Vuelos> getCiudades();
	List<Vuelos> getVuelosById(int idCiudOrigen);
}
