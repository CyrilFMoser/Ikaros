package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[T_B]], b: Int, c: T_A[T_A[Char]]) extends T_A[T_A[T_B]]
case class CC_C(a: CC_A) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, _) => 1 
}
}
// This is not matched: CC_B(CC_B(_, _, _), _, _)