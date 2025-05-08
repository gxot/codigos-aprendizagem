
nome = input('Coloque seu nome: ')
nome_len = len(nome)

indice = 0
new_name = ''
while indice < nome_len:
    
    letra = nome[indice]
    indice += 1
    new_name += f'*{letra}'
    
print(new_name)


            
