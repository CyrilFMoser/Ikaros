package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A, T_B[CC_A, Byte]], b: CC_A) extends T_A
case class CC_C[C, D]() extends T_B[C, D]
case class CC_D[E]() extends T_B[E, CC_C[CC_B, (CC_B,(Boolean,Int))]]
case class CC_E[G, F]() extends T_B[F, G]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_E(), _) => 1 
}
}
// This is not matched: CC_B(CC_C(), _)