package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char) extends T_A
case class CC_B(a: T_A, b: T_B[(T_A,T_A), T_B[CC_A, T_A]], c: (Char,T_B[T_A, CC_A])) extends T_A
case class CC_C(a: Char, b: Boolean) extends T_A
case class CC_D[C](a: T_A, b: T_B[C, C], c: CC_C) extends T_B[T_B[(T_A,CC_A), CC_B], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
  case CC_A(_) => 1 
  case CC_B(CC_A(_), _, (_,_)) => 2 
  case CC_B(CC_B(_, _, _), _, (_,_)) => 3 
  case CC_B(CC_C(_, _), _, (_,_)) => 4 
  case CC_C(_, _) => 5 
}
}