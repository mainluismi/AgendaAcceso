package Entidad;

public class Trabajador {
    private String dni;
    private String nombre;
    private String apellidos;
    private double sueldos;
    private String fecha;
    private String matricula;

    public Trabajador() {

    }

    public Trabajador(String dni, String nombre, String apellidos, double sueldos, String fecha, String matricula) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldos = sueldos;
        this.fecha = fecha;
        this.matricula = matricula;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSueldos() {
        return sueldos;
    }

    public void setSueldos(double sueldos) {
        this.sueldos = sueldos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}