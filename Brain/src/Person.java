public class Person {
    private String name;
    private Brain brain;

    public Person(String name) {
        this.name = name;
        brain = new Brain().copy();
    }

    public String getName() {
        return name;
    }

    public int getIQ() {
        return brain.getIQ();
    }

    public boolean doYouRememberThis(String topic) {
        if (brain.recall(topic)){
            return true;
        }else{
            return false;
        }

        //Todo: test if it works like it is supposed to
    }

    public void learnATopic(String topic) {
        brain.remember(topic);
        //Todo: Fix Brain.java remember() method
    }

    public String presentTopic(int number) {
        if (number <=3 && number > 0){
        switch(number){
            case 2: {
                brain.bringPassiveToActive(1);
                return brain.recall();
            }
            case 3: {
                brain.bringPassiveToActive(2);
                return brain.recall();
            }
            default: return brain.recall();
        }
        }else{
            return "ERROR presentTopic("+number+"): Input Int 1,2 or 3";
        }
        //Todo: Test
    }

    @Override
    public String toString() {
        return "Name: "+getName()+" IQ: "+getIQ()+" Topic1: "+presentTopic(1)+" Topic2: "+ presentTopic(2)+" Topic3: "+presentTopic(3);
        //Todo: Test presentTopic if it works like planned
    }

}
