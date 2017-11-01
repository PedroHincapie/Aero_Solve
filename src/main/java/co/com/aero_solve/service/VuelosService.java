package co.com.aero_solve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.aero_solve.dao.IVuelosDAO;
import co.com.aero_solve.entity.Vuelos;

@Service
public class VuelosService implements IVuelosService {

	@Autowired
	private IVuelosDAO vuelosDAO;

	@Override
	public List<Vuelos> getCiudades() {
		return vuelosDAO.getCiudades();
	}

	@Override
	public List<Vuelos> getVuelosById(int idCiudOrigen) {
		return vuelosDAO.getDestinosById(idCiudOrigen);
	}

}
