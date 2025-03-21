# Four in a row

My implementation of the classic four in a row AKA connect four

## Bitmap

## Intro to bitmap

Uses bitmap på keep track of game state and check for win condition. It is computationally effective, which is nice if we later should implement a solver, as bitwise operations make win detection very fast.

The bitmap is a 64-bit integer (long), where each bit represents a position on the board like this:

```
6 13 20 27 34 41 48 ← Extra row for easier implementation
5 12 19 26 33 40 47 ← Top row
4 11 18 25 32 39 46
3 10 17 24 31 38 45
2 9 16 23 30 37 44
1 8 15 22 29 36 43
0 7 14 21 28 35 42 ← Bottom row
```

## Placing a chip

We have one bitmap for each player. An algorithm to find index based on row and column position, both zero-indexed:

```math
index = (column * 7) + row
```

Eg. column 0, row 0 (bottom left) would end up at

```math
index = (0 * 7) + 0 = 0
```

Or column 6, row 5 (top right) would end up at

```math
index = (6 * 7) + 5 = 47
```

## Checking for win condition

Kommer
