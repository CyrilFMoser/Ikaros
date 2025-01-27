package Program_15 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B[C]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B T_B T_B)
// This is not matched: (CC_B Boolean Byte (T_A Boolean))