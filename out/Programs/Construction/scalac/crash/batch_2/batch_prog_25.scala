package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_A[C, D], b: T_A[T_B, C], c: T_A[D, C]) extends T_A[C, D]

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(CC_A(_, _, _), _, _)) => 0 
}
}