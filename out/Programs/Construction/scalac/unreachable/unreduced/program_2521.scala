package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Int], T_A[Byte, Int]]]
case class CC_B[D, E](a: CC_A[E]) extends T_A[D, T_A[T_A[Int, Int], T_A[Byte, Int]]]

val v_a: T_A[Int, T_A[T_A[Int, Int], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}