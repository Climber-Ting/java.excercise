import java.util.*;
/*
    给定一个栈及一个操作序列int[][2] ope(C++中为vector<vector<int>>)，代表所进行的入栈出栈操作。
    第一个元素为1则入栈，第二个元素为数的正负号；
    第一个元素为2则出栈，第二个元素若为0则出最先入栈的那个数，为1则出最先入栈的正数，
    为-1则出最先入栈的负数。
    请按顺序返回出栈的序列，并做异常处理忽略错误操作。
    测试样例：
    [[1,1],[1,-1],[2,0],[2,-1]]
    返回：[1,-1]
 */
public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        ArrayList<Integer> de=new ArrayList<>() ;
        ArrayList<Integer> stk=new ArrayList<>() ;
        for(int i=0;i<ope.length;i++){
            if(ope[i][0]==1){   //入栈
                de.add(ope[i][1]);
            }
            else if(ope[i][0]==2){    //出栈
                if (ope[i][1]==0){    //出最先入栈的那个数
                    if(!de.isEmpty()){
                        stk.add(de.remove(0));
                    }
                }
                else if (ope[i][1]==1){    //出最先入栈的正数
                    for(int k=0;k<de.size();k++){
                        if(!de.isEmpty()){
                            if(de.get(k)>0){
                                stk.add(de.remove(k));
                                break;
                            }
                        }
                    }
                }
                else if (ope[i][1]==-1){    //出最先入栈的负数
                    for(int k=0;k<de.size();k++){
                        if(!de.isEmpty()){
                            if(de.get(k)<0){
                                stk.add(de.remove(k));
                                break;
                            }
                        }
                    }
                }
            }
        }
        return stk;
    }

    public ArrayList<Integer> asylum1(int[][] ope) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        int len=ope.length;
        for(int i=0;i<len;i++){
            if(ope[i][0]==1){
                arr.add(ope[i][1]);
            }else if(ope[i][0]==2){
                if(ope[i][1]==0){
                    if(!arr.isEmpty()){
                        res.add(arr.remove(0));
                    }
                }else if(ope[i][1]==1){
                    for(int k=0;k<arr.size();k++){
                        if(!arr.isEmpty()){
                            try{
                                if(arr.get(k)>0){
                                    res.add(arr.remove(k));
                                    break;
                                }
                            }catch(Exception e){
                                continue;
                            }
                        }
                    }
                }else if(ope[i][1]==-1){
                    for(int k=0;k<arr.size();k++){
                        if(!arr.isEmpty()){
                            try{
                                if(arr.get(k)<0){
                                    res.add(arr.remove(k));
                                    break;
                                }
                            }catch(Exception e){
                                continue;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
