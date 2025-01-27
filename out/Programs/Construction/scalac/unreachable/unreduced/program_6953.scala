package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[(T_B,(Int,Char)), C]
case class CC_B[D](a: CC_A[D], b: CC_A[D], c: D) extends T_A[(T_B,(Int,Char)), D]
case class CC_C(a: T_A[T_B, ((Byte,Boolean),Int)]) extends T_B
case class CC_D(a: CC_A[CC_C]) extends T_B
case class CC_E(a: T_A[CC_D, CC_D], b: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_A()) => 1 
  case CC_E(_, _) => 2 
}
}