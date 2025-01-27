package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[T_A[Boolean]]
case class CC_B[C, D]() extends T_A[C]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_) => 1 
  case CC_A(CC_B()) => 2 
}
}
// This is not matched: (CC_A (T_A Boolean)
//      (CC_A Boolean Wildcard (T_A (T_A Boolean)))
//      (T_A (T_A Boolean)))
// This is not matched: (CC_D Byte (T_B Byte))