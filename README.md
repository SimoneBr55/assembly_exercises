# assembly_exercises
Scripts in assembly taken from people to study. I now own these, I think you'll find. :P

# To assemble
Via nasm and ld.

```
nasm -f elf32 -o hello_world.o hello_world.asm

ld -m elf_i386 -o hello_world hello_world.o
```
