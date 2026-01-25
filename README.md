# 📘 Curso de Kotlin – Udemy

Este repositório contém meus estudos, anotações e exemplos práticos do curso de **Kotlin** realizado na plataforma **Udemy**.

## 🚀 Tecnologias
- Kotlin
- IntelliJ IDEA
- JDK

## 📚 Conteúdo Estudado

### 🔹 Fundamentos
- Sintaxe básica
- `val` e `var`
- Tipos primitivos
- Null Safety

### 🔹 Controle de Fluxo
- if / else
- when
- for / while

### 🔹 Funções
- Funções com retorno
- Funções sem retorno (`Unit`)
- Parâmetros nomeados

### 🔹 Programação Orientada a Objetos
- Classes e objetos
- Construtores
- Encapsulamento

### 🔹 Coleções e Lambdas
- List e MutableList
- filter, map, forEach
- Expressões lambda

## 🧠 Exemplo de Código

```kotlin
class Pessoa(val nome: String, var idade: Int) {
    fun apresentar() {
        println("Meu nome é $nome e tenho $idade anos")
    }
}
