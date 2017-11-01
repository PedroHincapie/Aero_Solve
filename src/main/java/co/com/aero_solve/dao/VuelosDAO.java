package co.com.aero_solve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.aero_solve.entity.Vuelos;

@Transactional
@Repository
public class VuelosDAO implements IVuelosDAO{
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Vuelos> getCiudades() {
		String hql = "FROM Vuelos as vuel ORDER BY vuel.id";
		return (List<Vuelos>)entityManager.createQuery(hql).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vuelos> getDestinosById(int idOrigen) {
		String hql = "FROM Vuelos as vuel WHERE vuel.id_origen = ?";
		return (List<Vuelos>)entityManager.createQuery(hql).setParameter(1, idOrigen).getResultList();
	}

}
