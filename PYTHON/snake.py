import pygame
import random
import os

#initialize music
pygame.mixer.init()

#initialize pygame
pygame.init()

#make color
white = (250, 250, 250)
red = (255, 0, 0)
green = (0, 255, 0)
blue = (0, 0, 250)
black= (0,0,0)

#making game window
screen_width = 1000
screen_height = 1000
game_window = pygame.display.set_mode((screen_width, screen_height))
pygame.display.set_caption("SNAKE GAME")
pygame.display.update()

#background image
bgimg = pygame.image.load('img.jpg')
bgimg = pygame.transform.scale(bgimg,(screen_width,screen_height)).convert_alpha()

#clock and fps
clock = pygame.time.Clock()

#font and screen printing 
_font = pygame.font.SysFont(None, 25)
def text_screen(text, color, x, y):
    screen_text = _font.render(text, True, color)
    game_window.blit(screen_text, [x, y])

#to ploat snake
def ploat_snake(game_window, color, snk_list, size):
    for x, y in snk_list:
        pygame.draw.rect(game_window, color, [x, y, size, size])

#welcome screen
def welcome():
    exit_game = False
    
    # font and printing on welcome screen
    _font = pygame.font.SysFont(None, 55)
    def text_screen(text, color, x, y):
        screen_text = _font.render(text, True, color)
        game_window.blit(screen_text, [x, y])
    #gameloop for welcome window
    while not exit_game:
        game_window.fill((124,24,210))
        text_screen("welcome to snake",black,300,300)
        pygame.display.update()

        #event in welcome window
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                exit_game = True
            if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_RETURN:
                        gameloop()

    pygame.display.update()
    clock.tick(60)

#window for playing
def gameloop():
    
    #load and play music
    pygame.mixer.music.load('aw.mp3')
    pygame.mixer.music.play()
    
    # pygame specific veriables
    exit_game = False
    game_over = False
    snake_x = 25
    snake_y = 25
    snake_size = 30
    velocity_x = 0
    velocity_y = 0
    fps = 100
    snk_list = []
    snk_length = 1
    score = 0
    
    #open file for store high score
    if (not os.path.exists("snake.txt")):
        with open("snake.txt","w") as f:
            f.write("0") 
    with open("snake.txt", "r") as f:
        f.seek(0)
        high_score = f.read(10)
        print(high_score)

    # random object
    obj_x = random.randint(0, screen_width/2)
    obj_y = random.randint(0, screen_height/2)

    #staring and overing game
    while not exit_game:

        #game over
        if game_over:

            # write high score in file
            with open("snake.txt", "w") as f:
                f.write(high_score)
            
            #game over screen
            game_window.fill((211,1,177))
            text_screen("GAME OVER !! PRESS ENTER TO CONTINUT", black, 300, 400)
            
            #event in game over screen 
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    exit_game = True

                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_RETURN:
                        gameloop()
        #game starting
        else:

            #event in playgame screen
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    exit_game = True

                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_RIGHT:
                        velocity_x = 1
                        velocity_y = 0
                    if event.key == pygame.K_LEFT:
                        velocity_x = -1
                        velocity_y = 0
                    if event.key == pygame.K_UP:
                        velocity_y = -1
                        velocity_x = 0
                    if event.key == pygame.K_DOWN:
                        velocity_y = 1
                        velocity_x = 0
                    if event.key == pygame.K_q:
                        score += 5    

            #velocity of snake
            snake_x += velocity_x
            snake_y += velocity_y

            #appending head in snake length list
            head = []
            head.append(snake_x)
            head.append(snake_y)
            snk_list.append(head)

            #disappearing the object(food)
            if abs(snake_x - obj_x) < 25 and abs(snake_y - obj_y) < 25:
                score += 1
                
                #new position for object
                obj_x = random.randint(0, screen_width/2)
                obj_y = random.randint(0, screen_height/2)
                snk_length += 10

                #increasing score
                if score > int(high_score):
                    high_score = str(score)
            #deleting head form snake lenght list
            if len(snk_list) > snk_length:
                del snk_list[0]

            # game_over
            if snake_x < 0 or snake_x > screen_width or snake_y < 0 or snake_y > screen_height:
                game_over = True
                #game over music
                pygame.mixer.music.load('gameover.mp3')
                pygame.mixer.music.play()

            # game over
            if head in snk_list[:-1]:
                game_over = True
                #game over music
                pygame.mixer.music.load('gameover.mp3')
                pygame.mixer.music.play()

            #filling color in play game window
            game_window.fill(blue)
            #filing image  playing game window
            game_window.blit(bgimg,(0,0))
            #print text on playing game screen 
            text_screen("score :"+str(score) + "  high score :" + high_score, green, 5, 5)
            #draw random objec in playing game window 
            pygame.draw.rect(game_window, red, [obj_x, obj_y, snake_size, snake_size])
            #draw snake in play game window
            ploat_snake(game_window, white, snk_list, snake_size)
        #to update play gmae window
        pygame.display.update()
        clock.tick(500)
    pygame.quit()
    quit()

# calling welcome game window
welcome()
