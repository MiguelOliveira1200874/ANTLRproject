grammar JobOpening;

// Parser rules
jobOpening          : jobRef title contractType modes address company vacancies description requirements EOF;

jobRef              : 'JobRef:' ID ;
title               : 'Title:' STRING ;
contractType        : 'ContractType:' ( 'full-time' | 'part-time' | 'contract' | 'temporary' );
modes               : 'Mode:' ( 'remote' | 'hybrid' | 'onsite' );
address             : 'Address:' STRING ;
company             : 'Company:' STRING ;
vacancies           : 'Vacancies:' ID ;
description         : 'Description:' STRING ;
requirements        : 'Requirements:' requirementSpec+ ;

requirementSpec     : 'ReqSpec:' STRING ;

// Lexer rules
ID                  : [a-zA-Z0-9]+ ;
STRING              : '"' ( ~["\r\n] | '""' )* '"' ;
INTEIRO             : [a-zA-Z0-9]+ ;
WS                  : [ \t\r\n]+ -> skip ;
