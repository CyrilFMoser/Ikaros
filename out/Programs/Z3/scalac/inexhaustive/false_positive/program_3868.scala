package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_E[D](a: CC_B, b: (CC_A,T_A)) extends T_B[T_B[Byte, CC_C], D]

val v_a: CC_E[T_A] = null
val v_b: Int = v_a match{
  case CC_E(_, (_,CC_A())) => 0 
}
}
// This is not matched: (CC_A Int (T_A Int Int) Wildcard (T_A Int (T_A Int Int)))