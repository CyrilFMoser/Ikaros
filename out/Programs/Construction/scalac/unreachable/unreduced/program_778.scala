package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: C, b: Char) extends T_B[C, T_A]
case class CC_C[D](a: T_B[D, D], b: T_B[D, T_A], c: T_B[D, T_A]) extends T_B[D, T_A]

val v_a: T_B[Int, T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_B(_, _), _) => 1 
}
}
// This is not matched: CC_C(_, CC_C(_, _, _), _)