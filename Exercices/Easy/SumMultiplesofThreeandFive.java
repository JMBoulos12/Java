
/*
  18-January-2023
*/

public Integer sum(Integer n) {
  
  Integer sum = 0;
for (int i = 1; i <= n; i++) {
    if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
    }
}
return sum;

}
