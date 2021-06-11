// Question 1

		int N = 10000; //O(n^2)
		int a = 0;
		for (int i = 0; i < N; i++) { //N times 
			for (int j = N; j > i; j--) {
				a = a + i + j;
			}
		}


// Question 2

		int N = 10000;
		int a = 0, i = N;
		while (i > 0) {
			a += i;
			i /= 2; -> i = i / 2;
		}
    
// Question 3

int i, j, k = 0;
    for (i  = n/2; i <= n; i++) {
        for (j = 2; j <= n; j = j * 2) {
            k = k + n/2;
        }
    }
Θ(n)
 Θ(nLogn)
 Θ(n^2)
 Θ(n^2 / Logn)
 Θ(n^2Logn)

// Question 4

In a competition, four different functions are observed. All the functions use a single for loop and within the for loop, the same set of statements are executed.
Consider the following for loops:
 A) for(i = 0; i < n; i++) //-> O(n)
 
  B) for(i = 0; i < n; i += 2) // -> O(n / 2)
 
  C) for(i = 1; i < n; i *= 2) // -> O(log n base 2)
 
  D) for(i = n; i > -1; i /= 2) // -> O(log n base 2)
 
If n is the size of input(positive), which function is the most efficient? In other words, which loop completes the fastest.
 A
 B
 C
 D
A > B > (C and D)
 
// Question 5
```
int i = 1;

while(i <= n) {
      i++;
}
```
//O(n)

// Question 6
```
int i = 1;

while(i <= n) {
      i  = i + 2;
}
```
//n/2 -> O(n)

// Question 7
```
int i = 1;

while(i <= n) {
      i  = i + 2;
      i  = i + 3;
}
```
//n/5-> O(n)
// Question 8
```
int i = 1;

while(i <= n) {
      i  = i + k;
}
```
//n/k-> O(n/k)

// Question 9
```
int i = 1;

while(i <= n) {
      i  = i * 2;
}
```

// O(log<sub>2</sub>n)

// Question 10
```
int i = 1;

while(i <= n) {
      i  = i * 3;
}
```
// O(log<sub>3</sub>n)
// Question 11
```
int i = 1;

while(i <= n) {
      i  = i * 2;
      i  = i * 3;
}
```
// O(log<sub>6</sub>n)

// Question 12
```
int i = 1;

while(i <= n) {
      i  = i * k;
}
```
// O(log<sub>k</sub>n)

// Question 13
```
while(n > 0) {
      n = n - 1;
}
```
//O(n)

// Question 14
```
while(n > 0) {
      n = n - 2;
}
```
//n/2 ->O(n)

// Question 15
```
while(n > 0) {
      n = n - 2;
      n = n - 3;
}
```

//n/5 ->O(n)

// Question 16
```
while(n > 0) {
      n = n - k;
}
```
//n/k ->O(n/k)

// Question 17
```
while(n > 0) {
      n = n/2;
}
```
// O(log<sub>2</sub>n)

// Question 18
```
while(n > 0) {
      n = n/3;
}
```
// O(log<sub>3</sub>n)

// Question 19

```
while(n > 0) {
      n = n/2;
      n = n/3;
}
```
// O(log<sub>6</sub>n)

// Question 20

```
while(n > 0) {
      n = n/k;
}
```

// O(log<sub>k</sub>n)






