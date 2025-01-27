package Program_14 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: Boolean, b: T_A[Char]) extends T_A[C]
case class CC_B[E, F](a: T_A[F], b: Char, c: T_B[F]) extends T_B[E]
case class CC_C[G](a: CC_B[G, G], b: T_B[G], c: T_A[G]) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, 'x', CC_C(_, _, _)) => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
  case CC_B(CC_A(_, _), 'x', CC_B(_, _, _)) => 2 
  case CC_B(CC_A(_, _), 'x', CC_C(_, _, _)) => 3 
  case CC_B(_, _, _) => 4 
  case CC_B(CC_A(_, _), _, CC_B(_, _, _)) => 5 
  case CC_B(CC_A(_, _), _, _) => 6 
  case CC_C(_, CC_B(_, _, _), CC_A(_, _)) => 7 
  case CC_C(_, CC_C(_, _, _), _) => 8 
}
}
// This is not matched: (CC_B Char
//      Boolean
//      Wildcard
//      Wildcard
//      (CC_C Boolean Wildcard Wildcard Wildcard (T_B Boolean))
//      (T_B Char))
// This is not matched: (CC_A Wildcard (T_A (T_A Byte)))