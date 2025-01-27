package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_A, b: T_B[C, Int]) extends T_B[C, T_A]
case class CC_D[D](a: T_B[D, T_A]) extends T_B[D, T_A]

val v_a: CC_D[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _)) => 0 
  case CC_D(CC_D(CC_D(_))) => 1 
}
}
// This is not matched: CC_D(CC_D(CC_C(_, _)))