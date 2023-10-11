public class cls_fincas{
    private String str_nombre;
    private String str_codigo;
    private String str_direccion;
    private String str_extencion;
    private String str_propietario;
    private String str_ubicacion;
    private String str_produccion;
    private String str_act_economica;

    public cls_fincas( String nombre, String codigo, String direccion, String extencion, String propietario, String ubicacion, String produccion, String act_economica){
        this.str_nombre = nombre;
        this.str_codigo = codigo;
        this.str_direccion = direccion;
        this.str_extencion = extencion;
        this.str_propietario = propietario;
        this.str_ubicacion = ubicacion;
        this.str_produccion = produccion;
        this.str_act_economica = act_economica;
    }
    public void setnombre(String nombre){this.str_nombre = nombre;}
    public void setdireccion(String direccion){this.str_direccion = direccion;}
    public void setextencion(String extencion){this.str_extencion = extencion;}
    public void setpropietario(String propietario){this.str_propietario = propietario;}
    public void setubicacion(String ubicacion){this.str_ubicacion = ubicacion;}
    public void setproduccion(String produccion){this.str_produccion = produccion;}
    public void setact_economica(String act_economica){this.str_act_economica = act_economica;}

    public String getnombre(String nombre){return str_nombre;}
    public String getcodigo(String codigo){return str_codigo;}
    public String getdireccion(String direccion){return str_direccion;}
    public String getextencion(String extencion){return str_extencion;}
    public String getproietario(String proptar){return str_propietario;}
    public String getubicacion(String ubicacion){return str_ubicacion;}
    public String getproduccion(String produccion){return str_produccion;}
    public String getact_economica(String act_economica){return str_act_economica;}

}