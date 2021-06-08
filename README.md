# DesignPatterns - Técnicas de (Strategy, Chain of Responsibility, Template Method, State, Command e Observer)



1. Padrões de projeto são soluções genéricas para problemas recorrentes do desenvolvimento de software orientado a objetos;
Existem três principais categorias de padrões de projeto:
Comportamentais (que serão vistos neste treinamento)
Estruturais
Criacionais
Como diminuir a complexidade do nosso código, trocando múltiplas condicionais por classes:
Esta técnica é chamada de STRATEGY, que é um dos padrões de projeto

2. A diferenciar casos onde padrões semelhantes podem ser aplicados;
Como criar uma cadeia de possíveis algoritmos como Chain of Responsibility;
A utilizar o padrão para aplicar um desconto dentro de uma cadeia de possíveis descontos.

3. Reforçamos a ideia de que repetição de código é problemática;
Criamos um template de algoritmo que estava sendo replicado em mais de uma classe e utilizamos herança para reaproveitar esse código:
Aprendemos que a esta técnica foi dado o nome de Template Method;
Vimos que é possível aplicar mais de um padrão no mesmo código.

4. Que é possível que um objeto se comporte de formas diferentes, dependendo do seu estado;
Que, se o resultado de uma chamada de método depende do estado, podemos delegar esta ação para uma classe específica do estado atual:
Aprendemos que a esta técnica foi dado o nome de State.

5.Que um caso de uso em nossa aplicação pode ter várias ações (salvar no banco, enviar e-mail, etc);
Que um caso de uso deve ser extraído para uma classe específica, ao invés de estar no arquivo da CLI, controller ou algo do tipo;
Que a técnica de extração do caso de uso para uma classe específica pode ser chamada de padrão Command;
A diferença do padrão Command da GoF para o padrão que utiliza Command Handler (muito utilizado no padrão de arquitetura Domain Driven Design).

6. Que deixar a implementação de todas as tarefas de um caso de uso da aplicação na mesma classe pode trazer problemas:
Dificuldade de manutenção;
Classes muito grandes e difíceis de ler;
Problemas quando precisar alterar a implementação de uma das tarefas.
Que é mais interessante separar cada ação em uma classe separada;
Como ligar um evento ocorrido com suas ações, através do padrão Observer.
