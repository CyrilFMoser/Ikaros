package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, Byte], T_B[Int, Byte]], b: T_A[T_A[Int]], c: T_B[T_A[Byte], T_A[Boolean]]) extends T_A[T_A[T_B[Char, Boolean]]]
case class CC_B(a: T_B[CC_A, Int], b: Char) extends T_A[T_A[T_B[Char, Boolean]]]
case class CC_C[E, D](a: CC_B) extends T_B[E, D]

val v_a: T_A[T_A[T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}