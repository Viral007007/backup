# To emport pygame
import pygame

# To initialize the pygame 
x = pygame.init()

# To create game window
gamewindow = pygame.display.set_mode((1000,1000))

# To give title to display
pygame.display.set_caption("viral's game")

# exit_game && game_over (game specific variable)
exit_game = False
game_over = False
 
# to fix window's closing ( creating a game loop )
while not exit_game:
     for event in pygame.event.get():
        print(event)
     
        #quit condition ( quit game loop )
        if event.type == pygame.QUIT:
             exit_game = True

        # keydown event
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_RIGHT:
                print("you have press right arrow key")

            
            
            if event.key == pygame.K_LEFT:
                print("you have press left arrow key")



# To quit the game 
pygame.quit()
quit()
