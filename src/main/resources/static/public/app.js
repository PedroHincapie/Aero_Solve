'use strict';

//*****************Consulta la reserva***********************************************
class ConsultaReservaForm extends React.Component {
	constructor(props) {
		super(props);
		this.state = {value: ''};

		this.handleChange = this.handleChange.bind(this);
		this.handleSubmit = this.handleSubmit.bind(this);
	}

	handleChange(event) {
		this.setState({value: event.target.value});
	}

	handleSubmit(event) {
		if(document.getElementById('datosReserva'))
			document.getElementById('datosReserva').remove();
		ReactDOM.render(<ResuReservaForm value ={this.state.value}/>, document.getElementById('reserva'));
		event.preventDefault();
	}

	render() {
		return (
				<form onSubmit={this.handleSubmit}>
				<p>
				<h2>Tus reservas</h2>
				<input type="number" value={this.state.value} onChange={this.handleChange} required placeholder="Identificacion" />
					</p>
				<p>
				<input type="submit" value="Consultar" class="button button3"/>
					</p>
				</form>
		);
	}
}

ReactDOM.render(<ConsultaReservaForm />, document.getElementById('consulta') );
//*****************Consulta la reserva***********************************************

//*****************Listado de reserva***********************************************
class ResuReservaForm extends React.Component {

	constructor(props) {
		super(props);
		this.state = {opts:[], value: props.value  };

		this.handleChange = this.handleChange.bind(this);
		this.handleSubmit = this.handleSubmit.bind(this);
		this.componentDidMount = this.componentDidMount.bind(this);
	}

	componentDidMount() {
		var source=`http://localhost:8080/aero/reserva/${this.state.value}`;
		this.serverRequest = $.get(source, function (result) {
			this.setState({opts: result});
		}.bind(this));
	}

	handleChange(event) {
		this.setState({value: event.target.value});
	}

	handleSubmit(event) {
		alert('Your favorite flavor is: ' + this.state.value);
		event.preventDefault();
	}

	render() {
		let cant = this.state.opts.length;
		let elemento = null;
		if(cant == 0){
			elemento = <div id='datosReserva'><h1>No existen reservas a tu nombre...</h1></div>
		}else{
			elemento = <TablaReservas vuelos={this.state.opts}/>;
		}
		return (elemento);
	}
}

let TablaReservas = React.createClass({
	render: function() {
		var rows = [];
		this.props.vuelos.forEach(function(reserva) {
			rows.push(<FilaResr dato={reserva} />);
		});
		return (
				<div className="container" id='datosReserva'>
				<table className="table table-striped">
				<thead>
				<tr>
				<th>Fecha reserva</th>
				<th>Cod reserva</th>
				<th>Cod vuelo</th>
				<th>Solo Ida</th>
				<th>Fecha Salida</th>
				<th>Fecha Retorno</th>
				</tr>
				</thead>
				<tbody>{rows}</tbody>
				</table>
				</div>);
	}
});

let FilaResr = React.createClass({
	render: function() {
		return (
				<tr>
				<td>{this.props.dato.fecVenta}</td>
				<td>{this.props.dato.idReserva}</td>
				<td>{this.props.dato.idVuelo}</td>
				<td>{this.props.dato.soloIda}</td>
				<td>{this.props.dato.fecIda}</td>
				<td>{this.props.dato.fecRegreso}</td>
				</tr>);
	}
});






//*****************Listado de reserva***********************************************

//*****************Ciudades origenes***********************************************
class CiudadesOrgForm extends React.Component {
	constructor(props) {
		super(props);
		this.state = {value: ''};
		this.state = {opts:[]  };

		this.handleChange = this.handleChange.bind(this);
		this.componentDidMount = this.componentDidMount.bind(this);
	}

	componentDidMount() {
		var source="http://localhost:8080/aero/ciudades";
		this.serverRequest = $.get(source, function (result) {
			var arrTen = [];
			for (var k = 0; k < result.length; k++) {
				arrTen.push(<option key={result[k].idCiudad} value={result[k].idCiudad}> {result[k].nomCiudad} </option>);
			}
			this.setState({
				opts: arrTen
			});
		}.bind(this));
	}

	handleChange(event) {
		this.setState({value: event.target.value});
		if(document.getElementById('datosDestinos'))
			document.getElementById('datosDestinos').remove();
		ReactDOM.render(<DestinoForm origen = {event.target.value} />, document.getElementById('destinos') );
	}

	render() {
		return (
				<form onSubmit={this.handleSubmit}>
				<h2>Vuelos</h2>
				<p>
				Viaja desde:
					<select value={this.state.idCiudad} onChange={this.handleChange}>
				{this.state.opts}
				</select>
				</p>
				</form>
		);
	}
}

ReactDOM.render(<CiudadesOrgForm />, document.getElementById('ciudades') );
//*****************Vuelos disponibles***********************************************
class DestinoForm extends React.Component {
	constructor(props) {
		super(props);
		this.state = {opts:[], origen: props.origen};

		this.handleChange = this.handleChange.bind(this);
		this.handleSubmit = this.handleSubmit.bind(this);
		this.componentDidMount = this.componentDidMount.bind(this);
	}

	componentDidMount() {
		let source="http://localhost:8080/aero/vuelos/"+this.state.origen;
		this.serverRequest = $.get(source, function (result) {
			this.setState({opts: result});
		}.bind(this));
	}

	handleChange(event) {
		this.setState({value: event.target.value});
	}

	handleSubmit(event) {
		alert('Your favorite flavor is: ' + this.state.value);
		event.preventDefault();
	}
	
	render() {
		let cant = this.state.opts.length;
		let elemento = null;
		if(cant == 0){
			elemento = <div id='datosDestinos'><h1>Lo sentimos no disponemos de vuelos en el momento...</h1></div>
		}else{
			elemento = <TablaVuelos vuelos={this.state.opts}/>;
		}

		return (elemento);
	}
}

let TablaVuelos = React.createClass({
	render: function() {
		var rows = [];
		this.props.vuelos.forEach(function(reserva) {
			rows.push(<FilaVuelos dato={reserva} />);
		});
			return (
					<div className="container" id='datosDestinos'>
					<table className="table table-striped">
					<thead>
					<tr>
					<th>Vuelo</th>
					<th>Destino</th>
					<th>Hora salida</th>
					<th>Hora llegada</th>
					<th>Valor ida</th>
					<th>Valor ida y vuelta</th>
					</tr>
					</thead>
					<tbody>{rows}</tbody>
					</table>
					</div>);
	}
});

		let FilaVuelos = React.createClass({
			render: function() {
				return (
						<tr>
						<td>{this.props.dato.id}</td>
						<td>{this.props.dato.nom_dest}</td>
						<td>{this.props.dato.horaInic}</td>
						<td>{this.props.dato.horaFin}</td>
						<td>{this.props.dato.vlr_ida}</td>
						<td>{this.props.dato.vlr_idavuelta}</td>
						<td><button onClick={this.handleSubmit} className="btn btn-info">Reservar</button></td>
						</tr>);
			}
		});