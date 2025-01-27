package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Char, Boolean]) extends T_A
case class CC_B(a: T_A, b: T_B[CC_A, T_A], c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C) extends T_B[CC_C, C]
case class CC_E[D](a: (T_B[CC_C, T_A],CC_C)) extends T_B[CC_C, D]

val v_a: T_B[CC_C, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_)) => 0 
  case CC_E((_,_)) => 1 
}
}