import java.util.List;
import java.util.ArrayList;

public class ListaTarefas
{
    // Atributo que é uma lista do tipo Tarefa
    private List<Tarefa> tarefas;

   
    public ListaTarefas()
    {
       this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
    	tarefas.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao) {
    	List<Tarefa> tarefasParaRemover = new ArrayList<>();
    	for (Tarefa tarefa : tarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(tarefa);
			}
		}
    	tarefas.removeAll(tarefasParaRemover);
    }
    
    public int obterNumeroTotalDeTarefas() {
    	return tarefas.size();
    }
    
    public void obterDescricaoDasTarefas() {
    	System.out.println(tarefas.toString());
    }
    
 

//	public static void main(String[] args) {
//    	ListaTarefas  listaDeTarefas = new ListaTarefas();
//    	System.out.println("o numero total de elemntos na lista é: " + listaDeTarefas.obterNumeroTotalDeTarefas());
//    	listaDeTarefas.adicionarTarefa("Tarefa 01");
//    	listaDeTarefas.adicionarTarefa("Tarefa 02");
//    	listaDeTarefas.adicionarTarefa("Tarefa 02");
//    	listaDeTarefas.adicionarTarefa("Tarefa 03");
//    	System.out.println("o numero total de elemntos na lista é: " + listaDeTarefas.obterNumeroTotalDeTarefas());
//    	listaDeTarefas.removerTarefa("Tarefa 02");
//    	System.out.println("o numero total de elemntos na lista é: " + listaDeTarefas.obterNumeroTotalDeTarefas());
//    	listaDeTarefas.obterDescricaoDasTarefas();
//    }
}