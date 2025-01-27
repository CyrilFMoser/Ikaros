package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: T_A[B], c: (T_B,T_B)) extends T_A[B]
case class CC_B[C](a: T_A[C]) extends T_A[C]
case class CC_C[D]() extends T_A[D]
case class CC_D[E]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: (CC_D T_B T_B)
// This is not matched: (CC_A Boolean (T_A Boolean))