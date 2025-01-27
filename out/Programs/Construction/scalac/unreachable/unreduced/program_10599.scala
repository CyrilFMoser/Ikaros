package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[Char, T_A], T_A], c: ((T_A,T_A),(T_A,Char))) extends T_A
case class CC_B[C](a: (Boolean,T_A), b: T_A, c: C) extends T_A
case class CC_C(a: T_A, b: CC_B[CC_A], c: Boolean) extends T_A
case class CC_D[D](a: CC_C) extends T_B[D, CC_A]
case class CC_E[E](a: E, b: T_B[E, E]) extends T_B[E, T_B[E, E]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), _, _) => 0 
  case CC_C(CC_B(_, _, _), _, _) => 1 
  case CC_C(CC_C(_, _, _), _, _) => 2 
}
}