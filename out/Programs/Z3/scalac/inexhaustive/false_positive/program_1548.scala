package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B(a: T_B[Byte], b: Byte) extends T_B[T_A[Int]]

val v_a: T_B[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
}
}
// This is not matched: Pattern match is empty without constants