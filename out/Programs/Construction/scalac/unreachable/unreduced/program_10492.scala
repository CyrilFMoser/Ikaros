package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_B[C, C], b: (CC_A,T_B[CC_B, (Byte,Byte)])) extends T_B[CC_B, C]
case class CC_D[D](a: CC_B, b: CC_A) extends T_B[CC_B, D]
case class CC_E[E](a: Int, b: CC_A, c: Byte) extends T_B[CC_B, E]

val v_a: T_B[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_C(_, (CC_A(_),CC_C(_, _))) => 0 
  case CC_C(_, (CC_A(_),CC_D(_, _))) => 1 
  case CC_C(_, (CC_A(_),CC_E(_, _, _))) => 2 
  case CC_D(CC_B(), CC_A(_)) => 3 
  case CC_E(_, _, _) => 4 
}
}