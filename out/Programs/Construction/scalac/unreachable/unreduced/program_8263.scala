package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, T_B[Byte, (Char,Byte)]], b: Byte, c: (T_A[(Byte,Byte)],T_B[Boolean, Boolean])) extends T_A[((Int,Int),T_B[Byte, Boolean])]
case class CC_B() extends T_A[((Int,Int),T_B[Byte, Boolean])]
case class CC_C[D](a: ((CC_B,CC_A),Boolean), b: CC_B) extends T_B[D, T_B[(CC_A,CC_A), T_B[Int, CC_B]]]
case class CC_D[F, E](a: E) extends T_B[F, E]
case class CC_E[G, H](a: H) extends T_B[H, G]

val v_a: T_A[((Int,Int),T_B[Byte, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,CC_E(_))) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(_, _, (_,CC_D(_)))