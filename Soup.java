//Aaron Johnson
//09/29/26
//This program will allow you to input random string and company names, and they will pop up.
//It also provides numerous quality of life fuctions like being able to remove random words, vowel, and characters.


public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //Precondition: The value word is a non-empty, non-null string that the user inputs
    //Postcondition: replaces the orgianal "letters" string, with the previose letters, plus the input from the user.
    public void add(String word){
       letters += word;
       
    }


    //Precondion: Must input the non-empty, non-null string "letters"
    //Postcondition: Returns a random character from the string "letters".
    public char randomLetter(){
        char randomLetter = letters.charAt((int)(Math.random()*letters.length()));
        return randomLetter;
        
    }


    //Precondition: Must input the non-empty, non-null "letters" string and company, the user input
    //Postcondition: Returns the string letters, but with company name directly in the middle
    public String companyCentered(){
        //substring
        //length
        //concatenate retur
        return letters.substring(0,letters.length()/2) + company + letters.substring(letters.length()/2);
    }


    //Precondition: Input the the non-empty, non-null "letters" string
    //Postcondition: replaces the "letters" string, but with the first vowel gone.
    public void removeFirstVowel(){
        System.out.println(letters.replaceFirst("[aeiouAEIOU]", ""));
    }

   ///Precondition: Must input the non-empty, non-null letters,  along with the user specified amount of letters that should be removed; num
   // Postcondition: Replaces previous letters string, but without the number of letters specefied by the user randomly
    public void removeSome(int num){
        int index = (int)(Math.random() * letters.length());
        int top = index - num;
        String front = letters.substring(0,top);
        String back = letters.substring(index);
        letters = front + back;
    }
    // Precondition: Must input the non-empty, non-null "letters" string.
    //Postcondition: replaces previous letters string with the orevious characters, minus the word "word".
    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
       letters = letters.replaceFirst("word", "");
    }
}
