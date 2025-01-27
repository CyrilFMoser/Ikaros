package Program_14 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: T_B[E], c: Boolean) extends T_A[T_B[D], D]

val v_a: T_A[T_B[Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard Wildcard (T_A (T_B Boolean) Boolean))
// This is not matched: Pattern match is empty without constants