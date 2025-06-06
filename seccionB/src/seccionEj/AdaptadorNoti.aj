package seccionEj;

public aspect AdaptadorNoti {
	declare parents: AntiguoSistemaNotificacion implements NuevoSistemaNotificacion;
	public void AntiguoSistemaNotificacion.notificar(String mensaje){
		enviarMensaje(mensaje);
	}

}
