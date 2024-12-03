JAVAC = javac
JAVA = java
SRC = $(wildcard *.java)
CLASS_FILES = $(SRC:.java=.class)
MAIN_CLASS = Part2.java

run: $(CLASS_FILES)
	$(JAVA) $(MAIN_CLASS)

%.class: %.java
	$(JAVAC) $<

clean:
	rm $(CLASS_FILES)
