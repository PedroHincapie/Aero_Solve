package co.com.aero_solve.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.com.aero_solve.entity.Ciudades;

@Transactional
@Repository
public class CiudadesDAO implements ICiudadesDAO{
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Ciudades> getCiudades() {
		String hql = "FROM Ciudades as ciud ORDER BY ciud.idCiudad";
		return (List<Ciudades>)entityManager.createQuery(hql).getResultList();
	}	
}
