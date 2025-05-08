import re

cpf_enviado = re.sub(r'[^0-9]', '', input('Coloque seu CPF: '))
print(cpf_enviado)
resultado = 0
i = 10

for digito in cpf_enviado[:9]:
    resultado += int(digito) * i
    i -= 1
digito_1 = resultado * 10 % 11
digito_1 = digito_1 if digito_1 <= 9 else 0

cpf_gerado = cpf_enviado[:9] + str(digito_1)
i = 11
resultado = 0

for digito in cpf_gerado:
    resultado += int(digito) * i
    i -= 1
digito_2 = resultado * 10 % 11
digito_2 = digito_2 if digito_2 <= 9 else 0
cpf_gerado += str(digito_2)

if cpf_gerado == cpf_enviado:
    print('CPF Válido')
else:
    print('CPF Inválido')








