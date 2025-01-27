package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[Boolean, Char], T_A[Int, Byte]]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[T_A[Boolean, Char], T_A[Int, Byte]]]
case class CC_C[E]() extends T_A[E, CC_A[T_A[Boolean, Boolean]]]

val v_a: T_A[Int, T_A[T_A[Boolean, Char], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}