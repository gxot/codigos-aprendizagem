"""
https://docs.python.org/pt-br/3/library/stdtypes.html
Imutáveis que vimos: str, int, float, bool
"""
string = '1000'
o_string = f'{string[:3]}ABC{string[4:]}'
print(string)
print(o_string)
print(string.zfill(10))