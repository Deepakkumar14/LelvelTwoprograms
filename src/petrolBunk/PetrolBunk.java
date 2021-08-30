package petrolBunk;


public class PetrolBunk {
    private static int initialPetrol=2;
    public static void main(String[] args) {
        int[] distance={1,5,3};
        int[] capacity={6,4,2};
        char[] petrolBunk={'A','B','C'};

            for(int i=0;i< distance.length;i++){
                if(initialPetrol>=distance[i]) {
                    initialPetrol = initialPetrol - distance[i];
                    System.out.println("Reached petrolBunk " + petrolBunk[i]);
                    initialPetrol += capacity[i];
                }
                else {
                    System.out.println("Cannot travel to petrol bunk " + petrolBunk[i] + " Insufficient petrol  " + initialPetrol + "  litres");
                    break;
                }
            }
        System.out.println("Remaining petrol in car is  "+initialPetrol+ "  litres");
        }
}
