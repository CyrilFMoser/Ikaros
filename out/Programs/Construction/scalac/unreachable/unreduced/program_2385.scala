package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Boolean) extends T_A[T_A[Int, T_A[T_B, (Byte,Int)]], T_B]
case class CC_B(a: (T_A[CC_A, CC_A],CC_A), b: T_B) extends T_A[T_A[Int, T_A[T_B, (Byte,Int)]], T_B]
case class CC_C(a: Char, b: T_A[T_A[T_B, T_B], T_A[(Char,Boolean), T_B]], c: T_B) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C('x', _, CC_C(_, _, _))) => 0 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 1 
  case CC_C(_, _, CC_C('x', _, CC_D())) => 2 
  case CC_C(_, _, CC_D()) => 3 
  case CC_D() => 4 
}
}
// This is not matched: CC_C(_, _, CC_C(_, _, CC_D()))