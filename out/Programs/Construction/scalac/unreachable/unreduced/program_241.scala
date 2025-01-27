package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], T_A[T_A[Byte, Byte], T_A[Byte, Byte]]], T_A[T_A[Byte, Byte], T_A[Byte, Byte]]], b: C) extends T_A[T_A[C, C], C]
case class CC_B[E, F](a: (T_A[Char, Int],Int), b: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), true) => 0 
  case CC_A(CC_B(_, _), true) => 1 
  case CC_A(CC_A(_, _), false) => 2 
  case CC_A(CC_B(_, _), false) => 3 
}
}