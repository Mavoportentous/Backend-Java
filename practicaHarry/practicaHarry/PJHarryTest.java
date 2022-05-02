package practicaHarry;

public class PJHarryTest {
    public static void main(String[] args){
        definisiones();
    }

    public static void definisiones(){
        PersonajesHarry pj1 = new PersonajesHarry("Gryffindor","Masculino","Harry Potter", "Dementor","Ciervo");
        PersonajesHarry pj2  = new PersonajesHarry("Gryffindor","Femenino","Hermione Jean Granger", "La profesora McGonagall le dice que desaprobÃ³ todos sus exÃ¡menes (fracaso en general)","Nutria");
        PersonajesHarry pj3 = new PersonajesHarry("Gryffindor","Masculino","Ron Weasley", "AraÃ±a","Jack Russell Terrier");
        PersonajesHarry pj4 = new PersonajesHarry("Gryffindor","Masculino","Neville Longbottom", "Severus Snape.","No corpÃ³reo");
        PersonajesHarry pj5 = new PersonajesHarry("Gryffindor","Masculino","Seamus Finnigan", "Banshee","Raposa");
        PersonajesHarry[] personajesArreglo = {pj1,pj2,pj3,pj4,pj5};
        //System.out.print(HarryPotter.patronus);


        for (int i = 0; i < personajesArreglo.length; i++) {
            System.out.println("Nombre: "+ personajesArreglo[i].nombre);
            System.out.println("Genero: "+personajesArreglo[i].genero);
            System.out.println("Casa: "+personajesArreglo[i].casa);
            System.out.println("Boggart: "+personajesArreglo[i].boggart);
            System.out.println("Patronus: "+personajesArreglo[i].patronus);
            System.out.println("---------------");
        }
    }
}
