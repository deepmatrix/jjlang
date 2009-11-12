class Main {
  static var $tokens =   new CommonTokenStream();
  public static function main($args)
  {
    try {
  if ( $args->length > 0 ) 
    {
    for ( $i = 0  ; $i < $args->length; $i++) 
      {
      $this->doFile(  new File($args[$i]));
      }
    }
   else 
    {
    System->err->println("Usage: java Main <directory or file name>");
    }
  } 

  }
  public static function doFile($f)
  {
  if ( $f->isDirectory() ) 
    {
      $files = $f->list() ;
    for ( $i = 0  ; $i < $files->length; $i++) 
      $this->doFile(  new File($f, $files[$i]));
    }
   else 
    if ( ( $f->getName()->length() > 5 ) && $f->getName()->substring($f->getName()->length() - 5)->equals(".java") ) 
      {
      System->err->println("   " + $f->getAbsolutePath());
      $this->parseFile($f->getAbsolutePath());
      }

  }
  public static function parseFile($f)
  {
    try {
    $lexer =   new JavaParserLexer(  new ANTLRFileStream($f)) ;
  $this->tokens->setTokenSource($lexer);
    $parser =   new JavaParser($this->tokens) ;
  $parser->compilationUnit();
  } 

  }
}
