package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: (T_B[T_A, CC_A],CC_A), b: CC_A, c: Char) extends T_B[C, T_A]
case class CC_C[D](a: Boolean, b: CC_B[D]) extends T_B[D, T_A]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A()), _, _) => 0 
  case CC_C(_, _) => 1 
}
}