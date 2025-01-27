package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_B[T_B[T_A, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_B[T_B[CC_A, T_A], (CC_A,CC_A)]) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[C](a: T_B[C, C], b: (T_A,CC_B)) extends T_B[C, CC_C]
case class CC_E[D](a: (T_B[CC_B, CC_C],Char)) extends T_B[D, CC_C]

val v_a: T_B[T_A, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_) => 1 
}
}