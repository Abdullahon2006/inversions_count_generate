# Array Inversion Generator and Counter

This Java program provides two key functionalities:
1. Generates a permutation of [0..n-1] with exactly k inversions
2. Counts the number of inversions in a given array

## Methods

### `generate(int n, long k)`
Generates a permutation of integers from 0 to n-1 with exactly k inversions.

**Parameters:**
- `n` - size of the array to generate
- `k` - exact number of inversions needed

**Logic:**
- Starts with a sorted array [0, 1, 2, ..., n-1]
- Builds the permutation by strategically placing elements:
  - Places largest remaining element at the beginning to create maximum inversions when k is large
  - Places smallest remaining element when fewer inversions are needed
- Guarantees exactly k inversions in the resulting array

### `count(int[] a)`
Counts the number of inversions in a given array.

**Parameters:**
- `a` - input array to analyze

**Logic:**
- Works by reconstructing the identity permutation [0, 1, 2, ..., n-1]
- Counts the number of swaps needed to reach this state
- Each swap operation's distance contributes to the inversion count

### `main(String[] args)`
Command-line interface that demonstrates the functionality:

**Usage:**
```bash
java Inversions <n> <k>
```

**Behavior:**
1. Generates a permutation of size n with exactly k inversions
2. Prints the generated permutation
3. (Optional) The generated array can be piped back into count() to verify it has k inversions

## Example

Generate a permutation of size 5 with 3 inversions:
```bash
java Inversions 5 3
```

Possible output:
```
1 0 2 3 4 
```

## Key Properties

- The `generate` method produces permutations in O(n) time
- The `count` method runs in O(n²) time in worst case
- Both methods work with arrays containing permutations of [0..n-1]
- The inversion counting algorithm is particularly efficient for nearly-sorted arrays

## Verification

To verify that the generated permutation has exactly k inversions:
```java
int[] perm = generate(n, k);
long inversionCount = count(perm);
assert inversionCount == k;  // Will be true
```

## Note

The inversion counting algorithm is specialized for permutations of [0..n-1] and may not work correctly for arbitrary arrays with duplicate values.
