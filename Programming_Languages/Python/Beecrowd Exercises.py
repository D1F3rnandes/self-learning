'''
Python101 - Estrturas Condicionais e de repetição
Beecrowd Exercises
Link: https://www.beecrowd.com.br/judge/pt/problems/index/1
10 Exercícios
Cod dos ex
1-	1035	Selection Test 1
2-	1038	Snack	
3-	1040	Average 3
4-	1041	Coordenadas de um Ponto
5-	1045	Tipos de triângulos
6-	1065	Pares entre Cinco Números
7-	1067	Números ímpares
8-	1072	Intervalo 2
'''

'''1 - 1035 Selection Test 1'''

A = 2
B = 3
C = 2
D = 6

if B > C:
    print("Valores aceitos")
    if D > A:
        print("Valores aceitos")
        if (C+D) > (A+B):
            print("Valores aceitos")
            if (C and D) > 0:
                print("Valores aceitos")
                if (A % 2) == 0:
                    print("Valores aceitos")
else:
    print("Valor não aceito")

if (B > C ) and (D > A) and ((C+D) > (A+B)) and ((C and D) > 0) and ((A % 2) == 0):
    print ("Valor aceito")
else:
    print("Valor não aceito")


''' 2 - 1038 Snack '''

listaPRECO = {1:4.00, 2:4.50, 3:5.00, 4:2.00, 5:1.50}

codigo = int(input("Codigo"))
quantidade = float(input("Quantidade"))

print("Total R$", quantidade*listaPRECO[codigo])


''' 3-	1040	Average 3 '''

nota1 = float(input("Nota 1"))
resultadoNOTA1 = (nota1*0.2)
nota2 = float(input("Nota 2"))
resultadoNOTA2 = (nota2*0.3)
nota3 = float(input("Nota 3"))
resultadoNOTA3 = (nota3*0.4)
nota4 = float(input("Nota 4"))
resultadoNOTA4 = (nota4*0.1)

media = (resultadoNOTA1 + resultadoNOTA2 + resultadoNOTA3 + resultadoNOTA4)

print("Média: {:.2f}".format(media))
if media >= 7.0:
    print("Aluno aprovado")
elif 5 < media <= 6.9:
    print("Aluno em Exame")
    notaEXAME = float(input("Nota Exame:"))
    print("Nota Exame:", notaEXAME)
    if ((media + notaEXAME)/2) >= 5.0:
        print("Aluno Aprovado")
        print("Média final", (media+notaEXAME)/2)
else:
    print("Aluno reprovado")


''' 4 - 1041 Coordenadas de um Ponto'''

numUM = float(input("Valor x"))
numDOIS = float(input("Valor y"))

if numUM == 0 and numDOIS == 0:
    print("Origem")
elif numUM >= 0 and numDOIS >= 0:
    print("Q1")
elif numUM <= 0 and numDOIS >= 0:
    print("Q2")
elif numUM <= 0 and numDOIS <= 0:
    print("Q3")
elif numUM >= 0 and numDOIS <= 0:
    print("Q4")


''' 5- 1045 Tipos de triângulos '''

valorA = float(input("Valor A"))
valorB = float(input("Valor B"))
valorC = float(input("Valor c"))

#imaginando os inputs valorA = 1, valorB = 2, valorC = 3

if (valorA < valorB): #valorA recebe 1, valorB recebe 2
    temp = valorA #TEMP recebe 1
    valorA = valorB #ValorA com valor 1 passa a recebero valor 2
    valorB = temp #valorB com valor 2 passa a recebero valor 1

# ANTES: valorA = 1, valorB = 2
# DEPOIS: valorA = 2, valorB = 1

if (valorB < valorC): #valorB = 1, valorC = 3
    temp = valorC #TEMP que estava com o valor 1, passa a receber o valor 3
    valorC = valorB #ValorC com valor 3 passa a recebero valor 1
    valorB = temp #valorB com valor 1 passa a recebero valor 3

# ANTES: valorB = 1, valorC = 3
# DEPOIS: valorB = 3, valorC = 1

if (valorA < valorB): #valorA = 2, valorB = 3
    temp = valorA #TEMP que estava com o valor 3, passa a receber o valor 2
    valorA = valorB #ValorB com valor 3 passa a recebero valor 2
    valorB = temp #valorB com valor 3 passa a recebero valor 2

# ANTES: valorB = 3, valorA = 2
# DEPOIS: valorB = 2, valorA = 3

if valorA >= (valorB + valorC):
    print("NÃO FORMA TRIANGULO")
elif valorA**2 == (valorB**2 + valorC**2):
    print("TRIANGULO RETANGULO")
elif valorA**2 > (valorB**2 + valorC**2):
    print("TRIANGULO OBTUSANGULO")
elif valorA**2 < (valorB**2 + valorC**2):
    print("TRIANGULO ACUTANGULO")

if (valorA != valorB != valorC):
    print("TRIANGULO ISOSCELES")
else:
    print("TRIANGULO EQUILATERO")


''' 6 - 1065 Pares entre Cinco Números '''

numeros = [7, -5, 6, -4, 12]
numerosPares = 0

for x in numeros:

    if x % 2 == 0:
        numerosPares += 1

print(numerosPares,"Valores Pares")

''' 7 - 1067 Números ímpares '''

numeros = int(input("Numero"))

for x in range(numeros):

    if x % 2 == 1:
        print(x)

''' 8- 1072 Intervalo 2 '''

N = [4, 14, 123, 10, -25]
dentro = 0 
fora = 0

for x in N:
    if 10 <= x <= 20:
        dentro +=1
    else:
        fora +=1

print(dentro, "in")
print(fora, "out")