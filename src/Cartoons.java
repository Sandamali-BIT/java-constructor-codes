public class Cartoons {
    Cartoons (String cartoons){
        String cartoonnames;
        cartoonnames = cartoons;
        System.out.println("Cartoon name is : " + cartoonnames);
    }
    public static void main(String[] args) {
        Cartoons garf = new Cartoons("Garfield");
        Cartoons dw = new Cartoons("Dangara Walige");
        Cartoons mb = new Cartoons("Masha & the Bear");
    }
}
