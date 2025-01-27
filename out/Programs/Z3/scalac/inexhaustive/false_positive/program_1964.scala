package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[F]() extends T_A[(Byte,Boolean), F]
case class CC_C() extends T_B[T_A[Byte, Boolean]]
case class CC_E(a: Int) extends T_B[CC_B[CC_C]]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants