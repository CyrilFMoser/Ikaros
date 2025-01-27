package Program_30 

package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Boolean)))
// This is not matched: (CC_A Boolean (T_A (T_A Boolean)))