"""
150. Evaluate Reverse Polish Notation
Difficulty: Medium
Topics: Stack, Array, Math
"""

def evalRPN(tokens) -> int:
    operators = {"+","-","*","/"}
    stack = []
    def helper(left, right, operator) -> int:
        if operator == '+':
            return left + right
        elif operator == '-':
            return left - right
        elif operator == '*':
            return left * right
        elif operator == '/':
            return left / right

    # The RPN expression are always valid, which simplifies the constraint checks
    for token in tokens:
        if token in operators: # The token is an operand
            # We apply the operator to the last 2 terms
            right = int(stack.pop())
            left = int(stack.pop())
            result = helper(left, right, token)
            stack.append(int(result))
        else:
            # We push the number onto the stack
            stack.append(int(token))
    return stack[0]