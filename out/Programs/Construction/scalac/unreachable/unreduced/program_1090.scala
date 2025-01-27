package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char) extends T_A
case class CC_B(a: T_A, b: Boolean) extends T_A
case class CC_C(a: ((T_A,Char),T_A), b: T_B[T_B[CC_B, T_A], CC_B], c: (CC_A,CC_A)) extends T_A
case class CC_D[C](a: C) extends T_B[C, Int]
case class CC_E[D](a: D) extends T_B[D, Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_C(_, _, _), _) => 2 
  case CC_C((_,_), _, _) => 3 
}
}
// This is not matched: CC_B(CC_B(_, _), _)