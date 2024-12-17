package lab3.messenger;

import lab3.abstracts.People;

public final class Mail {
    private People people_from;
    private People people_to;

    public Mail(People people_from, People people_to) {
        this.people_from = people_from;
        this.people_to = people_to;
    }

    public void sendMessage(String text) {
        this.people_to.addMessage_to(text, this.people_from);
        this.people_from.addMessage_from(text, this.people_to);
        System.out.println("Было отправлено сообщение от " + this.people_from.getName() + ": " + '"' + text + '"');
    }
}
