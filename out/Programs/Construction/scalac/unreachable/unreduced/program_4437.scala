package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Char], T_A[Byte, Byte]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Int, Char], T_A[Byte, Byte]]]
case class CC_C[E](a: T_A[E, E], b: T_A[E, E]) extends T_A[E, T_A[T_A[Int, Char], T_A[Byte, Byte]]]

val v_a: T_A[Int, T_A[T_A[Int, Char], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}