package Program_15 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_A[(Int,Byte)]]

val v_a: T_A[T_A[(Int,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A (Tuple Int Byte))))
// This is not matched: (CC_A Wildcard Wildcard T_A)