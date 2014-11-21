#LessLinter - a tool for "linting" LESS files

##1. Synopsis
As the name of the project suggests, this is a program for linting LESS files, i.e. for checking if LESS file conforms to the specified rules. The program was developed as a part of the Celtra challenge (http://www.fri.uni-lj.si/si/raziskave/studentski_izzivi/celtrin_izziv/). The rules for formatting LESS files were gathered from the challenge instructions and from the http://galjot.si/formatting-css website.

##2. Usage
```
java -jar less-linter [options] <file>
e.g. java -jar less-linter something.less

Options:
  -h, --help: Output usage information.
  -r, --raw <string>: Pass in a raw string of LESS.
  -a, -all: When used, all checks will be performed using their default values. To use a different value use the appropriate switch followed by the value.
  -D, --selector-depth <integer>: Show warning where selector depth is over the specified limit, default is 4.
  -s, --decl-spaces-multi <integer> Check and specify how many spaces should there be preceeding every property declaration, default is 4 (4 on 1st level, 8 on 2nd level, etc.).
  -p, --decl-spaces-single <integer> Check and specify how many spaces should there be preceeding and following every property declaration in a single line rule statement, default is 1.
  -S, --line-span: Check ruleset line span based on the property count inside the block.
  -m, --multi-new-line: Check if multi line ruleset is followed by a new line.
  -l, --lowercase: Check if selectors, properties, etc. are written in lowercase and camel-case format.
  -c, --colon-spaces: Check if there is a space after the : in single line rulesets, and if there is a space before and after the : in multi line rulesets.
  -b, --block-start <integer>: Check if the { bracket is on the same line as the ruleset and preceeded by spaces (1 space by default).
  -k, --block-end: Check if the } is on it's own line after the final property.
  -g, --prop-groups: Check if properties are grouped by type and in correct order.
  -i, --id-styling: Check if ID selectors are used.
  -u, --underscores: Check if underscores are used in selector names.
  -C, --color-format: Check if colors are written using the hex 6-digit lowercase format.
  -N, --count-selectors: Counts the following selectors: universal, parent, ID, class, and tag selectors.
```

##3. Setting up the project in Eclipse
If you wish to test or modify this code, there are a few tools you should use:
* Eclipse 4.3: https://www.eclipse.org/downloads/packages/eclipse-standard-432/keplersr2,
* ANTLRV4 library: http://www.antlr.org/download/antlr-runtime-4.4.jar (it is also bundled with this project),
* Antlr 4 IDE Eclipse plugin: https://github.com/jknack/antlr4ide.
 
After installing Eclipse, install the plugin by following the instructions found on the plugins homepage. Once you have done that, go ahead and import this project into Eclipse. You will notice there are two projects present: *LessAntlrV4* and *LessLinter*. The first project contains the LESS grammar written with the help of ANTLR, and the second contains the linter. In order to compile the grammar, we have to include the ANTLRV4 library. Go to Properties of the first project, select ANTLR 4 and then Tool. There you should remove the existing library and add the new one. After that rebuild the project and you're done.