package seccionEj;

public class mainNotificacion {
	public static void main(String[] args) {
        AntiguoSistemaNotificacion viejo = new AntiguoSistemaNotificacion();
        NuevoSistemaNotificacion adaptado = (NuevoSistemaNotificacion) viejo;
        adaptado.notificar("Hola");
    }
}
