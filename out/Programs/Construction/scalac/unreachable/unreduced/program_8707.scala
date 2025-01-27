package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[Byte, Int], T_A[Int, Int]]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[T_A[Byte, Int], T_A[Int, Int]]]
case class CC_C[E]() extends T_A[E, T_A[T_A[Byte, Int], T_A[Int, Int]]]

val v_a: T_A[Int, T_A[T_A[Byte, Int], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}