package PROYECTO;

public class Sala {

 private String numero_sala;
 private String nombre_pelicula;
 private int  duracion_pelicula;
 private String  sinopsis_pelicula;
 private String horario_pelicula;

    public Sala() {}

    public Sala(String numero_sala, String nombre_pelicula, int duracion_pelicula, String sinopsis_pelicula, String horario_pelicula) {
        this.numero_sala = numero_sala;
        this.nombre_pelicula = nombre_pelicula;
        this.duracion_pelicula = duracion_pelicula;
        this.sinopsis_pelicula = sinopsis_pelicula;
        this.horario_pelicula = horario_pelicula;
    }

    public String getNumero_sala() {
        return numero_sala;
    }

    public void setNumero_sala(String numero_sala) {
        this.numero_sala = numero_sala;
    }

    public String getNombre_pelicula() {
        return nombre_pelicula;
    }

    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public int getDuracion_pelicula() {
        return duracion_pelicula;
    }

    public void setDuracion_pelicula(int duracion_pelicula) {
        this.duracion_pelicula = duracion_pelicula;
    }

    public String getSinopsis_pelicula() {
        return sinopsis_pelicula;
    }

    public void setSinopsis_pelicula(String sinopsis_pelicula) {
        this.sinopsis_pelicula = sinopsis_pelicula;
    }

    public String getHorario_pelicula() {
        return horario_pelicula;
    }

    public void setHorario_pelicula(String horario_pelicula) {
        this.horario_pelicula = horario_pelicula;
    }



    public boolean Vacio() {
        return nombre_pelicula == null && horario_pelicula == null;
    }

    public boolean tieneDatos() {

        return nombre_pelicula != null && horario_pelicula != null;
    }


    public String verificarDatos() {
        System.out.println();
        if (nombre_pelicula != null && horario_pelicula != null) {
            return "LA SALA YA CONTIENE DATOS, no es recomendable elegir esta sala";
        } else {
            return "SALA SIN DATOS, POR FAVOR AGREGUE DATOS";
        }

    }


    public void eliminarDatos(){


        this.nombre_pelicula = null;
        this.duracion_pelicula = 0;
        this.sinopsis_pelicula = null;
        this.horario_pelicula = null;

    }

    public void MensajePrueba(){
        System.out.println("esta sala se encuentra vacia");

    }
    @Override
    public String toString() {
        System.out.println();
        return
                "" + numero_sala + "'\n''" +
                ", nombre_pelicula=' " + nombre_pelicula + "  -----------  " +
                ", duracion_pelicula= " + duracion_pelicula +" minutos  \n"+
                ", horario_pelicula=' " + horario_pelicula + "  -----------  " +
                ", sinopsis_pelicula=' " + sinopsis_pelicula + "'\n''" +
                '}';

    }


}
