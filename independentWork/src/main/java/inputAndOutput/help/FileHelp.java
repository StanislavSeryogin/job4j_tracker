package inputAndOutput.help;

public class FileHelp {
    public static void main(String[] args) {
        Help hlpobj = new Help("helpfile.txt");
        String topic;

        System.out.println("Used help system.\n" + "To log out enter 'stop'.");

        do {
            topic = hlpobj.getSelection();
            if (!hlpobj.helpon(topic)) {
                System.out.println("Topic not found.\n");
            }
        } while (topic.compareTo("stop") != 0);
    }
}
