package Program_63 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[Char]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A]]) extends T_A[Char]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_, _)), _) => 0 
}
}
// This is not matched: CC_B()