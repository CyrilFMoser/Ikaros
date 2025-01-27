package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Int) extends T_A[C, T_A[Boolean, Int]]

val v_a: T_A[CC_A[Int], T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants