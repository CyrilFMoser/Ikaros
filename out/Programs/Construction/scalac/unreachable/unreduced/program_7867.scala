package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[Char, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A, T_B[T_A, T_A]], c: (T_A,T_A)) extends T_A
case class CC_C[C](a: T_A, b: C) extends T_B[CC_A, C]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _) => 0 
  case CC_C(CC_B(_, _, _), _) => 1 
}
}