"""
Closure e funções que retornam outras funções
"""

def banco(banco):
    def usuario(usuario):
        return f'O usuário: {usuario}, é de {banco}'
    return usuario

santander = banco('Santander')
itau = banco('Itau')


print(itau("Gustavo"))

