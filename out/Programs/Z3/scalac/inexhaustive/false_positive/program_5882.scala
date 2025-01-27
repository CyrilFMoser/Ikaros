package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Int) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants