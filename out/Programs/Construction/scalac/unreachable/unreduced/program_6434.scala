package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, T_A]) extends T_A
case class CC_B(a: T_A, b: Char, c: T_B[Boolean, Char]) extends T_A
case class CC_C(a: T_B[T_B[T_A, T_A], Byte], b: CC_A) extends T_A
case class CC_D[C](a: CC_C, b: T_A, c: CC_A) extends T_B[T_A, C]
case class CC_E(a: Char) extends T_B[T_A, CC_A]

val v_a: T_B[T_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A(_)) => 0 
  case CC_E(_) => 1 
}
}