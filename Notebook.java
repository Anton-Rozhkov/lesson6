class Notebook {
    String cpu_type;
    Integer cpu_frecuensy;
    String ram_type;
    Integer ram_capacity;
    String drive_type;
    Integer drive_volume;
    public Notebook(String cpu_type, Integer cpu_frecuensy,String ram_type,Integer ram_capacity,String drive_type,Integer drive_volume) {
        this.cpu_type = cpu_type;
        this.cpu_frecuensy = cpu_frecuensy;
        this.ram_type = ram_type;
        this.ram_capacity = ram_capacity;
        this.drive_type = drive_type;
        this.drive_volume = drive_volume;
        }
    @Override
    public String toString() {
        return "Notebook{" +
                "cpu_type=" + cpu_type +
                ", cpu_frecuensy=" + cpu_frecuensy +
                ", ram_type='" + ram_type + '\'' +
                ", ram_capacity='" + ram_capacity + '\'' +
                ", drive_type='" + drive_type + '\'' +
                ", drive_volume='" + drive_volume + '\'' +
                '}';
        }
}