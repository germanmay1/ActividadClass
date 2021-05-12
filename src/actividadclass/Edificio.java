/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadclass;

/**
 *
 * @author germa
 */
public class Edificio {
    private String Campus;
    private String Area;
    private boolean EnergiaElectrica;
    private double mts2;

    public Edificio() {
    }

    public Edificio(String Campus, String Area, boolean EnergiaElectrica, double mts2) {
        this.Campus = Campus;
        this.Area = Area;
        this.EnergiaElectrica = EnergiaElectrica;
        this.mts2 = mts2;
    }

    public String getCampus() {
        return Campus;
    }

    public void setCampus(String Campus) {
        this.Campus = Campus;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public boolean isEnergiaElectrica() {
        return EnergiaElectrica;
    }

    public void setEnergiaElectrica(boolean EnergiaElectrica) {
        this.EnergiaElectrica = EnergiaElectrica;
    }

    public double getMts2() {
        return mts2;
    }

    public void setMts2(double mts2) {
        this.mts2 = mts2;
    }
    
    public void Uso() {
        System.out.println("Disponible para todos");
    }
    
    public void condicion() {
        System.out.println("El edificio se encuentra en buenas condiciones");
    }
    
    public void Capacidad() {
        System.out.println("La capacidad máxima es de 100 personas");
    }
    
    public void Acciones() {
        System.out.println("Cuidar a los pacientes");
    }

    @Override
    public String toString() {
        return "Edificio{" + "Campus=" + Campus + ", Area=" + Area + ", EnergiaElectrica=" + EnergiaElectrica + ", mts2=" + mts2 + '}';
    }
    
}
