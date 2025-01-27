package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_A[T_A[Boolean, Byte], T_A[Byte, Int]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Boolean, Byte], T_A[Byte, Int]]]
case class CC_C[E](a: Boolean, b: CC_B[CC_B[E]]) extends T_A[E, T_A[T_A[Boolean, Byte], T_A[Byte, Int]]]

val v_a: T_A[Int, T_A[T_A[Boolean, Byte], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_B()) => 2 
}
}