import java.util.ArrayList;
import java.util.List;

public class Cine {

    private String nombre;
    private int nit;
    private int telefono;
    private String direccion;
    private List<Funcion> ListFuncion;
    private List<Pelicula> ListPelicula;
    private List<Sala> ListSala;
    private List<Venta> ListVenta;
    private List<Cliente> ListCliente;

    /**
     * Metodo constructor de la clase cine
     * @param nombre nombre del establecimiento
     * @param nit número de identificación tributaria
     * @param telefono numero de contacto
     * @param direccion dirección del establecimiento
     */
    public Cine(String nombre, int nit, int telefono, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        ListFuncion = new ArrayList<>();
        ListPelicula = new ArrayList<>();
        ListSala = new ArrayList<>();
        ListVenta = new ArrayList<>();
        ListCliente = new ArrayList<>();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Funcion> getListFuncion() {
        return ListFuncion;
    }

    public void setListFuncion(List<Funcion> listFuncion) {
        ListFuncion = listFuncion;
    }

    public List<Pelicula> getListPelicula() {
        return ListPelicula;
    }

    public void setListPelicula(List<Pelicula> listPelicula) {
        ListPelicula = listPelicula;
    }

    public List<Sala> getListSala() {
        return ListSala;
    }

    public void setListSala(List<Sala> listSala) {
        ListSala = listSala;
    }

    public List<Venta> getListVenta() {
        return ListVenta;
    }

    public void setListVenta(List<Venta> listVenta) {
        ListVenta = listVenta;
    }

    public List<Cliente> getListCliente() {
        return ListCliente;
    }

    public void setListCliente(List<Cliente> listCliente) {
        ListCliente = listCliente;
    }
}
