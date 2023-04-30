public class Fibonacci
{
    int[] fibArray;
    public Fibonacci()
    {
        fibArray = new int[50];
        this.setFibo();
    }
    public void setFibo()
    {
        fibArray[0]=1;
        fibArray[1]=1;
        for(int i = 2; i<fibArray.length; i++){
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }
    }
    public int[] getFibo()
    {
        return fibArray;
    }
    public String toString()
    {
        return this.getFibo() + "\n";
    }
}