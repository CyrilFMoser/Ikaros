package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[(Int,Char)]]
case class CC_B() extends T_A[T_A[(Int,Char)]]
case class CC_C(a: Int) extends T_A[T_B[CC_B, (Int,Int)]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B Wildcard (CC_C (CC_B Wildcard Wildcard Wildcard T_B) T_B) Char T_B)