import java.util.*;
public class Activity{
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //SORTING PART
        //Arrays.sort(end);
        int Activity[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            Activity[i][0]=i;
            Activity[i][1]=start[i];
            Activity[i][2]=end[i];

        }
        //LAMDA FUNCTION COMPARATORS
        Arrays.sort(Activity,Comparator.comparingDouble(o->o[2]));
        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();
        //1st Activity
        maxAct=1;
        ans.add(Activity[0][0]);
        int lastEnd=Activity[0][2];
        for(int i=1;i<end.length;i++){
            if(Activity[i][1]>=lastEnd){
                //Activity selected
                maxAct++;
                ans.add(Activity[i][0]);
                lastEnd=Activity[i][2];
            }
        }
        System.out.println("Max Activity="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}