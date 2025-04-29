# Inversion Counter and Generator

## What This Program Does

This Java program helps analyze and create song rankings by:
1. Counting inversions between two rankings (measures how different they are)
2. Generating rankings with specific inversion counts

## Key Features

- **Count Inversions**: Measures how many pairs are in different order between rankings
- **Generate Rankings**: Creates inversions with exact numbers of inversions
- **Efficient Algorithms**: Runs quickly even for large numbers of songs

## How to Use

1. Compile the program:
   ```bash
   javac Inversions.java
   ```
2. Generate a ranking with specific inversions:
   ```bash
   java Inversions generate 10 20
   ```

## Examples

```bash
# Count inversions
$ java Inversions count 3,1,0,2
4 inversions

# Generate rankings
$ java Inversions generate 10 0
0 1 2 3 4 5 6 7 8 9

$ java Inversions generate 10 20
9 8 0 1 2 3 7 4 5 6
```

## How It Works

### Counting Inversions
- Compares all pairs of songs (i,j) where i comes before j
- Counts how many times the ranking is reversed
- Runs in O(n²) time - works for up to 10,000+ songs

### Generating Rankings
- Builds rankings with exactly k inversions
- Uses a smart algorithm to place songs in optimal positions
- Runs in O(n) time - extremely fast even for large n

## Real-World Uses

- Music recommendation systems
- Voting analysis
- Ranking similarity comparisons
- Sports statistics
- Genome sequence analysis

## Limitations

- Maximum inversion count is n(n-1)/2 (completely reversed order)
- Input rankings must contain numbers 0 to n-1 exactly once

This program helps quantify how different two song rankings are, and can generate test cases for music recommendation algorithms.
