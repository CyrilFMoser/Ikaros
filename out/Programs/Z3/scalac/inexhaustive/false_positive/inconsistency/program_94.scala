package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: T_A[D, D], b: Byte) extends T_A[T_A[Char, Byte], D]

val v_a: T_A[T_A[Char, Byte], Int] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
}
}
// This is not matched: (CC_A (T_A Byte) Wildcard (T_A (T_A Byte)))