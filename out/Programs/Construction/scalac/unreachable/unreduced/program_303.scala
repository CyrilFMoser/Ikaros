package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Boolean, c: T_B[D]) extends T_A[D, T_A[T_A[Byte, Int], T_A[Int, Byte]]]
case class CC_B[E]() extends T_A[E, T_A[T_A[Byte, Int], T_A[Int, Byte]]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Int], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, true, _) => 0 
  case CC_A(_, false, _) => 1 
  case CC_B() => 2 
}
}