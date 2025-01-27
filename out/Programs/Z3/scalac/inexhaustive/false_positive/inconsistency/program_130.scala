package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[T_A[Int, Char], D]

val v_a: T_A[T_A[Int, Char], Byte] = null
val v_b: Int = v_a match{
  case CC_B(0, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants