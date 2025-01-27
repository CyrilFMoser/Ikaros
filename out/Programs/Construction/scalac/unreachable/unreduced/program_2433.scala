package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, Boolean], b: T_A[(Byte,Boolean), T_A[(Int,Boolean), Boolean]], c: Char) extends T_A[T_A[T_A[Char, Char], T_A[Int, Byte]], T_A[T_A[(Char,Char), Byte], (Char,Int)]]
case class CC_B(a: CC_A, b: CC_A, c: Int) extends T_A[T_A[T_A[Char, Char], T_A[Int, Byte]], T_A[T_A[(Char,Char), Byte], (Char,Int)]]
case class CC_C() extends T_A[T_A[T_A[Char, Char], T_A[Int, Byte]], T_A[T_A[(Char,Char), Byte], (Char,Int)]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Int, Byte]], T_A[T_A[(Char,Char), Byte], (Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 'x') => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}