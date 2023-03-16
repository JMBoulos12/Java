In the above example, we have created a String array named words. The array includes 5 elements.

Here, we are using

for loops to access and compare each array element
compareTo() method to perform the comparison
Since we are sorting elements in lexicographical (dictionary) order, we are swapping elements if the first element comes after the second element in the dictionary.

Here's how elements are compared and swapped in each iteration.

### Properties

| Initial words | i	| j	| Comparison |words[]|
| --- | --- | --- | --- | --- |
| { "C", "Ruby", "Python", "Java" } | 0	| 1	| Ruby and C | C, Ruby, Python, Java |
| { "C", "Ruby", "Python", "Java" } |	0	| 2	| C and Python | { "C", "Ruby", "Python", "Java" } |
| { "C", "Ruby", "Python", "Java" } |	0	| 3	| C and Java | { "C", "Ruby", "Python", "Java" } |
| { "C", "Ruby", "Python", "Java" } |	1	| 2	| Ruby and Python | { "C", "Python", "Ruby", "Java" } |
| { "C", "Python", "Ruby", "Java" } |	1	| 3	| Python and Java	| { "C", "Java", "Ruby", "Python" } |
| { "C", "Java", "Ruby", "Python" } |	2	| 3	| Ruby and Python	| { "C", "Java", "Python", "Ruby" } |


### Properties

| Name | Type | Default | Description |
| --- | --- | --- | --- |
| tableLayout | `auto` \| `fixed` | `auto` \| `fixed` for any columns is fixed or ellipsis or header is fixed | https://developer.mozilla.org/en-US/docs/Web/CSS/table-layout |
| prefixCls | String | rc-table |  |
| className | String |  | additional className |
| id | String |  | identifier of the container div |
