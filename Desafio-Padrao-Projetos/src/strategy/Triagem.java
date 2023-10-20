package strategy;

import java.util.List;

public interface Triagem {
	 List<Email> filterEmails(List<Email> emails);
}
