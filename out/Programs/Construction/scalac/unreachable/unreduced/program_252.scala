package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[E], b: Int) extends T_A[E, D]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C(a: T_A[T_A[Int, Char], T_A[Int, Int]]) extends T_B[T_A[Byte, T_B[Char]]]
case class CC_D[H]() extends T_B[T_A[Byte, T_B[Char]]]

val v_a: T_B[T_A[Byte, T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _)) => 0 
  case CC_C(CC_B()) => 1 
}
}
// This is not matched: CC_D()