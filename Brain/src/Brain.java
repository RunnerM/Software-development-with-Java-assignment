public class Brain {
    private String activeMemoryItem;
    private String passiveMemoryItemOne;
    private String passiveMemoryItemTwo;

    public Brain() {
        this.activeMemoryItem="";
        this.passiveMemoryItemOne="";
        this.passiveMemoryItemTwo="";
        //Todo: implement Constructor.
    }

    public int getIQ() {
//        if () {
//            return 0;
//        }
        //Todo: implement getIQ.
    }

    public void remember(String info) {
        if (info.equals(activeMemoryItem)||info.equals(passiveMemoryItemOne)||info.equals(passiveMemoryItemTwo)){

        }
        // Todo: implement remember.
    }

    public void refreshMemory(String info) {
        //Todo: implement refreshMemory.
    }

    public boolean recall(String info) {
        return false;
        //Todo: implement recall1.
    }

    public String recall() {
        return "";
        //Todo: implement recall2.
    }

    public void bringPassiveToActive(int number) {
        //Todo: implement bringPassiveToActive
    }
}
