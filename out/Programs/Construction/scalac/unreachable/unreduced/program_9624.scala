package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Int, b: T_B[T_B[T_A, (Char,Byte)], CC_A]) extends T_A
case class CC_C(a: T_B[CC_B, CC_A], b: T_B[CC_B, (CC_B,T_A)], c: T_A) extends T_A
case class CC_D[C](a: T_A) extends T_B[CC_C, C]
case class CC_E[D](a: T_B[CC_C, D]) extends T_B[CC_C, D]
case class CC_F[E]() extends T_B[CC_C, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}