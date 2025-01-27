package Program_30 

package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: B) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_A Int)))
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_A Int)))