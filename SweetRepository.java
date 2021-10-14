package com.sweetshopmanagementsystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class SweetRepository {
//    private List sweetList = new ArrayList();
    private Set<Sweet> sweetList = new HashSet();

    public Set getSweetList(){
        return sweetList;
    }

    public void add(Sweet sweet){
        sweetList.add(sweet);
    }

    public void add(Shrikhand shrikhand1){
        sweetList.add(shrikhand1);
    }

    public void delete(Sweet sweet){
        sweetList.remove(sweet);
    }
}
