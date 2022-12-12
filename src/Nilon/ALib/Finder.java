package Nilon.ALib;

public class Finder {
    /**
     *
     * @param character the character to find
     * @param string the string to search
     * @return index of string (+1 for literal)
     */
    public static int FindCharacter(String character, String string){
        //System.out.println(character+" is at index " + index + " or literal(+1) " + literal);
        return string.indexOf( character );
    }

    /**
     *
     * @param string the string to convert to an int
     * @return integer version of your input OR null if an error occurred
     */
    public static Object toIntOverride(String string){
        try {
            return Integer.parseInt(string);
        }catch (Exception e){
            return null;
        }
    }
}
