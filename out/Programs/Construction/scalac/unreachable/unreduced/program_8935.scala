package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, C]) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D](a: D) extends T_A[D, T_A[T_A[D, D], D]]
case class CC_C[E](a: CC_A[E], b: CC_A[E], c: CC_A[E]) extends T_A[E, CC_A[E]]

val v_a: T_A[Int, T_A[T_A[Int, Int], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}