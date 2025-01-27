package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Boolean, T_A]) extends T_A
case class CC_B(a: Int, b: Char, c: T_A) extends T_A
case class CC_C[C](a: T_B[C, C], b: CC_A) extends T_B[C, T_A]
case class CC_D[D](a: D) extends T_B[D, T_A]

val v_a: T_B[T_A, T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(CC_C(_, _))) => 1 
  case CC_D(CC_B(_, _, _)) => 2 
}
}
// This is not matched: CC_D(CC_A(CC_D(_)))