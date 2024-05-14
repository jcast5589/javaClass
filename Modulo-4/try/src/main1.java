public class main1 {
    public static void main(String[] args) {
        int [] numeros = {1,2,3};
        try {
            System.out.println(numeros [1]);
            
        } catch (Exception e) {
            System.out.println("A veces los problemas suceden");
            //System.out.println(numeros [1]);
        } finally {
            System.out.println("Hey - ya se termino por medio del finally");
        }
        

    }
}
