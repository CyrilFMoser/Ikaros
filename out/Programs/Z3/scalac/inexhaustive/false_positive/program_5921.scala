package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int) extends T_A[T_A[Boolean, Char], T_A[Char, Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_D T_B (CC_C T_B) T_B)