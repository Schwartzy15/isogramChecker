class IsogramChecker {

    boolean isIsogram(String phrase) {
        
        boolean result = true;
        int length = phrase.length();   //get length of phrase
        char compareArr[] = new char[length];   //char array to store phrase

        for(int i = 0; i < length; i++) {   //Convert string to char array
            compareArr[i] = phrase.charAt(i);
            compareArr[i] = Character.toLowerCase(compareArr[i]);   //convert all chars to lowercase
        }

        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                if(compareArr[i] == compareArr[j] && compareArr[i] != '-' && compareArr[i] != ' ') { //check for repeated chars, but ignore 
                    result = false;     //if true, set flag to false                                 //hyphens and spaces
                    break;
                } 
            }
        }
        return result;
    }
}
