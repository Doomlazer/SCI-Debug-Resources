Press ? while in debugger (when the game crashes when using debug-enabled interpreter to display a menu of commands.

Or it will crash because it can't load the debug help text, in which case:

q - quit

b - set breakpoint - object,method
B - set breakpoint - object,method (sticky)
<ctrl>B - clear sticky object,method breakpoint
n - set breakpoint - script,offset
N - set breakpoint - script,offset (sticky)
<ctrl>N - clear sticky script,offset breakpoint
R - break at the next return

C - clear all breakpoints and exit debug
D - exit debug
` - toggle debug

Enter - single step
Tab - step across send

a - inspect ID in accumulator
c - inspect current object
i - inspect object or memory
d - inspect hunk address

f - show free heap
s - show sends
r - show resource types
o - show objects in heap
O - show objects w/ addresses
S - show stack usage

g - edit global var
l - edit local var
f - edit frame var (temp var)

i - inspect selector
e - edit heap address or selector
t - trace heap address or selector
T - trace hunk address

c - display collection

left, right arrow
  - move address by 2 bytes
up, down arrow
  - move address by 16 bytes
pageup, pagedown
  - move address by 64 bytes

[ - move to next in doubly-
    linked list
] - move to previous in
    doubly-linked list