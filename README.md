Report: Developing an Android Application for Historical Age Comparison
1. Introduction
As the objective of the assignment was to create an History  Android mobile application that could bring history to life in a personal and interactive way. The idea behind the project was to allow users to compare their current age with the ages at which famous historical figures passed away. The goal was to create a simple yet engaging app that offers users a unique perspective on history.
The primary objective was to design an app that provides users with meaningful historical comparisons by using age as a connection point. This report outlines the steps I took in the conceptualization, development, and testing of the application, as well as the challenges I encountered and the solutions I implemented.
2. Conceptualization and Design
When I first started thinking about this project, I wanted to keep the core idea simple but impactful. The concept was straightforward: the app would ask users to input their age, and it would then provide a comparison with the age at which a famous historical figure died. I wanted users to feel a personal connection to these figures and gain a deeper appreciation for history by relating it to their own lives.
The design process began with brainstorming how the app would look and function. I sketched out a basic layout on paper, ensuring that the app would be intuitive for users of all ages. My focus was on making the interface clean and simple, so I included:
•	A field where users can enter their age.
•	A "Generate History" button that processes the input and provides the historical comparison.
•	A "Clear" button that resets the form for a new entry.
•	Error-handling to ensure only numerical inputs are accepted.
I wanted the design to be minimalistic, with no unnecessary features, so users could focus on what the app does best—providing interesting historical insights.
3. Development Process
Once I had a clear vision of how the app would look and function, I moved on to the development phase. I wanted to ensure the app was reliable and easy to maintain.
Here’s a breakdown of the key features I implemented:
•	Age Input and Historical Comparison: Users can enter their age, and when they click the "Generate History" button, the app compares their age with a historical figure. For example, if a user enters 95, the app displays a message like: "You are 95 years old, the same age as Nelson Mandela when he passed away." This feature makes the app engaging, offering a personal connection to history.
•	Clear Button: This button was added to allow users to reset the app easily, clearing the input and output fields so they can start fresh without needing to reload the app.
•	Error Handling: One of the most important aspects of the app was ensuring it handled errors smoothly. If a user enters anything other than a number, such as letters or symbols, the app prompts them to "Please enter a valid number." This was crucial for preventing crashes and making the app user-friendly.
During development, I broke down each feature into individual tasks and tackled them one at a time. This modular approach helped me identify and fix issues early on, and it made debugging much easier.
4. User Interface and Experience
A big part of my focus was making the app as simple and intuitive as possible. I wanted anyone, regardless of their familiarity with technology, to be able to use it without any confusion.
The interface consists of:
•	A single input field where users can enter their age.
•	A clearly labeled “Generate History” button that starts the comparison process.
•	A “Clear” button that resets the app.
I kept the visual design clean and uncluttered, so users can focus on the app’s main purpose. The goal was to create an experience that felt seamless and intuitive, requiring minimal effort from the user to engage with the historical content.
5. Testing and Debugging
Testing was a critical part of the project to ensure everything worked as intended. I wanted to make sure the app could handle a variety of inputs and provide meaningful feedback.
•	Functionality Testing: I tested the core functionality by inputting different ages, from very young (5 years) to much older (100 years), to verify that the correct comparisons were generated. Each test gave me confidence that the app was working as expected.
•	Error Handling: I deliberately entered incorrect formats, such as letters or special characters, to ensure the error-handling feature worked properly. The app successfully prompted users to correct their input, which helped me feel confident that it would perform well in real-world scenarios.
•	Button Testing: Both the “Generate History” and “Clear” buttons were tested extensively to make sure they performed their functions without fail. The generate button provided the right historical comparisons, while the clear button reset the input fields and output without any issues.
I also tested edge cases, like when the user's age didn’t match any figure in the database. For instance, if a user entered an age like 20, the app displayed a message saying, “There is no historical figure known to be around 20 years old.” This ensured that the app would always provide some form of feedback, no matter what input was given.
6. GitHub and Version Control
Throughout the development process, I used GitHub for version control. This allowed me to keep track of changes, avoid data loss, and collaborate more easily if needed in the future.
The key actions I took with GitHub were:
•	Committing Changes: Each time I added a new feature or fixed a bug, I committed the changes to the repository. This ensured that I had a complete history of the project’s development.
•	Pushing to Repository: Regular updates were pushed to GitHub, keeping the project backed up and secure.
•	Branching: When testing new features or ideas, I created branches to work on these changes separately. This ensured that the main codebase wasn’t disrupted, allowing me to safely experiment with new features before merging them.
7. Challenges and Solutions
Like any project, this one came with its challenges, but they provided valuable learning opportunities.
•	Handling Non-numerical Input: One challenge was ensuring that users could only input valid numbers. I solved this by implementing error-handling code that displayed an error message when non-numerical input was detected. This made the app much more robust and user-friendly.
•	Historical Data Accuracy: I needed to ensure the historical comparisons were accurate and relevant. To do this, I conducted thorough research on famous historical figures their ages at death. This allowed the app to provide meaningful comparisons.
•	Simple, Accessible Design: Creating a clean, accessible interface was harder than I initially expected. I solved this by focusing on minimalism and functionality, ensuring that the app was easy to navigate for users of all ages and tech skills.
8. Conclusion
By doing this assignment and developing this history-based age comparison app was a rewarding journey that blended my interests in history and technology. By using Kotlin and GitHub for version control, I successfully created an interactive tool that allows users to connect their personal milestones with the lives of famous historical figures. The challenges I faced, such as ensuring valid input and historical accuracy, were overcome through careful design and iteration.
This project demonstrated the potential for mobile applications to make learning history engaging and personal. By offering users a chance to reflect on the lives of notable figures in relation to their own age, the app helps make history more relatable and interesting. It’s a small but significant step in using technology to preserve and teach history in a way that resonates with today’s fast-paced, digital world.

