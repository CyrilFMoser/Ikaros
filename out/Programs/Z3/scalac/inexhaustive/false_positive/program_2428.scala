package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Byte], b: T_A[Char]) extends T_A[T_A[Int]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D]() extends T_B[D]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants