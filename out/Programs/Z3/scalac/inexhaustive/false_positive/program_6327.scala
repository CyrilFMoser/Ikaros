package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D) extends T_A[D]
case class CC_B() extends T_A[T_B[Byte, (Char,Char)]]
case class CC_D() extends T_B[((Boolean,Int),Char), T_A[Byte]]

val v_a: T_A[T_B[Byte, (Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), _) => 1 
}
}
// This is not matched: (CC_A Wildcard T_A)