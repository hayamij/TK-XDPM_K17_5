package business;

public class usecase {
    private int so1;
    private int so2;
    private int result;

    public usecase(String so1, String so2) {
        this.so1 = Integer.parseInt(so1);
        this.so2 = Integer.parseInt(so2);
    }

    // xu ly du lieu
    public int execute() {
        Nhan2So input;
        input = new Nhan2So();
        result = input.nhan(so1, so2);
        return result;
    }

    public DTO dto() {
        DTO dto = new DTO();
        dto.result = result;
        return dto;
    }

}
