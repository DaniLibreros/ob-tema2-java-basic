public class IVAOperator {
    int iva = 21;
    public int totalPrice ( Integer price ){
        if ( price >= 0 ) {
            int ivaResult = price * this.iva / 1000;
            return price + ivaResult;
        } else {
            System.out.println( "precio invalido" );
        }
        return 0;
    }
}
