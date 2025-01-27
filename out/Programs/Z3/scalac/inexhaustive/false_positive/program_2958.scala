package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: ((Boolean,Char),Int), b: T_A[E, E]) extends T_A[E, Byte]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,12), _) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_A (T_A Int)))