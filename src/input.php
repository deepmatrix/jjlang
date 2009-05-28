class Main {
  static var $tokens;
  public static function main($args)
  {
    try {
  if ( args->length > 0 ) 
    {
    for ( $i = 0  ; i < args->length; i++) 
      {
      $this->doFile();
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
  if ( f->isDirectory() ) 
    {
      $files = f->list() 
    for ( $i = 0  ; i < files->length; i++) 
      $this->doFile();
    }
   else 
    if ( ( f->getName()->length() > 5 ) && f->getName()->substring(f->getName()->length() - 5)->equals(".java") ) 
      {
      System->err->println("   " + f->getAbsolutePath());
      $this->parseFile(f->getAbsolutePath());
      }

  }
  public static function parseFile($f)
  {
    try {
    $lexer 
  $this->tokens->setTokenSource(lexer);
    $parser 
  parser->compilationUnit();
  } 

  }
}
