# Projeto RPG - Sistema de Batalha em Java

Este projeto foi desenvolvido como trabalho prático para a disciplina de **Linguagem de Programação Orientada a Objetos**. O objetivo é simular um sistema simples de RPG focado na modelagem de classes, herança e interação entre objetos.

## 📋 Sobre o Projeto

O sistema modela um cenário de combate onde diferentes tipos de personagens (como Magos, Paladinos e Clérigos) podem equipar armas específicas e interagir entre si. O projeto foca na aplicação estrita dos pilares da POO.

### Funcionalidades e Conceitos Aplicados

* **Abstração:** Uso de classes abstratas (ex: `Personagem`, `Arma`) para definir modelos genéricos.
* **Herança:** Criação de classes específicas (ex: `Mago`, `Espada`) que herdam comportamentos das classes pai.
* **Encapsulamento:** Atributos protegidos com modificadores de acesso (`private`) e uso de Getters/Setters.
* **Polimorfismo:** Implementação de comportamentos distintos para métodos de ataque dependendo da classe instanciada.
* **Organização:** Código estruturado em pacotes para melhor modularização.

## 📂 Estrutura do Projeto

src/

├── Armas/              # Pacote contendo a lógica dos equipamentos

│   ├── Arma.java       # Classe base para todas as armas

│   ├── Espada.java

│   ├── Lanca.java

│   └── ...

│

├── Personagens/        # Pacote contendo a lógica dos heróis

│   ├── Personagem.java # Classe abstrata base (com Saúde, Força, Destreza)

│   ├── Mago.java

│   ├── Paladino.java

│   └── Clerigo.java

│

└── Main.java           # Classe principal para execução e testes




## Tecnologias Utilizadas

* **Linguagem:** Java (JDK)
* **IDE:** Visual Studio Code (VS Code)

## Como Executar

1.  Certifique-se de ter o Java instalado em sua máquina.
2.  Clone este repositório ou baixe os arquivos.
3.  Abra a pasta do projeto no VS Code.
4.  Execute o arquivo `Main.java`.
