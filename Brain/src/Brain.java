public class Brain {
    private String activeMemoryItem;
    private String passiveMemoryItemOne;
    private String passiveMemoryItemTwo;

    public Brain() {
        this.activeMemoryItem = "";
        this.passiveMemoryItemOne = "";
        this.passiveMemoryItemTwo = "";
    }

    public Brain(String activeMemoryItem, String passiveMemoryItemOne, String passiveMemoryItemTwo) {
        this.activeMemoryItem = activeMemoryItem;
        this.passiveMemoryItemOne = passiveMemoryItemOne;
        this.passiveMemoryItemTwo = passiveMemoryItemTwo;
    }

    public int getIQ() {
        if ((activeMemoryItem.length()>10 && passiveMemoryItemOne.length()>10 && passiveMemoryItemTwo.length()>10)&&
                (activeMemoryItem.length()>20^passiveMemoryItemOne.length()>20^passiveMemoryItemTwo.length()>20)) {
            return 130;
        }
        if (activeMemoryItem.length()>10 && passiveMemoryItemOne.length()>10 && passiveMemoryItemTwo.length()>10){
            return 100;
        }
        if(activeMemoryItem.length()<10 || passiveMemoryItemOne.length()<10 || passiveMemoryItemTwo.length()<10){
            return 70;
        }
        return 0;

        // Todo: Testing shows 70IQ no matter the length of stored info
    }

    public void remember(String info) {
        if (info.equals(activeMemoryItem) || info.equals(passiveMemoryItemOne) || info.equals(passiveMemoryItemTwo)) {
            refreshMemory(info);
        } else {
            if (activeMemoryItem.equals("")) {
                activeMemoryItem = info;
            }
            if (passiveMemoryItemOne.equals("")) {
                String helper = activeMemoryItem;
                activeMemoryItem = info;
                passiveMemoryItemOne = helper;
            } else {
                String helper1 = activeMemoryItem;
                String helper2 = passiveMemoryItemOne;
                activeMemoryItem = info;
                passiveMemoryItemOne = helper1;
                passiveMemoryItemTwo = helper2;
            }
        }

        //Todo: Testing shows that remember() stores info in 2 empty spots - Topic 1 and topic 3, Also Storing more info then stores that info into Topic 1 and Topic 2
    }

    public void refreshMemory(String info) {
        if (info.equals(passiveMemoryItemOne)) {
            String helper = activeMemoryItem;
            activeMemoryItem = passiveMemoryItemOne;
            passiveMemoryItemOne = helper;
        }
        if (info.equals(passiveMemoryItemTwo)) {
            String helper1 = activeMemoryItem;
            String helperA = passiveMemoryItemTwo;
            String helper2 = passiveMemoryItemOne;
            activeMemoryItem = helperA;
            passiveMemoryItemOne = helper1;
            passiveMemoryItemTwo = helper2;
        }
    }

    public boolean recall(String info) {
        if (info.equals(activeMemoryItem) || info.equals(passiveMemoryItemOne) || info.equals(passiveMemoryItemTwo)) {
            refreshMemory(info);
            return true;
        }
        return false;
    }

    public String recall() {
        return this.activeMemoryItem;
    }

    public void bringPassiveToActive(int number) {
        switch (number){
            case 1:refreshMemory(this.passiveMemoryItemOne);
            case 2:refreshMemory(this.passiveMemoryItemTwo);
            default:
                System.out.println("Error with argument!");
        }
    }

    public Brain copy() {
        return new Brain(this.activeMemoryItem, this.passiveMemoryItemOne, this.passiveMemoryItemTwo);
    }
}
