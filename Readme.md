# DogHealth
This was a pair programming exercise that was taken place at Pair Columbus, in September.  The objective was to create a check list for a Veterinarian Office.

We set up the input to have the user put in what type of animal and what needs to happen next. 

From the Pair Columbus Repoistory here were the guidelines of our exercise:
RescueDog



My name is Mika, I work at a shelter. My job is to handle dog intake. First, I put a dog into its pen and then I enter each dogs data into our system for other staff to complete their tasks to get a dog ready for a potential home. Our system needs a complete overhaul so we need you to build a new one for us.

User Stories

I want to enter several dogs into our system.
I should be able enter a dog's name, age and breed.
I want staff to complete their actions in order.
Dog Vet (wait 5 sec, finshed_state: "healthy")
Dog Groomer (wait 10 sec, finished_state: "groomed")
Dog Handler (wait 3 sec, finished_state: "ate")
Notify Prospective Owners (wait 2 sec, finished_ state: "Ready for a home")
Extra Credit

I shouldn't have to wait for each dog to be "Ready for a home" before I can enter another dog into our system.
Actors should only complete their task if the previous task was completed (eg. If a dog is sick it should stay at the vet before being groomed)
I should be able to view the queue and remove a dog once all tasks have been completed and I've found it a home.
What if we introduce a Dog Walker that can complete it's task anytime that a dog is in-queue? How does that change things?
What if some tasks are higher priority than others?
FYI

Feel free to get creative!
Assume that each staffperson will automatically return the pet to its pen upon completion of its task.
We're simulating the time it takes for each staffperson to complete their task. Be sure to incorporate something like the following:
  class Vet
    def complete_task(dog)
      sleep 5
      puts "#{dog.name} is now healthy!"
    end
  end
