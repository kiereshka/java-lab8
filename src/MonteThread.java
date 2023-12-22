public class MonteThread extends Thread
{
    public int rightPoints = 0;

    public void run(int points)
    {
        for (int i = 0; i < points; i++)
        {
            double x = Math.random();
            double y = Math.random();

            if(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)) <= 1.0)
            {
                rightPoints++;
            }
        }
    }
}
