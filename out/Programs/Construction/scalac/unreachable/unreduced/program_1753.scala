package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_A], b: T_B[T_A, Char]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: T_A) extends T_A
case class CC_C[C](a: C, b: Boolean, c: T_B[C, CC_B]) extends T_B[C, CC_B]
case class CC_D[D](a: T_A, b: T_A, c: Boolean) extends T_B[D, CC_B]

val v_a: T_B[CC_A, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _, _) => 0 
  case CC_D(_, _, _) => 1 
}
}