package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: T_A[D, D], b: Int) extends T_A[T_A[Byte, Byte], D]

val v_a: T_A[T_A[Byte, Byte], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_B Char Wildcard (T_A Char))