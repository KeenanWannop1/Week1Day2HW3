import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Week1Day2 {
    public static void main(String[] args) {

    }

        public static  List findDuplicates(List<String> strings) {
            HashMap<String, Integer> duplicateMap=new HashMap<>();

            for(String a:strings){
                duplicateMap.put(a,0);
            }
            for(String a:strings){
                duplicateMap.put(a,duplicateMap.get(a).intValue()+1);
            }
            List list=new ArrayList();

            for(String a:duplicateMap.keySet()){
                if(duplicateMap.get(a) > 1){
                    list.add(a);
                }
            }
            return list;
        }
        public static Boolean checkPalindrome(String word){
        int length = word.length() - 1;
        for(int x = 0; x<word.length();x++){
            if(word.charAt(x) != word.charAt(length)){
                return false;
            }
        }
        return true;
        }
        public void fizzBuzz(int count){
            int modThree = 0;
            int modFive = 0;
            for(int x = 0; x<=count; x++){
                modThree = x % 3;
                modFive = x % 5;
                if(modThree == 0 && modFive != 0){
                    System.out.println("fizz");
                }
                else if(modThree != 0 && modFive == 0){
                    System.out.println("buzz");
                }
                else if(modThree == 0 && modFive == 0){
                    System.out.println("fizzbuzz");
                }
                else{
                    System.out.println(x);
                }
            }
        }
        public boolean checkAnagrams(String word1, String word2){
            if(word1.length() != word2.length()) {
                return false;
            }
            for(int x = 0; x < word1.length(); x++) {
                char c = word1.charAt(x);
                for (int y = 0; y < word2.length(); y++) {
                    if (c != word2.charAt(y)) {
                        return false;
                    }

                }
            }
            return true;
        }
        public void printTables(){
           Integer[][] intArray = new Integer[10][10];
           for(int x = 1; x<11; x++){
               for(int y = 0; y<11; y++){
                   intArray[x][y] = x*(y+1);
               }
           }
           for(int x = 0; x<10; x++){
               for(int y = 0; y<10; y++){
                   System.out.print(intArray[x][y] + " ");
               }
               System.out.println("");
           }
        }


    }

