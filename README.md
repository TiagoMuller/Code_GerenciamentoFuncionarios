# Code_GerenciamentoFuncionarios
**Sistema de Gerenciamento de Funcionários**

Este é um simples programa de gerenciamento de funcionários que permite ao usuário cadastrar funcionários e aumentar o salário de um deles, de acordo com sua identificação.

**Como usar**

Ao executar o programa, o usuário precisa informar quantos funcionários deseja cadastrar. Em seguida, o usuário deve fornecer o ID, o nome e o salário do funcionário.

Após o cadastro dos funcionários, o usuário pode selecionar um funcionário pelo seu ID para aumentar o salário. O programa solicitará o percentual de aumento, que será aplicado ao salário do funcionário.

O programa exibe uma lista com os dados dos funcionários cadastrados, incluindo os salários atualizados.

**Implementação**

O programa é implementado em Java e utiliza a classe Employee para representar um funcionário. A classe Employee tem os seguintes atributos:

id: um inteiro representando o ID do funcionário
name: uma string representando o nome do funcionário
salary: um double representando o salário do funcionário
A classe Employee tem os seguintes métodos:

increaseSalary(double percentage): aumenta o salário do funcionário pelo percentual fornecido
toString(): retorna uma string com os dados do funcionário
O programa utiliza um objeto Scanner para ler a entrada do usuário e um objeto Locale para definir o local padrão como US, para que o separador decimal seja um ponto.

**Melhorias Futuras**

Implementar tratamento de erros para entradas inválidas
Adicionar opção para excluir um funcionário da lista
Armazenar os dados dos funcionários em um banco de dados para persistência entre as execuções do programa.

-------------------------
**Employee Management System**

This is a simple employee management program that allows the user to register employees and increase the salary of one of them based on their identification.

**Usage**

When running the program, the user needs to input how many employees they want to register. Then, the user must provide the ID, name, and salary of each employee.

After registering the employees, the user can select an employee by their ID to increase their salary. The program will ask for the percentage increase, which will be applied to the employee's salary.

The program displays a list with the data of all registered employees, including their updated salaries.

**Implementation**

The program is implemented in Java and uses the Employee class to represent an employee. The Employee class has the following attributes:

id: an integer representing the employee's ID
name: a string representing the employee's name
salary: a double representing the employee's salary
The Employee class has the following methods:

increaseSalary(double percentage): increases the employee's salary by the provided percentage
toString(): returns a string with the employee's data
The program uses a Scanner object to read user input and a Locale object to set the default locale as US, so that the decimal separator is a dot.

**Future improvements**

Implement error handling for invalid inputs
Add an option to remove an employee from the list
Store employee data in a database for persistence between program runs.
