package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B) extends T_A[D, C]
case class CC_B() extends T_B
case class CC_C(a: T_A[CC_A[CC_B, (Char,Char)], CC_A[T_B, Char]]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_C(_))) => 0 
}
}
// This is not matched: CC_B(CC_A(CC_A(_)))