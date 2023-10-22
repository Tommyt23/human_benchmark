import pyautogui

coords = [249, 301]
x, y = coords[0], coords[1]

try:
    while True:
        s = pyautogui.screenshot(region=(x, y, 1, 1))
        pixel_color = s.getpixel((0, 0))
        
        if pixel_color == (75, 219, 106):
            pyautogui.click(x+10, y+10)
        
except KeyboardInterrupt:
    print("\nProgram terminated by user.")