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
   * **Método:**
       - `receberSalario()`: deve sobrescrever `receberSalario()` e manter a lógica original acrescentando também o bônus na conta bancária.
