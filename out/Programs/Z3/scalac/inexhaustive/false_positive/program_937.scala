package Program_30 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Boolean (T_A Int))
// This is not matched: (CC_C (CC_C Wildcard T_A) T_A)