import pygame
x = pygame.init()

window = pygame.display.set_mode((500,500))
pygame.display.set_caption("This is pygame")

quit_game = False
game_over = False

while not quit_game:
    for event in pygame.event.get():
        print(event)
        if event.type == pygame.QUIT:
            quit_game = True

pygame.quit()
quit()
