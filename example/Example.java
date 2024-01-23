public class Example
{


    public Example(){

    }

    public Example(int[] userInput){

    }

    //2 options using array or arraylist
    public double findMean(int[] userInput){
        double sum = 0;
        for(int i=0; i<userInput.length; i++){
            sum = userInput[i] + sum;
        }
        double result = sum / userInput.length;
        return result;
    }

    //list must be ordered
    //order the list before typing median
    //call collections or arraylist sort
    public double findMedian(int[] userInput){
        
        return 0;
    }

    public double findMode(int[] userInput){
        return 0;
    }
    












}