# ⚖️ Balanced Brackets

This is a simple algorithmic kata that checks whether a string composed of parentheses `()` and square brackets `[]` is *well-formed*.  
The goal is to ensure that every opening bracket has a corresponding closing bracket in the correct order.

## Examples

| Input              | Output     | Explanation                       |
|--------------------|------------|-----------------------------------|
| `()`               | ✅ `true`  | Correctly opened and closed       |
| `)(`               | ❌ `false` | Closing comes before opening      |
| `()[]`             | ✅ `true`  | Multiple valid pairs              |
| `([)]`             | ❌ `false` | Incorrectly nested                |
| `([])`             | ✅ `true`  | Properly nested brackets          |
| `([(())([])])[()]` | ✅ `true`  |                                   |
| `[(())([]])[()]`   | ❌ `false` |                                   |

## Getting Started

### Prerequisites

- Java 21+

### Building the Project

```bash
./mvnw clean install
```

### Running the project

```bash
./mvnw exec:java
```

### Running the tests

```bash
./mvnw test
```

## Algorithm

This problem is best solved using a **stack** data structure:

1. Traverse the input string character by character.
2. Push opening brackets (`(` or `[`) onto the stack.
3. When encountering a closing bracket:
   - Check if the stack is empty → If yes, the string is not well-formed.
   - Otherwise, pop the top of the stack and check if it matches the corresponding opening bracket.
4. After processing the entire string, the stack should be empty if the string is well-formed.

