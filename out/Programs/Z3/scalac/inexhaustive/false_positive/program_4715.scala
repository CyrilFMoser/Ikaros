package Program_10 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Int)))
// This is not matched: Pattern match is empty without constants