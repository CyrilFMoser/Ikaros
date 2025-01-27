package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_A[T_B[Byte], T_B[Int]]]
case class CC_B[E](a: T_B[T_B[E]], b: Int, c: T_B[E]) extends T_A[E, T_A[T_B[Byte], T_B[Int]]]

val v_a: T_A[Char, T_A[T_B[Byte], T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}