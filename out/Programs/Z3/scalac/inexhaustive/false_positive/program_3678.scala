package Program_15 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, (Byte,Int)]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C[D, C, E]() extends T_B[D, C]
case class CC_D[F, G](a: (Boolean,T_A), b: CC_A) extends T_B[G, F]

val v_a: T_B[CC_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _) => 1 
  case CC_D((_,CC_B(_)), _) => 2 
}
}
// This is not matched: (CC_C (CC_B T_A T_A) (CC_B T_A T_A) T_A (T_B (CC_B T_A T_A) (CC_B T_A T_A)))
// This is not matched: (CC_C (CC_B T_A T_A) (CC_B T_A T_A) T_A (T_B (CC_B T_A T_A) (CC_B T_A T_A)))