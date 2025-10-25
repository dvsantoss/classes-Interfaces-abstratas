# Projeto Classes e Interfaces Abstratas

Este projeto demonstra conceitos fundamentais de Programação Orientada a Objetos em Java, incluindo classes abstratas, interfaces, herança, polimorfismo e sobrecarga de métodos.

## Estrutura do Projeto

```
abstract/
├── src/                    # Código fonte Java
│   ├── App.java           # Classe principal com testes
│   ├── C1.java            # Classe abstrata base
│   ├── C2.java            # Classe concreta que estende C1
│   ├── C3.java            # Classe que estende C1 e implementa I1, I2
│   ├── C4.java            # Classe que estende C2
│   ├── C5.java            # Classe que estende C2 e implementa I1
│   ├── I1.java            # Interface 1
│   └── I2.java            # Interface 2
├── bin/                    # Arquivos compilados (.class)
└── lib/                    # Bibliotecas externas
```

## Hierarquia de Classes

```
C1 (abstrata)
├── C2 (concreta)
│   ├── C4 (concreta)
│   └── C5 (concreta, implementa I1)
└── C3 (concreta, implementa I1, I2)
```

## Conceitos Demonstrados

- **Classes Abstratas**: C1 é uma classe abstrata que não pode ser instanciada diretamente
- **Herança**: C2, C3, C4 e C5 herdam de C1 ou C2
- **Interfaces**: I1 e I2 definem contratos implementados por C3 e C5
- **Sobrecarga**: C3 demonstra sobrecarga de construtores e métodos
- **Polimorfismo**: Diferentes implementações do método abstrato `metodoProprioC1()`

## Como Executar

1. Compile os arquivos Java:
```bash
javac -d bin src/*.java
```

2. Execute a classe principal:
```bash
java -cp bin App
```

## Funcionalidades Testadas

- Instanciação de classes concretas
- Herança de atributos e métodos
- Implementação de interfaces
- Sobrecarga de construtores e métodos
- Polimorfismo através de métodos abstratos
