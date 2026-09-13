# Assignment 1: Builder Pattern — Middle-Earth RPG

**Author:** Tagay Talgar
**Group:** SE-2511, Astana IT University

## Project Description
This project implements the creational Builder design pattern in Java to assemble complex role-playing game characters step-by-step[cite: 1]. The domain revolves around the Middle-Earth universe, allowing for both custom character creation and standard presets[cite: 1].

## Architectural Components
* **Product (`Pleyer`)**: Represents the complex character being built[cite: 1]. It stores immutable attributes like name, age, race, faction, and class.
* **Builder (`Builder`)**: Contains the construction logic and provides a Fluent API (method chaining) to configure the character[cite: 1].
* **Director (`PlayerDirector`)**: Orchestrates the build sequence for pre-defined configurations, such as `buildHerooflight` (Aragorn) and `buildHeroofEvil` (Witch-king)[cite: 1].
* **Client (`Main`)**: The entry point that tests the builders and displays the resulting products (a custom character Eomer, alongside the Director's presets)[cite: 1].

## Clean Code Principles Applied
The codebase explicitly incorporates the following five Clean Code principles[cite: 1]:

* **Validated Construction**: The `build()` method in the `Builder` class enforces strict state validation before creating a product[cite: 1]. 
  * *Code excerpt:* `if (age < 18) { throw new IllegalStateException("Персонаж должен быть строго 18 лет или старше!"); }`[cite: 1]
* **No Magic Strings**: Categorical data is strictly defined using enumerations (`Racee`, `Faction`, `Clas`) rather than raw strings to prevent typographical errors and invalid states[cite: 1]. 
  * *Code excerpt:* `public Builder setFaction(Faction faction)`[cite: 1]
* **Immutability**: The `Pleyer` class utilizes `private final` fields initialized exclusively through the Builder, preventing state modification after instantiation[cite: 1].
  * *Code excerpt:* `private final String name;`[cite: 1]
* **Method Chaining (Small Methods)**: Every setter in the `Builder` performs a single, focused assignment and returns its own instance (`this`), enabling a readable Fluent API[cite: 1].
  * *Code excerpt:* `public Builder setAge(int age) { this.age = age; return this; }`[cite: 1]
* **Intention-Revealing Names**: Classes, methods, and variables use meaningful naming conventions that clearly describe their domain purpose without needing extra comments[cite: 1].
  * *Code excerpt:* `PlayerDirector`, `buildHerooflight()`, `setracee(Racee.Men)`[cite: 1]

## How to Run
1. Clone the repository to your local machine.
2. Open the project in an IDE (IntelliJ IDEA recommended)[cite: 1].
3. Run the `Main` class to observe the console output demonstrating both custom and directed character construction.
