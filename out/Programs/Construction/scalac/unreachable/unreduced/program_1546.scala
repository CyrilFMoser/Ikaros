package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], c: T_B[T_A, Char]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: C, b: C) extends T_B[CC_C, C]
case class CC_E[D](a: CC_C, b: T_B[D, T_A]) extends T_B[D, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B()) => 2 
  case CC_C(CC_C(_)) => 3 
}
}
// This is not matched: CC_C(CC_A(_, _, _))