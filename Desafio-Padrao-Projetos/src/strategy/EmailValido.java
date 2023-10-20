package strategy;

import java.util.ArrayList;
import java.util.List;

public class EmailValido implements Triagem {
	@Override
    public List<Email> filterEmails(List<Email> emails) {
        List<Email> importantEmails = new ArrayList<>();
        for (Email email : emails) {
            if (email.getAssunto().contains("importante") || email.getMensagem().contains("important")) {
                importantEmails.add(email);
            }
        }
        return importantEmails;
    }
}