package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_B() extends T_B[(T_B[Byte, Char],T_B[Boolean, Boolean]), T_A[Boolean]]
case class CC_C(a: T_B[CC_B, CC_B], b: T_A[(CC_B,(Boolean,Byte))], c: Byte) extends T_B[(T_B[Byte, Char],T_B[Boolean, Boolean]), T_A[Boolean]]

val v_a: T_B[(T_B[Byte, Char],T_B[Boolean, Boolean]), T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}