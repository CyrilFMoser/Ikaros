package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Boolean, (Byte,Char)]]
case class CC_B() extends T_A[T_B[Boolean, (Byte,Char)]]
case class CC_D(a: Byte) extends T_B[(CC_A,CC_B), CC_B]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_A Boolean))