import time

def measure_time(func, n):
    start = time.time()
    func(n)
    end = time.time()
    return end - start

# Test values
n_values = [5, 10, 20, 30]

print("Fibonacci Recursive Timing:")
for n in n_values:
    print(f"n={n}, time={measure_time(fibonacci_recursive, n):.6f}s")

print("\nFibonacci Iterative Timing:")
for n in n_values:
    print(f"n={n}, time={measure_time(fibonacci_iterative, n):.6f}s")