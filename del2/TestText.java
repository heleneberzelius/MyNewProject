package del2;

public class TestText {
    private String myText1 = "";
    private int addRows = 0;
    private int addCharacters;
    private boolean isStopped;

    public TestText() {
        isStopped = false;
    }

    public void lines(String data) {


        myText1 = data;

        if (myText1.equals("stop")) {
            //stop counting
            isStopped = true;


        } else {

            addRows++;
        }
    }


        public int getRows () {

            return addRows;
        }


        public int getCharacters () {
            return addCharacters;

        }

        public void addCharacters (String myInfo){


            myText1 = myInfo;
            if (myText1.equals("stop")) {
                //stop counting
                isStopped = true;

            } else {
                addCharacters = addCharacters + myText1.length();

            }

        }

        public int countStopCharacters () {
            return 0;


        }

        public boolean isStopped () {
            return isStopped;

        }
    }

