grammar fx50;

fragment
DIGIT
:
	[0-9]
;

LET
:
	'->'
;

SHOW
:
	'/|'
;

NEXT
:
	':'
;

ASK
:
	'?'
;

PAR
:
	'('
	| ')'
;

VAR
:
	'A'
	| 'B'
	| 'C'
	| 'D'
	| 'X'
	| 'Y'
	| 'M'
	| 'Ans'
;

CONSTANT
:
	'pi'
	| 'e'
;

NUM
:
	DIGIT+
	(
		[.,] DIGIT+
	)?
;

ADD
:
	'+'
;

SUB
:
	'-'
;

MUL
:
	'*'
;

DIV
:
	'/'
;

EXP
:
	'^'
;

ROOT
:
	'/-('
;

BINCON
:
	'='
	| '/='
	| '>'
	| '>='
	| '<'
	| '<='
;

IF
:
	'If'
;

THEN
:
	'Then'
;

ELSE
:
	'Else'
;

IFEND
:
	'IfEnd'
;

program
:
	stmt* EOF
;

stmt
:
	let
	| show
	| cal
	| ask
	| ifexpr
;

let
:
	(
		expr
		| logicExpr
		| logicExprFunc
	) LET VAR
	(
		NEXT
	)?
;

show
:
	(
		expr
		| let
		| ask
		| logicExpr
		| logicExprFunc
	) SHOW
;

cal
:
	(
		expr
		| logicExpr
		| logicExprFunc
	) NEXT
;

ask
:
	ASK LET VAR
	(
		NEXT
	)?
;

ifexpr
:
	IF
	(
		logicExpr
		| expr
	) NEXT thenExpr elseExpr? IFEND NEXT
;

thenExpr
:
	THEN
	(
		ask
		| cal
		| show
	)
;

elseExpr
:
	ELSE
	(
		ask
		| cal
		| show
	)
;

expr
:
	'(' par = expr ')'? # parExpr
	| left = expr op = '^' right = expr # opExpr
	| op = '-' expr # negExpr
	| left = expr op =
	(
		'*'
		| '/'
	) right = expr # opExpr
	| noopmul # noopExpr
	| left = expr op =
	(
		'+'
		| '-'
	) right = expr # opExpr
	| op = '/-(' expr ')'? # root
	| value # valExpr
;

logicExpr
:
	left = expr op =
	(
		'='
		| '/='
		| '>'
		| '>='
		| '<'
		| '<='
	) right = expr
;

logicExprFunc
:
	expr '(' logicExpr
;

noopmul //No-operator multiply

:
	value (value | expr)+
;

value
:
	NUM
	| VAR
	| CONSTANT
;