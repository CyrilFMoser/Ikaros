package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[(T_A[Boolean, Int],T_A[Byte, Char]), C]
case class CC_B[D](a: (Char,(Byte,Boolean)), b: CC_A[D], c: D) extends T_A[(T_A[Boolean, Int],T_A[Byte, Char]), D]
case class CC_C[E](a: CC_A[E], b: (CC_A[Byte],T_A[Byte, Int]), c: Int) extends T_A[E, CC_B[CC_B[Boolean]]]

val v_a: T_A[(T_A[Boolean, Int],T_A[Byte, Char]), Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,(_,_)), _, 12) => 1 
  case CC_B((_,(_,_)), _, _) => 2 
}
}