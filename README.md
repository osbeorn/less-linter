#LessLinter - a tool for "linting" LESS files
TODO

##1. Setting up the project in Eclipse

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
  -b, --bracket-location: Check if the { bracket is on the same line as the ruleset preceeded by a space and if the } bracket is on it's own line after the final property.
  -g, --prop-groups: Check if properties are grouped by type and in correct order.
  -i, --id-styling: Check if ID selectors are used.
  -u, --underscores: Check if underscores are used in selector names.
  -C, --color-format: Check if colors are written using the hex 6-digit lowercase format.
  -N, --count-selectors: Counts the following selectors: universal, ID, class, and tag selectors.
```