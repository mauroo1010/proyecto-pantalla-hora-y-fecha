public class PantallaHoraYFecha

{
    private PantallaDosDigitos pantallaDia;
    private PantallaDosDigitos pantallaMes;
    private PantallaDosDigitos pantallaA�o;
    private PantallaDosDigitos pantallaHoras;
    private PantallaDosDigitos pantallaMinutos;
    /**

     * Constructor for objects of class PantallaHoraYFecha

     */
    public PantallaHoraYFecha()

    {
        pantallaDia = new PantallaDosDigitos(1, 31);
        pantallaMes = new PantallaDosDigitos(1, 12);
        pantallaA�o = new PantallaDosDigitos(1,999999);
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
    }
    public String getFechaYHora()

    {
        return pantallaHoras.getTextoDeLaPantalla() + ":" + pantallaMinutos.getTextoDeLaPantalla()+" "+pantallaDia.getTextoDeLaPantalla()+"-"+pantallaMes.getTextoDeLaPantalla()+"-"+pantallaA�o.getTextoDeLaPantalla();
    }
}