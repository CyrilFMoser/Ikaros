package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: Int) extends T_A
case class CC_B(a: T_B[(Char,T_A), T_B[(Int,Int), T_A]], b: (CC_A,T_A)) extends T_A
case class CC_C(a: T_B[T_B[CC_A, CC_B], CC_A], b: T_B[Byte, Char], c: T_B[CC_A, CC_B]) extends T_A
case class CC_D[C](a: CC_C) extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}