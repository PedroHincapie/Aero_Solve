package co.com.aero_solve.dao;

import java.util.List;

import co.com.aero_solve.entity.Reservas;

public interface IReservasDAO {
	List<Reservas> getReservaById(int idCedula);
}
