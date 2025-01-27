package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Byte,Int), T_A], T_A], b: T_B[T_A, T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: CC_B, b: Char) extends T_A
case class CC_D[D]() extends T_B[D, Char]
case class CC_E[E](a: E, b: T_B[E, Char]) extends T_B[E, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B(), _) => 2 
}
}