package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_B, C]
case class CC_B(a: T_A[T_A[T_B, Boolean], Char], b: T_A[T_A[T_B, Char], CC_A[T_B]]) extends T_B
case class CC_C(a: CC_A[T_B]) extends T_B
case class CC_D(a: CC_B) extends T_B

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _)) => 0 
  case CC_A(CC_C(_)) => 1 
  case CC_A(CC_D(CC_B(_, _))) => 2 
}
}