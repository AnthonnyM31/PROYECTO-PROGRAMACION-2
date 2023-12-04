package PROYECTO;

public class Estadisticas {
    private double reabastecimientoSnack1;
    private double reabastecimientoSnack2;  //se hará un seguimiento de cuantas existencias hay de cada snack
    private double reabastecimientoSnack3;

    private double gastosSnack1;
    private double gastosSnack2;   //aqui se irá sumando cuanto dinero se ha gastado en reabastecer cada snack y al final se sumará
    private double gastosSnack3;

    private double gananciasSnack1;
    private double gananciasSnack2;   //aqui se irá sumando cuanto dinero se ha ganado con cada snack y al final se sumará
    private double gananciasSnack3;





    public Estadisticas(double reabastecimientoSnack1, double reabastecimientoSnack2, double reabastecimientoSnack3, double gastosSnack1, double gastosSnack2, double gastosSnack3, double gananciasSnack1, double gananciasSnack2, double gananciasSnack3) {
        this.reabastecimientoSnack1 = reabastecimientoSnack1;
        this.reabastecimientoSnack2 = reabastecimientoSnack2;
        this.reabastecimientoSnack3 = reabastecimientoSnack3;
        this.gastosSnack1 = gastosSnack1;
        this.gastosSnack2 = gastosSnack2;
        this.gastosSnack3 = gastosSnack3;
        this.gananciasSnack1 = gananciasSnack1;
        this.gananciasSnack2 = gananciasSnack2;
        this.gananciasSnack3 = gananciasSnack3;

    }

    public double getReabastecimientoSnack1() {
        return reabastecimientoSnack1;
    }

    public void setReabastecimientoSnack1(double reabastecimientoSnack1) {
        this.reabastecimientoSnack1 = reabastecimientoSnack1;
    }

    public double getReabastecimientoSnack2() {
        return reabastecimientoSnack2;
    }

    public void setReabastecimientoSnack2(double reabastecimientoSnack2) {
        this.reabastecimientoSnack2 = reabastecimientoSnack2;
    }

    public double getReabastecimientoSnack3() {
        return reabastecimientoSnack3;
    }

    public void setReabastecimientoSnack3(double reabastecimientoSnack3) {
        this.reabastecimientoSnack3 = reabastecimientoSnack3;
    }

    public double getGastosSnack1() {
        return gastosSnack1;
    }

    public void setGastosSnack1(double gastosSnack1) {
        this.gastosSnack1 = gastosSnack1;
    }

    public double getGastosSnack2() {
        return gastosSnack2;
    }

    public void setGastosSnack2(double gastosSnack2) {
        this.gastosSnack2 = gastosSnack2;
    }

    public double getGastosSnack3() {
        return gastosSnack3;
    }

    public void setGastosSnack3(double gastosSnack3) {
        this.gastosSnack3 = gastosSnack3;
    }


    public double getGananciasSnack1() {
        return gananciasSnack1;
    }

    public void setGananciasSnack1(double gananciasSnack1) {
        this.gananciasSnack1 = gananciasSnack1;
    }

    public double getGananciasSnack2() {
        return gananciasSnack2;
    }

    public void setGananciasSnack2(double gananciasSnack2) {
        this.gananciasSnack2 = gananciasSnack2;
    }

    public double getGananciasSnack3() {
        return gananciasSnack3;
    }

    public void setGananciasSnack3(double gananciasSnack3) {
        this.gananciasSnack3 = gananciasSnack3;
    }
}



