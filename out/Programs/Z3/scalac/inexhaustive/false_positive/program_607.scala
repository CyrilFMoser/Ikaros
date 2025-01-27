package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Char, C], b: T_A[C, Int]) extends T_A[Char, C]
case class CC_B[D]() extends T_A[Char, D]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
}
}
// This is not matched: (CC_B (T_A Boolean))