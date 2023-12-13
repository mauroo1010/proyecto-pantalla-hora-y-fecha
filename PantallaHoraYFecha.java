public class PantallaHoraYFecha

{
    private PantallaDosDigitos pantallaDia;
    private PantallaDosDigitos pantallaMes;
    private PantallaDosDigitos pantallaAño;
    private PantallaDosDigitos pantallaHoras;
    private PantallaDosDigitos pantallaMinutos;
    /**

     * Constructor for objects of class PantallaHoraYFecha

     */
    public PantallaHoraYFecha()

    {
        pantallaDia = new PantallaDosDigitos(1, 31);
        pantallaMes = new PantallaDosDigitos(1, 12);
        pantallaAño = new PantallaDosDigitos(1,999999);
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
    }
    public String getFechaYHora()

    {
        return pantallaHoras.getTextoDeLaPantalla() + ":" + pantallaMinutos.getTextoDeLaPantalla()+" "+pantallaDia.getTextoDeLaPantalla()+"-"+pantallaMes.getTextoDeLaPantalla()+"-"+pantallaAño.getTextoDeLaPantalla();
    }
        public void avanzarMinuto() {
        if (pantallaMinutos.getValorAlmacenado() <= 60) {
            pantallaMinutos.incrementaValorAlmacenado();
            if (pantallaMinutos.getValorAlmacenado() == 0) {
                pantallaHoras.incrementaValorAlmacenado(); 
                if (pantallaHoras.getValorAlmacenado() == 0) {
                    pantallaDia.incrementaValorAlmacenado();
                    if (pantallaDia.getValorAlmacenado() == 1) {
                        pantallaMes.incrementaValorAlmacenado();
                        if (pantallaMes.getValorAlmacenado() == 1) {
                            pantallaAño.incrementaValorAlmacenado();
                        }
                    }
                }
            }
        }
    }
     public void fijarFechaYHora(int minAct, int horaAct, int diaAct, int mesAct, int anoAct) {
        pantallaMinutos.setValorAlmacenado(minAct);
        pantallaHoras.setValorAlmacenado(horaAct);
        pantallaDia.setValorAlmacenado(diaAct);
        pantallaMes.setValorAlmacenado(mesAct);
        pantallaAño.setValorAlmacenado(anoAct);
    }
}
