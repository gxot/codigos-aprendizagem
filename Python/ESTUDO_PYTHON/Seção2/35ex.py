import copy
# Exercícios
# Aumente os preços dos produtos a seguir em 10%
# Gere novos_produtos por deep copy (cópia profunda)
produtos = [
    {'nome': 'Produto 5', 'preco': 10.00},
    {'nome': 'Produto 1', 'preco': 22.32},
    {'nome': 'Produto 3', 'preco': 10.11},
    {'nome': 'Produto 2', 'preco': 105.87},
    {'nome': 'Produto 4', 'preco': 69.90},
]

print('PRODUTOS', *produtos, sep='\n')

novos_produtos = [
    {**produto, 'preco': round(produto['preco'] * 1.1, 2)}
    for produto in produtos
] 

print('Ex 1')
print(*novos_produtos, sep='\n')


# # Ordene os produtos por nome decrescente (do maior para menor)
# # Gere produtos_ordenados_por_nome por deep copy (cópia profunda)
print('Ex 2')
produtos_ordenados_por_nome = sorted(copy.deepcopy(produtos), reverse=True, key= lambda item: item['nome'])
print(*produtos_ordenados_por_nome, sep= '\n')


# # Ordene os produtos por preco crescente (do menor para maior)
# # Gere produtos_ordenados_por_preco por deep copy (cópia profunda)
print('Ex 3')
produtos_ordenados_por_preco = sorted(copy.deepcopy(produtos), key= lambda item: item['preco'])
print(*produtos_ordenados_por_preco, sep= '\n')

