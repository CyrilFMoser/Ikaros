package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: Byte, c: T_A[C, C]) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Char]], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D]) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Char]], T_A[CC_A[Boolean], T_A[Int, Int]]]
case class CC_C[E]() extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Char]], E]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Boolean, Char]], T_A[CC_A[Boolean], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C() => 3 
}
}