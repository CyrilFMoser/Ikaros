package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C, c: Boolean) extends T_A[C]
case class CC_B[D, E](a: T_B[D], b: CC_A[D]) extends T_B[D]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: T_B[G], b: G, c: Byte) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(_, _), _, 0) => 1 
  case CC_D(CC_D(_, _, _), 'x', 0) => 2 
  case CC_D(CC_D(_, _, _), _, _) => 3 
  case CC_D(_, _, _) => 4 
  case CC_D(_, 'x', _) => 5 
  case CC_D(CC_D(_, _, _), _, 0) => 6 
  case CC_B(CC_D(_, _, _), CC_A(_, _, _)) => 7 
  case CC_B(_, CC_A(_, _, _)) => 8 
  case CC_B(CC_B(_, _), _) => 9 
  case CC_B(CC_B(_, _), CC_A(_, _, _)) => 10 
  case CC_B(CC_C(), _) => 11 
}
}
// This is not matched: (CC_B Char
//      (CC_B Boolean Boolean Boolean Boolean Boolean)
//      Wildcard
//      (CC_A Char Wildcard Char Boolean (T_A Char))
//      (T_B Char))
// This is not matched: (CC_A Wildcard Wildcard T_A)