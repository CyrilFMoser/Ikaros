package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[D], D]) extends T_A[T_B[D], D]
case class CC_B[E](a: E, b: T_B[E]) extends T_A[T_B[E], E]
case class CC_C(a: (CC_A[Int],CC_A[Byte]), b: Byte, c: T_A[T_B[Byte], Byte]) extends T_B[CC_B[Boolean]]

val v_a: CC_A[T_B[CC_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(CC_C(_, _, _), _)) => 1 
}
}