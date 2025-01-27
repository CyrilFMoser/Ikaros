package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Char, T_B[(Boolean,Boolean), T_A]]) extends T_A
case class CC_B(a: Boolean) extends T_A
case class CC_C[C](a: T_A, b: CC_A) extends T_B[T_B[Boolean, T_B[T_A, CC_B]], C]
case class CC_D[D](a: T_B[D, D]) extends T_B[T_B[Boolean, T_B[T_A, CC_B]], D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_A(CC_B(_), _)