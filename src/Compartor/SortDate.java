package Compartor;

import com.core.app.Employees;

import java.util.Comparator;

public class SortDate implements Comparator<Employees> {
    @Override
    public int compare(Employees o1, Employees o2) {
        int temp= o1.getHiredate().compareTo(o2.getHiredate());
        if(temp==0){
            if(o1.getId()<o2.getId())
                return -1;
            else if(o1.getId()>o2.getId())
                return 1;
            else
                return 0;
        }
        else
            return temp;
    }
}
