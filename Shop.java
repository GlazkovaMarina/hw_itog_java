import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Shop {
    ArrayList <Toy> allList;
    ArrayList <Toy> prizList;
    static Integer sumFrequencyAllList = 0;
    static Integer sumFrequencyPrizList = 0;

    public Shop(){
        allList = new ArrayList<>();
        prizList = new ArrayList<>();
    }
    
    public void Put(Toy toy){
        for (int i = 0; i < toy.GetFrequency(); i++) {
            allList.add(toy);
            prizList.add(toy);
        }
        sumFrequencyAllList += toy.GetFrequency();
        sumFrequencyPrizList += toy.GetFrequency();
    }
    public Toy Get(){
        if(allList.isEmpty()){
            return null;
        }
        if (prizList.isEmpty()){
            prizList.addAll(allList);
            sumFrequencyPrizList = sumFrequencyAllList;
        }
        Toy priz = prizList.remove((int)(Math.random() * sumFrequencyPrizList--));
        FileWrite(priz);
        return priz; 
    }
    public Boolean FileWrite(Toy toy){
        try(FileWriter writer = new FileWriter("toys.txt", true))
        {
            writer.write(toy.GetName());
            // запись по символам
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
        return true;
    }

}
