# To assemble
Via nasm and ld.

```
nasm -f elf32 -o hello_world.o hello_world.asm

ld -m elf_i386 -o hello_world.exe hello_world.o
```
