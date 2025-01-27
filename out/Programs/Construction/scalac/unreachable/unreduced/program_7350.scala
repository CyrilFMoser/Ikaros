package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[(T_A,T_A), T_B[T_A, T_A]], c: T_B[T_A, T_A]) extends T_A
case class CC_B(a: Char, b: (T_B[T_A, CC_A],CC_A), c: Boolean) extends T_A
case class CC_C[C](a: T_B[C, C], b: T_B[C, T_A], c: T_A) extends T_B[C, CC_A]
case class CC_D[D](a: T_A) extends T_B[D, CC_A]
case class CC_E[E](a: Byte) extends T_B[E, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_C(_, _, CC_A(CC_B(_, _, _), _, _)) => 1 
  case CC_C(_, _, CC_B(_, (_,_), true)) => 2 
  case CC_C(_, _, CC_B(_, (_,_), false)) => 3 
  case CC_D(CC_A(_, _, _)) => 4 
  case CC_E(_) => 5 
}
}
// This is not matched: CC_D(CC_B(_, _, _))