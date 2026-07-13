# 2D Retro RPG Game Engine (In Active Development)

A standalone 2D retro-style RPG built completely from scratch using Java Swing. This project is a hands-on exploration of scene management, cinematic animation handling, custom pixel art design, and game audio systems.

---

## The Vision: A Standalone Gaming Experience

The gameplay seamlessly balances two main environments:
1. **The Overworld Map:** A top-down exploration screen where the player navigates predefined paths.
2. **The Cinematic Battle & Story Screen:** A dedicated scene that dynamically displays animated sequences, turn-based combat, and text-based dialogue containers.

---

## Project Roadmap & Development Progress

This game is built using a structured development lifecycle. Progress is tracked across clear milestones so you can see exactly how the engine evolves step-by-step.

### Milestone 1: The World Map Layout (COMPLETED)
* **What I Built:** The foundational map environment grid.
* **The Engineering:** Instead of drawing individual path lines manually, I implemented mathematical loops using Java's `Graphics2D` engine.
* This automatically maps out clean path channels for the player to follow, decoupling the structural path logic from hardcoded positions.

### Milestone 2: Cinematic Animations & Art Pipelines (IN PROGRESS)
* **The Creative Focus:** I am using **LibreSprite** to create custom frame-by-frame pixel art loops for multiple critical game phases
  * **Pin Movement:** Controls to allow pin navigation across map nodes.
  * **Intro Sequences:** Animations to set the stage before the player starts moving.
  * **Dynamic Fight Sequences:** Combat movements, strikes, and reactions rather than just standing still.
  * **Game Endings:** Victory animation when the adventure concludes.
* **The Integration:** Exporting these timelines as loop-enabled `.gif` files, allowing Java’s background rendering engine to play complex animations smoothly without heavy frame rate drops.

### Milestone 3: Battle & Dialogue Systems (UPCOMING)
* **Scene Swapping:** Implementing a container manager (`CardLayout`) to act as a scene engine, instantly swapping the window from the Map view to the Combat arena when an encounter triggers.
* **Dialogue Engine:** Constructing a graphics-based text system to display story narratives, combat notifications, and character text boxes directly on-screen.

### Milestone 4: Audio & Collisions (BACKLOG)
* **Dynamic Audio:** Utilizing Java's native `AudioSystem` clips to handle contextual background soundtracks.
* **Collision Triggers:** Programming bounding-box detection to capture exactly when the player steps onto an encounter tile.

---

## Visualizing the Evolution (Git Branches)

To look at how this game was built over time, you can switch between these dedicated development snapshots in the repository:
* **`main`**: The current master folder featuring the most up-to-date active systems (Currently Not In Progress).
* **`milestone-1-map-layout`**: A look at the early code featuring just the foundational path loop math and geometry layout.

---

*Built by **Savio Miano** — 
