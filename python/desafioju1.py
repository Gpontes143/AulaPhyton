
def primo(n):
    if n <= 1: 
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    g = 5
    while g * g <= n:
        if n % g == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

n = int(input("Digite um número: "))

# codigo para a raiz quadrada
raiz_quadrada = n ** (1/2)
print(f"Raiz quadrada de {n} = {raiz_quadrada:.2f}") #.2f para numero após a virgula

# Numero primo mais proximo subtraindo e adicionando 
primo_mais = n + 1
primo_menos = n - 1
while not primo(primo_mais):
    primo_mais += 1
print(f"Número primo mais proximo em forma crescente {n} = {primo_mais}")

while not primo(primo_menos):
    primo_menos -= 1
print(f"Número primo mais proximo em forma decrescente {n} = {primo_menos}")


# Todos os Divisíveis do numero 
div = [g for g in range(1, n+1) if n % g == 0]
print(f"Todos os divisíveis de {n} = {', '.join(map(str, div))}")   
#separação por virgula e espaço usando a função map e join 

# fatoração
fatorial = 1
for g in range(1, n+1):
    fatorial *= g
print(f"Fatorial de {n}! = {fatorial}")

