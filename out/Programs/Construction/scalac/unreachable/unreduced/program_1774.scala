package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, T_A[T_A[Int, Byte], T_A[Char, Char]]]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_A[T_A[Int, Byte], T_A[Char, Char]]]

val v_a: T_A[Boolean, T_A[T_A[Int, Byte], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}