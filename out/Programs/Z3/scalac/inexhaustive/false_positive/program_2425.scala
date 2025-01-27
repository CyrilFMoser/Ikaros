package Program_31 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Char, b: C, c: C) extends T_A[C]
case class CC_B[D, E](a: D, b: CC_A[D], c: T_B[E]) extends T_A[D]
case class CC_C[F](a: Boolean, b: (Int,Int)) extends T_B[F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x', 'x', _) => 0 
  case CC_A(_, 'x', 'x') => 1 
  case CC_A(_, 'x', _) => 2 
  case CC_A(_, _, _) => 3 
  case CC_B(_, CC_A(_, _, _), CC_C(_, _)) => 4 
  case CC_B(_, _, _) => 5 
  case CC_B(_, _, CC_C(_, _)) => 6 
  case CC_B('x', CC_A(_, _, _), CC_C(_, _)) => 7 
}
}
// This is not matched: (CC_B Char
//      Boolean
//      Char
//      Wildcard
//      (CC_C Boolean Boolean Wildcard (T_B Boolean))
//      (T_A Char))
// This is not matched: (CC_A Char Wildcard Wildcard Wildcard (T_A Char))