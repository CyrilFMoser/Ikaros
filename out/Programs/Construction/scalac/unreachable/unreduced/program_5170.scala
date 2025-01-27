package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: T_A[T_A[Char]], c: T_A[(Boolean,Int)]) extends T_A[Boolean]
case class CC_B(a: T_A[Boolean], b: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_C(a: Char, b: CC_B, c: CC_B) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C('x', _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}
// This is not matched: CC_B(_, _)