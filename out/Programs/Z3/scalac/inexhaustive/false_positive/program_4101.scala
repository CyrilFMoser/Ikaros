package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_C[H, I](a: H) extends T_A[I, H]

val v_a: CC_C[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_C T_B)