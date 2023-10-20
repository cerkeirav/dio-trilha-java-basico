package strategy;

import java.util.ArrayList;
import java.util.List;

public class EmailSpam implements Triagem {
	 @Override
	    public List<Email> filterEmails(List<Email> emails) {
	    
	        List<Email> spamEmails = new ArrayList<>();
	        for (Email email : emails) {
	            if (email.getAssunto().contains("spam") || email.getMensagem().contains("spam")) {
	                spamEmails.add(email);
	            }
	        }
	        return spamEmails;
	    }
	}
