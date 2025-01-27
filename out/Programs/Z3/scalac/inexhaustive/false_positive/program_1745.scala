package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E]) extends T_A[E, F]
case class CC_B[G, H](a: T_B[G, G]) extends T_B[H, G]
case class CC_C[I]() extends T_B[T_B[Boolean, Char], T_A[Int, Boolean]]

val v_a: T_B[T_B[Boolean, Char], T_A[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_C Boolean (T_B (T_B Boolean Char) (T_A Int Boolean)))
// This is not matched: Pattern match is empty without constants