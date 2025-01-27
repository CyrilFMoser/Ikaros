package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[Int, Boolean], b: T_A[E, (Boolean,Int)], c: T_A[C, C]) extends T_A[C, D]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
}
}
// This is not matched: (CC_A Int Boolean Boolean Wildcard Wildcard Wildcard (T_A Int Boolean))
// This is not matched: Pattern match is empty without constants