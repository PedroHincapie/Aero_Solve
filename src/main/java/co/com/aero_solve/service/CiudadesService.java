package co.com.aero_solve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.aero_solve.dao.ICiudadesDAO;
import co.com.aero_solve.entity.Ciudades;

@Service
public class CiudadesService implements ICiudadesService {

	@Autowired
	private ICiudadesDAO ciudadesDAO;

	@Override
	public List<Ciudades> getCiudades() {
		return ciudadesDAO.getCiudades();
	}
}
