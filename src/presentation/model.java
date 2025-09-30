package presentation;

public class model extends Publisher {
    int result = 0;
    
    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
        notifySubscribers();
    }
    
    public void subscribe(Subscriber sub) {
        registerSubscriber(sub);
    }
}
