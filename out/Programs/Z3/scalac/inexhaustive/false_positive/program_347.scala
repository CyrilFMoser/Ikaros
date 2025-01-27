package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Int)))
// This is not matched: (CC_D Boolean Wildcard Wildcard Wildcard (T_B Boolean))