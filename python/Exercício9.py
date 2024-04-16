
#valor do salario
salario = float(input("qual o salario do funcionário"))

#novo valor
nsalario = salario - (salario * 15 / 100)
#valor do desconto
valordemudança = salario - nsalario
#imprimindo o valor do salario com 15% de mudança
print("o valor do desconto e: ",f'{valordemudança:.2f}')
print("o valor do salario com 15 % de desconto é: ",f'{nsalario:.2f}')