package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: ((Boolean,Boolean),Int)) extends T_A[C, D]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_D (CC_E T_B) T_B)