package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[C]
case class CC_C[H](a: T_A, b: H, c: T_B[H]) extends T_B[H]
case class CC_D[I]() extends T_B[I]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_D()) => 0 
}
}
// This is not matched: (CC_A Byte (T_A Byte))