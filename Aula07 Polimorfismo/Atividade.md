# Prática sobre Polimorfismo

## Cenário
Vamos criar um sistema de gestão universitária que será implantado em etapas.

## Implantação

### Passo 1: Criação das Classes Principais

1. **Criar a classe `Pessoa`** com os métodos necessários e os seguintes requisitos:
   * **Atributos:**
       - `nome`
       - `cpf`

2. **Criar a classe `Funcionario`**, filha de `Pessoa`, com os métodos necessários e os seguintes requisitos:
   * **Atributos:**
       - `idFuncionario`
       - `salario`
       - `saldoContaBancaria`
   * **Método:**
       - `receberSalario()`: deve incrementar `saldoContaBancaria` com o valor do salário do funcionário.


3. **Criar a classe `Professor`**, filha de `Funcionario`, com os métodos necessários e os seguintes requisitos:
   * **Atributos:**
       - `bonus`
       - `idFuncionario`
   * **Método:**
       - `receberSalario()`: deve sobrescrever `receberSalario()` e manter a lógica original acrescentando também o bônus na conta bancária.

4. **Criar a classe `Materia`** com os métodos necessários e os seguintes requisitos:
   * **Atributos:**
       - `nome`
       - `tipo` (Obrigatória, Optativa ou Extensão)
       - `quantidadeHoras`
       - `idFuncionario` (professor responsável)

5. **Criar a classe `Aluno`**, filha de `Pessoa`, com os métodos necessários e os seguintes requisitos:
   * **Atributos:**
       - `ra`
       - `curso`
   * **Métodos (Polimorfismo de Sobrecarga):**
       - `matricularMateria(String nome)`: matricula o aluno em uma matéria **Obrigatória** (assume-se uma carga horária padrão, ex: 60h).
       - `matricularMateria(String nome, int quantidadeHoras)`: matricula o aluno em uma matéria **Optativa**, exigindo que se informe as horas.
       - `matricularMateria(String nome, String tipo, int quantidadeHoras, int idFuncionario)`: matricula o aluno em uma matéria de **Extensão** (ou outro tipo), definindo explicitamente o tipo, a carga horária e o professor.

