package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[T_B[Boolean, CC_A], Boolean]) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[C](a: C, b: T_B[C, C]) extends T_B[C, T_A]
case class CC_E(a: Boolean, b: Byte, c: T_B[T_B[CC_A, Byte], CC_A]) extends T_B[T_B[Int, T_A], T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_C(_), _) => 3 
}
}
// This is not matched: CC_C(_)