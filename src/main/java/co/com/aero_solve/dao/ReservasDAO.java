package co.com.aero_solve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.aero_solve.entity.Reservas;

@Transactional
@Repository
public class ReservasDAO implements IReservasDAO{
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservas> getReservaById(int idCedula) {
		String hql = "FROM Reservas as atcl WHERE atcl.idCedula = ?";
		return(List<Reservas>) entityManager.createQuery(hql).setParameter(1, idCedula).getResultList();
	}

}