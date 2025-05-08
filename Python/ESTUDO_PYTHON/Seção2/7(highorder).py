"""
Higher Order Functions
Funções de primeira classe
"""

nome = input('Qual seu nome? ')

def inicio(nome, msg='Bom dia'):
    return f'{msg}, {nome}!'

def exec(funcao, nome, msg):
    return funcao(nome, msg)

print(
    exec(inicio, nome, "Bom dia")
)