package traducoresfinal;


import visitor.Visitor1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author admin
 * SI SE SELECCIONA TODOS LOS ARCHIVOS NUEVOS AGREGADOS + REFACTOR + MOVE + REFACTOR AGREGA LOS PAQUETES AUTOMATICO
 */
public class TraductoresFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
            FinalLanguage leng= new FinalLanguage(System.in); //system.in del telclado sobre el ejercicio1
            leng.SentenciaMuchas(); //manda a llamar funcion probar
            Visitor1 v = new Visitor1();
            
        } catch (TokenMgrError e){
            //errores lexicos
            System.out.println("Error lexico " + e.getMessage());
        }
        catch (ParseException e){
            //errores sintacticos
            System.out.println("Error sintactico " + e.getMessage());
         }
         catch(SemanticException e){
             System.out.println("Error semantico: " + e.getMessage());
         }
    }
    
}
