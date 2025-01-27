package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Int) extends T_A[D, T_B[Int]]
case class CC_C() extends T_A[Boolean, Boolean]

val v_a: T_A[CC_C, T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants