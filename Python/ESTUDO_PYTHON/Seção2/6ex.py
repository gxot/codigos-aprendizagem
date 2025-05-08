def Multiplica(*args):
    total = 1
    for numero in args:
        total *= numero
    return total

def ParImp():
    total = Multiplica(3,3)
    if total % 2 == 0:
        return ('É par')
    return ('É ímpar')

print(ParImp())
