
#valor do produto
preço = float(input("qual o preço do produto"))

#novo valor
npreço = preço - (preço * 5/100)
#valor do desconto
desconto = preço - npreço
#imprimindo o valor do produto com 5 % de desconto
print("o valor do desconto e: ",f'{desconto:.2f}')
print("o valor do produto com 5 % de desconto é: ",f'{npreço:.2f}')