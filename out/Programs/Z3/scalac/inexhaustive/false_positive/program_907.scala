package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]]
case class CC_C[D](a: Char, b: T_A[CC_B, D]) extends T_A[D, T_A[D, D]]

val v_a: T_A[CC_B, T_A[CC_B, CC_B]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C('x', _) => 1 
}
}
// This is not matched: Pattern match is empty without constants