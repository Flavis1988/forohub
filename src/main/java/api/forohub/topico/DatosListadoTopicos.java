package api.forohub.topico;

public record DatosListadoTopicos(Long id, String titulo, String mensaje, String fecha, String autor, String curso) {

    public DatosListadoTopicos (Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getAutor(), topico.getCurso());
    }
}
