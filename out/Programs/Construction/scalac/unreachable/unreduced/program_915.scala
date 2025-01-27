package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char) extends T_A[C, Char]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: CC_A[(T_B,T_B)], b: T_A[T_B, Char], c: T_A[T_A[T_B, T_B], CC_B]) extends T_B
case class CC_D(a: T_B, b: CC_B, c: CC_A[CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_), CC_A(_), _) => 1 
  case CC_D(CC_C(_, _, _), _, _) => 2 
  case CC_D(CC_D(_, _, _), _, _) => 3 
}
}
// This is not matched: CC_D(CC_B(_), _, _)