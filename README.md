# Regra de Progressão

## Descrição

O **Regra de Progressão** é um programa desenvolvido em Java, como parte do meu primeiro projeto ao iniciar meus estudos do curso de Java na Trybe, projetado para ajudar estudantes a gerenciarem suas atividades avaliativas e acompanharem seu progresso acadêmico. O sistema oferece uma interface intuitiva no terminal, permitindo o cadastro de tarefas, o acompanhamento de notas e o cálculo automático do percentual de aprovação.

## Funcionalidades

1. **Cadastro de Atividades Avaliativas**:  
   O usuário pode cadastrar tanto exercícios quanto projetos que fazem parte do período letivo. Isso proporciona um controle total sobre as tarefas e metas a serem alcançadas.

2. **Inserção de Notas**:  
   Após cadastrar as atividades, o usuário pode inserir as notas obtidas. O sistema calculará automaticamente o percentual de desempenho. Cada uma dessas atividades vale até 100%, porém cada atividade com um peso diferente que deverá ser informado.

3. **Verificação de Aprovação**:  
   Com base no percentual calculado, o usuário poderá verificar se foi aprovado ou reprovado no período. O sistema considera uma aprovação para percentuais iguais ou superiores a 85%.

## Requisitos de Aprovação

- O usuário precisa alcançar um percentual de **85% ou mais** para ser aprovado e progredir para o próximo período.

## Tecnologias Utilizadas

- Java (versão 11+)
- Biblioteca de entrada/saída padrão do Java para interação via terminal.

## Como Executar

1. Clone este repositório em sua máquina:

    ```bash
    git clone https://github.com/SeuUsuario/regra-de-progressao.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd regra-de-progressao
    ```

3. Compile o projeto:

    ```bash
    javac Main.java
    ```

4. Execute o programa:

    ```bash
    java Main
    ```

## Exemplo de Uso

Após iniciar o programa, o usuário poderá cadastrar suas atividades, como exercícios ou projetos, e posteriormente inserir as notas correspondentes. O sistema mostrará:

- Percentual de desempenho.
- Status de aprovação baseado no critério de 85%.
