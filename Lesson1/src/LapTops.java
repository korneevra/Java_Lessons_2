public class LapTops {

    private String producer;
    private String model;
    public static String univercity = "GB";


    public LapTops(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LapTops lapTops = (LapTops) o;

        if (!producer.equals(lapTops.producer)) return false;
        return model.equals(lapTops.model);
    }

    @Override
    public int hashCode() {
        int result = producer.hashCode();
        result = 31 * result + model.hashCode();
        return result;
       // System.out.println();
    }


}
