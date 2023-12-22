public class MonteMethod
{
    int totalPoints = 0, rightPoints = 0;
    public MonteMethod(int AllPoints,int threadCount)
    {
        for (int i = 0; i < threadCount; i++)
        {
            totalPoints = AllPoints;
            MonteThread thread = new MonteThread();
            thread.run(totalPoints/threadCount);
            rightPoints += thread.rightPoints;
        }
    }

    public double pi()
    {
        return ((double)rightPoints/(double)totalPoints) * 4;
    }
}