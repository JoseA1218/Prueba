package P1;


import java.util.Date;

public class Correo {
	private String origen;
	private String destino;
	private String asunto;
	private String cuerpo;
	private Date fecha;
	
	
	public Correo(String origen, String destino, String asunto, String cuerpo, Date fecha) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		this.fecha = fecha;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getAsunto() {
		return asunto;
	}


	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}


	public String getCuerpo() {
		return cuerpo;
	}


	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	public void bandeja() {
		System.out.println("Origen: "+origen+" Asunto: "+asunto+" Fecha: "+fecha);
	}
	
	
	

	
	
	}
