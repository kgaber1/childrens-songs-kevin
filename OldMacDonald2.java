/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 
{
    
    public static void eieio() //Give our song lines 1 of the verse.
    { 
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }


    public static void hadA(String animal)  //Give our song line 2 of the verse and insert animal on the farm.
    
    { 
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }


    public static void withA(String sound) //Create lines 3 and 4 and input the sound the animal makes.
    { 
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");  
    }

    
    public static void singIt(String animal, String sound) //sings a verse and passes in the inputted string.
    {
        eieio();
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println();
    }

    
    public static void main(String[] args) //Allows you to put in an animal as a string for it to be inputted into the verse.
    {
        System.out.println("Old MacDonald Had A Farm\n"); // Give our song a title

        singIt("duck", "quack");
        singIt("cow", "moo");
        singIt("horse", "neigh");
        singIt("platypus","gdggdggddgdg");
        singIt("pig","oink");
        singIt("Donkey","heyuh");
        // now see how easy it is to add some more animals  
        
        
        // modify the methods above to get quotation marks around the animal sounds
    }
    
}
