package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(Int,T_A), T_B[T_A, T_A]], b: T_A, c: Char) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: T_A, b: CC_B) extends T_A
case class CC_D[C](a: CC_A, b: Int) extends T_B[(Boolean,CC_A), C]
case class CC_E[D](a: D, b: T_A, c: T_B[D, D]) extends T_B[D, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, 'x') => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_) => 2 
  case CC_C(CC_A(_, _, _), CC_B(CC_A(_, _, _))) => 3 
  case CC_C(CC_B(_), CC_B(CC_A(_, _, _))) => 4 
  case CC_C(CC_C(CC_A(_, _, _), CC_B(_)), CC_B(CC_A(_, _, _))) => 5 
  case CC_C(CC_C(CC_B(_), CC_B(_)), CC_B(CC_A(_, _, _))) => 6 
  case CC_C(CC_C(CC_C(_, _), CC_B(_)), CC_B(CC_A(_, _, _))) => 7 
}
}