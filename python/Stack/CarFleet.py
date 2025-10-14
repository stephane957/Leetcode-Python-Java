"""
853. Car Fleet
Difficulty: Medium
Topics: Array, Stack, Monotonic Stack, Sorting
"""

def carFleet(target: int, position: list[int], speed: list[int]) -> int:
    # Step 1: Pair position and speed, then sort by position (closest to target first)
    cars = sorted(zip(position, speed), reverse=True)

    # Step 2: Calculate time to reach target for each car
    times = [(target-pos)/spd for pos, spd in cars]
    # Step 3: Use monotonic stack to count fleets
    stack = []
    
    for time in times:
        # If current car arrives later than the car in front, it forms a new fleet
        if not stack or time > stack[-1]:
            stack.append(time)
        # Else, current car joins the fleet ahead (slower car dominates)
        # We don't need to push because the fleet speed is determined by the slower car
    
    return len(stack)