/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderegistros;

public class Registro {
    String nombre;
    String correo;
    String passwd;
    
    public Registro(){
        
    }
    
    public Registro(Registro A){
        this.nombre=A.getNombre();
        this.correo=A.getCorreo();
        this.passwd=A.getPasswd();
    }

    public Registro(String nombre, String correo, String passwd) {
        this.nombre = nombre;
        this.correo = correo;
        this.passwd = passwd;
    }

    public void mostrar(){
        System.out.println("Nombre: "+this.nombre+", Correo: "+this.correo+", Contraseña: "+this.passwd);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
