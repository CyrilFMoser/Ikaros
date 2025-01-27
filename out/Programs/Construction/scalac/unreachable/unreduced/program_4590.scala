package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_B[C, C]) extends T_B[CC_B, C]
case class CC_D[D]() extends T_B[CC_B, D]
case class CC_E[E](a: (((Byte,Byte),CC_B),CC_B), b: Int) extends T_B[CC_B, E]

val v_a: T_B[CC_B, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
  case CC_E(_, _) => 2 
}
}