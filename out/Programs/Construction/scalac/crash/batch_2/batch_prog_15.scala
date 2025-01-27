package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: Byte, c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D, E](a: D) extends T_A[E, D]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}