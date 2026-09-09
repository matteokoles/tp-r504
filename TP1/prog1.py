import fonctions as f

print("Hello, World!")

while True:
    a = int(input("Entrez le premier nombre : "))
    b = int(input("Entrez le second nombre : "))
    res = f.puissance(a, b)
    print("Résultat :", res)
