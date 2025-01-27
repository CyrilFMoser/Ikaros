package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_B[Char, T_A]) extends T_A
case class CC_B[C](a: CC_A, b: CC_A, c: CC_A) extends T_B[C, CC_A]
case class CC_C(a: Int) extends T_B[T_B[T_A, CC_A], CC_A]
case class CC_D[D]() extends T_B[D, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)) => 0 
  case CC_D() => 1 
}
}