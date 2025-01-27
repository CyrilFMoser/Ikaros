package Program_15 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: Int, b: T_A[C, C]) extends T_A[D, C]
case class CC_B[E](a: E, b: E, c: E) extends T_A[E, T_B]
case class CC_C[F](a: Boolean, b: F) extends T_B
case class CC_D(a: T_A[T_B, T_B], b: CC_A[Int, (Char,Char)], c: (T_B,T_B)) extends T_B
case class CC_E[G](a: Byte) extends T_B

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, 'x', _) => 0 
  case CC_B('x', _, 'x') => 1 
  case CC_B(_, 'x', 'x') => 2 
  case CC_B('x', 'x', 'x') => 3 
  case CC_B(_, _, 'x') => 4 
  case CC_B('x', _, _) => 5 
  case CC_B('x', 'x', _) => 6 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A (CC_B Wildcard (CC_A Wildcard Wildcard Wildcard T_A) T_A)
//      Wildcard
//      Wildcard
//      T_A)