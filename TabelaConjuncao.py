def main():
    valoresA = []
    valoresB = []

    print("TABELA VERDADE - CONJUNÇÃO")
    print("Digite V para verdadeiro e F para falso.")

    for i in range(4):
        a = input(f"Proposição {i+1} - Valor A (V/F): ").strip().upper()
        b = input(f"Proposição {i+1} - Valor B (V/F): ").strip().upper()

        valoresA.append(a == 'V')
        valoresB.append(b == 'V')

    print("\nTABELA VERDADE - CONJUNÇÃO (AND - and)")
    print("A\tB\tA and B")
    for a, b in zip(valoresA, valoresB):
        print(f"{a}\t{b}\t{a and b}")

if __name__ == "__main__":
    main()
