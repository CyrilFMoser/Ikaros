package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Byte, C], b: (Char,Int)) extends T_A[(T_A[Boolean, Char],T_A[Byte, Char]), C]
case class CC_B[D](a: D, b: Boolean) extends T_A[(T_A[Boolean, Char],T_A[Byte, Char]), D]

val v_a: T_A[(T_A[Boolean, Char],T_A[Byte, Char]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}