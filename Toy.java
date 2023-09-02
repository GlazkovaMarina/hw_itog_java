public class Toy {
    private Integer id;
    private String name;
    private Integer frequency;
    private static Integer count = 0;

    public Toy(String name, Integer frequency) {
        count++;
        this.id = count;
        this.name = name;
        this.frequency = frequency;
        
    }

    public Integer ChangeFrequency(Integer frequency) {
        this.frequency = frequency;
        return this.frequency;
    }
    public Integer GetFrequency(){
        return frequency;
    }
    public String GetName(){
        return name;
    }

}