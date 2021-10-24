package oops;
class SmartTvRemote {
    void smartTvRemote(){
        System.out.println("SmartTvRemote...");
    }
}

class TvRemote extends SmartTvRemote {
    void tvRemote(){
        System.out.println("TvRemote...");
    }
}

public class Tv extends TvRemote{

	public static void main(String[] args) {
		TvRemote remote = new Tv();
        remote.smartTvRemote();
        remote.tvRemote();

	}

}
