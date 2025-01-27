package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int]) extends T_A[C, Int]
case class CC_B[D]() extends T_A[D, Int]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants