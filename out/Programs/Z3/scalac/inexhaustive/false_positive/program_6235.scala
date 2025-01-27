package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B[C]() extends T_A[C]
case class CC_C() extends T_A[CC_B[T_B]]
case class CC_D(a: ((Byte,Int),CC_C), b: T_B) extends T_B
case class CC_E() extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_E()) => 0 
}
}
// This is not matched: (CC_D Wildcard (CC_D Wildcard (CC_F Boolean T_B) T_B) T_B)