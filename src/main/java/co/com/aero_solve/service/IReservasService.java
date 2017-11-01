package co.com.aero_solve.service;

import java.util.List;

import co.com.aero_solve.entity.Reservas;

public interface IReservasService {
	List<Reservas> getReservaById(int idCedula);
}
