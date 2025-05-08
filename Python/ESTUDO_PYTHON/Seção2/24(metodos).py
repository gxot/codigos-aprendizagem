# dir, hasattr e getattr em Python
string = 'Luiz'
metodo = 'upper'

if hasattr(string, metodo):
    print(getattr(string, metodo)())
    
else:
    print('Não existe o método', metodo)