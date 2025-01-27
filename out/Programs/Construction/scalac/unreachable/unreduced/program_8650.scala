package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C], c: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_B[D], b: T_B[D]) extends T_A[D]
case class CC_C[E](a: T_A[E]) extends T_A[E]
case class CC_D(a: T_A[T_B[Byte]]) extends T_B[T_B[CC_B[Boolean]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}