package Program_29 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D]() extends T_A[C]
case class CC_B[E](a: T_B[E]) extends T_B[E]
case class CC_C[F](a: (Char,Char), b: F) extends T_B[F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char Boolean (T_A Char))
// This is not matched: (CC_B Boolean Wildcard Wildcard Wildcard (T_A (T_A (Tuple Int Int))))