package co.com.aero_solve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.aero_solve.dao.IReservasDAO;
import co.com.aero_solve.entity.Reservas;

@Service
public class ReservasService implements IReservasService {

	@Autowired
	private IReservasDAO reservasDAO;

	@Override
	public List<Reservas> getReservaById(int idCedula) {
		return reservasDAO.getReservaById(idCedula);
	}


}
