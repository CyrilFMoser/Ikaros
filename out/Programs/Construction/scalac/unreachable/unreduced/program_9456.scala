package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]], b: Char) extends T_A[T_B[Char]]
case class CC_B() extends T_A[T_B[Char]]
case class CC_C(a: Int, b: Boolean) extends T_A[T_B[Char]]
case class CC_D[C]() extends T_B[C]
case class CC_E[D](a: CC_A, b: CC_B, c: CC_D[D]) extends T_B[D]

val v_a: T_A[T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}