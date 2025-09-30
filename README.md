# Project
# Mars Rover Simulation

This documentation explains a Java-based **Mars Rover Simulation** project. The goal of the project is to model a rover moving on a rectangular grid, responding to commands while handling invalid input and edge cases.

## Quick orientation (high level)

1. The **Grid** represents the world: a rectangular set of coordinates (x,y). The bottom-left is typically (0,0).
2. The **Rover** has a position (x,y) and a facing **Direction** (North, East, South, West).
3. A **Command** is an instruction string such as `L`, `R`, `M` or more elaborate commands like `PLACE X,Y,D`.
   - `L` — rotate left (90°)
   - `R` — rotate right (90°)
   - `M` — move forward one unit in the facing direction
4. **Exceptions** handle invalid commands, out-of-bounds moves, or parsing errors.

#**class diagram**
<img width="877" height="599" alt="image" src="https://github.com/user-attachments/assets/3851d57b-f6f4-44d5-a23b-c99c6d18aeb4" />

   
# Commands — Detailed Guide

This explains how commands work in the Mars Rover Simulation.A **Command** is a single instruction that tells the rover to perform an action.
- **Single-letter commands**:
  - `L` — Rotate left (90 degrees)
  - `R` — Rotate right (90 degrees)
  - `M` — Move forward one unit in the direction the rover is facing
  ##  Where commands come from
- Console (interactive)
- Input file (batch)
- Automated tests
 ##  Validation & Robustness
- Ensure numeric coordinates are integers.
- Ensure coordinates fall inside grid boundaries.
- Ensure direction value is one of the allowed values.
- Handle extra characters gracefully according to your chosen policy (ignore or error).
  
  | Command Class   | Action                       |
  | --------------- | ---------------------------- |
  | `MoveCommand`   | rover moves forward one unit |
  | `LeftCommand`   | rover rotates left           |
  | `RightCommand`  | rover rotates right          |
  | `ReportCommand` | prints rover’s current state |
  
Each command holds a reference to the Rover and calls methods like move(), turnLeft().

# Direction — Detailed Guide
This explains direction handling and rotation behaviour.A **Direction** is the compass orientation of the rover: **NORTH**, **EAST**, **SOUTH**, **WEST**.
## 1,Rotation rules
- `L` (left) rotates anti-clockwise:
  - NORTH -> WEST
  - WEST -> SOUTH
  - SOUTH -> EAST
  - EAST -> NORTH
- `R` (right) rotates clockwise:
  - NORTH -> EAST
  - EAST -> SOUTH
  - SOUTH -> WEST
  - WEST -> NORTH
  ## 2. Movement vectors
- NORTH: (dx=0, dy=+1)
- EAST:  (dx=+1, dy=0)
- SOUTH: (dx=0, dy=-1)
- WEST:  (dx=-1, dy=0)

  | Class   | Moves | Left() | Right() |
  | ------- | ----- | ------ | ------- |
  | `North` | y+1   | West   | East    |
  | `South` | y-1   | East   | West    |
  | `East`  | x+1   | North  | South   |
  | `West`  | x-1   | South  | North   |
The current Direction object inside Rover decides how it moves.

## 3. Implementation idea (for non-programmers)
Think of directions as a circular list: `[NORTH, EAST, SOUTH, WEST]`.
- `R` moves one step right in the list (wrap around).
- `L` moves one step left in the list (wrap around).

## 4. Parsing directions from text
Accept: `N`, `E`, `S`, `W` or `NORTH`, `EAST`, `SOUTH`, `WEST`. Convert to uppercase.

## 5. Edge cases
If a `MOVE` would leave the grid:
- Either ignore the move and show a warning, or
- Raise an `OutOfBoundsException` which the main loop catches and prints a message.
  
## Rover (Detailed)
The `Rover` is the active object that moves around the `Grid`. It has a current position (x,y) and a `Direction` (North/East/South/West). The Rover exposes actions: `move`, `turnLeft`, `turnRight`, and `statusReport`.
 # Responsibilities
- Maintain current coordinates and direction.
- Apply movement logic (requesting the direction object to perform a move).
- Ask the `Grid` whether a proposed new coordinate is valid.
- Provide a status string like `"3 5 North"` when asked.

# Exception (Detailed)
Exceptions are a way for code to signal that something went wrong (e.g., trying to move outside the grid). This file explains typical exceptions your project might use and how they are handled.
 # Common exceptions in this project
- `InvalidCommandException` — input character not recognized (not `L`, `R`, `M`, `P`).
- `OutOfGridException` — attempted move falls outside the grid boundaries.
- `InitializationException` — invalid grid or start coordinates (e.g., negative size).
- `NullReferenceException` — if an object like Direction or Grid is not initialized (usually programming error).

> In Java, exceptions are classes that extend `Exception` (checked) or `RuntimeException` (unchecked).
 # Recommended handling policy
- **Input validation (Main)**: convert input tokens to commands; if invalid, report a user-friendly message and skip/abort.
- **Move operation (Rover/Grid)**: check validity and either:
  - Return `boolean` success/fail and let Main decide what to do, **or**
  - Throw a specific `OutOfGridException` and catch it in Main to print an error message.

**Conceptual Flow Diagram**
 
 ![WhatsApp Image 2025-09-30 at 2 19 11 PM](https://github.com/user-attachments/assets/b115fd39-5682-4731-8cd1-b93edcfb6b67)


**CORE COMPONENTS**

**Main.java – Entry point**
-Handles user input (width, height, commands)
-Creates the Grid and Rover
-Maps input characters (e.g. L, R, M, REPORT) to Command objects
-Executes commands in sequence

**Rover.java (in rover package)**
-Holds rover’s position (x, y)
-Maintains current direction (N, E, S, W)
-Executes moves (move(), turnLeft(), turnRight())
-Reports status (statusReport())

**Grid.java & Cell.java (in grid package)**
-Defines the grid boundaries (width × height)
-Ensures rover stays within limits

**Key Design Patterns:**
-Command Pattern: encapsulates actions as objects (MoveCommand, LeftCommand, etc.)
-Strategy Pattern: direction logic encapsulated in separate classes (North, East, etc.)
-Single Responsibility: each class handles one domain (Grid, Rover, Direction, Command)

# Sample Input & Output (Detailed)

## Example: Simple move & rotate
**Grid size:** `5 5`  
**Initial rover position:** `1 2 N` (x=1, y=2, facing North)  
**Commands:** `LMLMLMLMM`

**Step-by-step (human):**
1. L -> turn left: facing West
2. M -> move: (0,2)
3. L -> turn left: facing South
4. M -> move: (0,1)
5. L -> turn left: facing East
6. M -> move: (1,1)
7. L -> turn left: facing North
8. M -> move: (1,2)
9. M -> move: (1,3)

**Final reported position:** `1 3 N`

**Output (program):**
 <img width="985" height="399" alt="Screenshot 2025-09-30 111348" src="https://github.com/user-attachments/assets/47cdcd50-066e-48d9-a461-abc8a3ef8477" />



