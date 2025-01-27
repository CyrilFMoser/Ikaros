package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Boolean, Int], b: Boolean) extends T_A
case class CC_B[C](a: T_B[C, C], b: T_A, c: Byte) extends T_B[C, CC_A]
case class CC_C[D](a: T_B[D, D], b: T_B[T_B[D, CC_A], D]) extends T_B[D, CC_A]
case class CC_D[E]() extends T_B[E, CC_A]

val v_a: T_B[Byte, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), _) => 0 
  case CC_C(_, _) => 1 
  case CC_D() => 2 
}
}