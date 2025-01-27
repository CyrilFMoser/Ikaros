package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[T_B, D], b: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B(a: T_A[Char, T_B]) extends T_A[T_B, T_B]
case class CC_C(a: Char) extends T_A[T_B, T_B]
case class CC_D(a: T_A[T_B, T_B], b: CC_B, c: Char) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_)) => 1 
  case CC_A(_, CC_C(_)) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: CC_C(_)