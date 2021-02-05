#   Criado formulário **JSF/AJAX** com botões que realização solicitações distintas aos Beans.
  
  *Segue abaixo relação de ações executadas pelos eventos:*

  * Botão de evento Listener (*AjaxBehaviorEvent*) que invoca método Bean de escopo de sessão (*SessionScoped*), para incrementar número que aponta quantas vezes foi acionado;  
  * Botão que utiliza do parâmetro execute (na tag `f:ajax`) que invoca o controle oculto (*hidden*) na qual possui o valor (método `get()`/`set()`) do número de vezes que ele foi acionado. Pois como o Bean é de escopo de requisição (*RequestScoped*), o valor não é salvo no evento, pois a requisição após retorno é destruída;  
  * Botão que atualiza a **Data** e **Hora** ao ser acionado, onde também é utilizado o escopo de requisição (*RequestScoped*), mas é acidionado o método `formatData()` para tratar a instância de **LocalDateTime** para obter uma String apresentável ao modelo fornecido. Neste caso, o recurso Ajax (`f:ajax render="@form`) só renderiza o formulário novamente.
