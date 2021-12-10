package lab9p2_juanoliva_10741313;
public class Usuario {
    private String usuario;
    private String nombre;
    private String pass;
    private int edad;
    private String tipo;

    public Usuario() {
    }

    public Usuario(String usuario, String nombre, String pass, int edad, String tipo) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.pass = pass;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public Object[] usuarioArreglo(){
        Object[] fila = new Object[5];
        fila[0]=usuario;
        fila[1]=nombre;
        fila[2]=pass;
        fila[3]=edad;
        fila[4]=tipo;
        return fila;
    }
    
    
    
    
}
