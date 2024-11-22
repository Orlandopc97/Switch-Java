public class Main {
    public static void main(String[] args) {
        //Cuando hay demasiados else if


        //¿Que tipo de bebida te gusta?
        String bebida =  "Jugo de naranja";

        switch (bebida){
            case "cafe":
                System.out.println("Buena eleccion a mi tambien me gusta el cafe");
                break;
            case "mate":
                System.out.println("Debes ser argentino o uruguayo");
                break;
            case "gaseosa":
                System.out.println("Debes tener cuidado con el azucar");
              break;
            case "vino":
                System.out.println("Tener cuidado si tomas no manejes");
                break;
            default:
                break;
        }

        if (bebida == "cafe"){
            System.out.println("Buena eleccion a mi tambien me gusta el cafe");
        }else if (bebida == "mate"){
            System.out.println("Debes ser argentino o uruguayo");
        } else if (bebida == "gaseosa") {
            System.out.println("Debes tener cuidado con el azucar");
        } else if (bebida == "vino") {
            System.out.println("Si tomas no manejes");
        }else {
            System.out.println("Disfruta de tu bebida");
        }
    }
}