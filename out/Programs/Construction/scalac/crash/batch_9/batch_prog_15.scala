package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[B](a: T_B[B]) extends T_B[B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_C(_)), CC_A(_, _)) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(CC_C(CC_C(_)), CC_B())