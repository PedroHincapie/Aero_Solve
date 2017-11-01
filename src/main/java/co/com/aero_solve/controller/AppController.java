package co.com.aero_solve.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.aero_solve.entity.Ciudades;
import co.com.aero_solve.entity.Reservas;
import co.com.aero_solve.entity.Vuelos;
import co.com.aero_solve.service.ICiudadesService;
import co.com.aero_solve.service.IReservasService;
import co.com.aero_solve.service.IVuelosService;

@Controller
@RequestMapping("aero")
public class AppController {

	@Autowired
	private ICiudadesService ciudadesService;

	@Autowired
	private IVuelosService vuelosService;

	@Autowired
	private IReservasService reservasService;


	@GetMapping("ciudades")
	public ResponseEntity<List<Ciudades>> getCiudades(){
		List<Ciudades> list = ciudadesService.getCiudades();
		return new ResponseEntity<List<Ciudades>>(list, HttpStatus.OK);
	}

	@GetMapping("reserva/{id}")
	public ResponseEntity<List<Reservas>> getArticleById(@PathVariable("id") Integer id) {
		List<Reservas> reservas = reservasService.getReservaById(id);
		return new ResponseEntity<List<Reservas>>(reservas, HttpStatus.OK);
	}

	@GetMapping("vuelos/{id}")
	public ResponseEntity<List<Vuelos>> getDestinos(@PathVariable("id") Integer id){
		List<Vuelos> list = vuelosService.getVuelosById(id);
		return new ResponseEntity<List<Vuelos>>(list, HttpStatus.OK);
	}
}
