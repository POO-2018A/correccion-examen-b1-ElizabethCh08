import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contador=0;

        Libro []libros = new Libro[10];

        int opcion=0;
        Autor[] autores = new Autor[3];

        autores[0] = new Autor("A1", "ECU");
        autores[1] = new Autor("A2", "COL");
        autores[2] = new Autor("A3", "ARG");

        do {
            System.out.println("\tBIBLIOTECA PERSONAL");
            System.out.println("1.Ingresar nuevo libro");
            System.out.println("2.Lista de todos los libros");
            System.out.println("3.Libros de cada autor");
            System.out.println("4.Salir");
            System.out.print("Seleccione la opcion que desee:");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:

                    int contador1=1;
                    String favoritoString;
                    boolean favorito;


                    System.out.println("Libro #" + contador1);
                    System.out.print("Ingrese el titulo del libro:");
                    scan.nextLine();
                    String titulo = scan.nextLine();
                    System.out.print("Ingrese el año:");
                    int anio = scan.nextInt();
                    System.out.print("¿Es favorito?:  Si = 'Si' No = 'No' ");
                    favoritoString = scan.nextLine();
                    favorito = favoritoString.equals("si");
                    scan.nextLine();

                    System.out.println("Seleccione el autor");
                    System.out.println("1. " + autores[0].getNombre());
                    System.out.println("2. " + autores[1].getNombre());
                    System.out.println("3. " + autores[2].getNombre());
                    int opcionAutor = scan.nextInt();
                    scan.nextLine();

                    Autor autorLibro = autores[(opcionAutor - 1)];

                    Libro guardar = new Libro(titulo, anio, favorito, autorLibro);
                    libros[contador] = guardar;
                    contador++;

                    break;

                case 2:

                    System.out.println("\tLista de libros:");

                    if (contador == 0) {
                        System.out.println("No hay libros favoritos");
                    } else {
                        for (Libro libro : libros) {
                            if (libro != null && libro.isFavorito()) {
                                System.out.println(libro);
                            }
                        }
                    }
                    break;
                case 3:

                    System.out.println("\t Libros de cada autor:");
                    System.out.println("Seleccione el autor  al que pertenece");
                    System.out.println("1. " + autores[0].getNombre());
                    System.out.println("2. " + autores[1].getNombre());
                    System.out.println("3. " + autores[2].getNombre());

                    int opcionAutor1 = scan.nextInt();
                    scan.nextLine();

                    Autor autorSeleccionado = autores[(opcionAutor1 - 1)];

                    int contadorLibrosAutor = 0;

                    for (Libro libro : libros) {
                        if (libro != null && libro.getAutor().equals(autorSeleccionado)) {
                            contadorLibrosAutor++;
                        }
                    }

                    System.out.println("El autor tiene  " + contadorLibrosAutor+ " libro/os");
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opciion incorrecta");
                    break;

            }

        }while(opcion != 4);



    }




    }
