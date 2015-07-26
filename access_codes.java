import java.util.*;

public class Answer {

    public static int answer(String[] x)
    {
        List<String> al = Arrays.asList(x);

        return getDistinctAccessCodes(al);
    }

    private static int getDistinctAccessCodes(List<String> al)
    {
        Set<String> h = new HashSet<String>(al);
        Iterator<String> i = h.iterator();
        int d = h.size();

        while (i.hasNext())
        {
            String n = i.next();
            String p = new StringBuilder(n).reverse().toString();

            if (!n.equals(p))
            {
                if (h.contains(p))
                {
                    d--;
                    i.remove();
                }
            }
        }

        return d;
    }

}
