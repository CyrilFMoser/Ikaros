package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, (Byte,Byte)]]) extends T_A
case class CC_B[C](a: T_B[C, C], b: CC_A) extends T_A
case class CC_C[D, E]() extends T_B[D, T_B[CC_A, T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}