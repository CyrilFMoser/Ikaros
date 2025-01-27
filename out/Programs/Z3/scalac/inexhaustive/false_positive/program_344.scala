package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,(Int,Boolean)), b: T_A[C, C]) extends T_A[(Boolean,(Int,Int)), C]

val v_a: T_A[(Boolean,(Int,Int)), Int] = null
val v_b: Int = v_a match{
  case CC_A(('x',_), _) => 0 
}
}
// This is not matched: (CC_E Wildcard (T_B (Tuple Byte Int) Boolean))