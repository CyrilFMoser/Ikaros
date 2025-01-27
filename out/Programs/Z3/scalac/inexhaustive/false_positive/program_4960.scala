package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, D](a: (Boolean,Int)) extends T_A[D, E]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_A (T_A Int Byte))