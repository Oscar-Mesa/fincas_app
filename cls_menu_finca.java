import javax.swing.JOptionPane;

public class cls_menu_finca{

    cls_fincas[] fincasArray = new cls_fincas[10];

    int int_posicion = 0;

    private String str_nombre;
    private String str_codigo;
    private String str_extension;
    private String str_propietario;
    private String str_direccion;
    private String str_ubicacion;
    private String str_prom_produccion;
    private String str_act_economica;

    public static void main(String[] args) {
        cls_menu_finca menuFinca = new cls_menu_finca();
    }


    cls_menu_finca(){
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null,"<< MENU FINCA >> \n 1. Registrar \n2. Actualizar \n3. Consultar"));
        
        if(menu == 1){
            fnt_registrar();
        }
    }

    public void fnt_registrar(){
        str_nombre = JOptionPane.showInputDialog(null,"Nombre de la finca");
        str_codigo = JOptionPane.showInputDialog(null,"Código");
        str_extension = JOptionPane.showInputDialog(null,"Extensión en MT2");
        str_propietario = JOptionPane.showInputDialog(null,"Nombre del propietario");
        str_direccion = JOptionPane.showInputDialog(null,"Dirección de la finca");
        str_ubicacion = JOptionPane.showInputDialog(null,"Ubicación");
        str_prom_produccion = JOptionPane.showInputDialog(null,"Promedio de producción de la finca");
        str_act_economica = JOptionPane.showInputDialog(null,"Actividad economica que realiza la finca");

        fincasArray[int_posicion] = new cls_fincas(str_nombre, str_codigo, str_direccion,str_extension,str_propietario, str_ubicacion, str_prom_produccion, str_act_economica);
        int_posicion += 1;
    }
}