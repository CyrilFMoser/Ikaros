package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[Char]]
case class CC_B(a: Char, b: T_A[T_B[Int, CC_A]], c: CC_A) extends T_A[T_A[Char]]
case class CC_C[E, D](a: D, b: CC_A) extends T_B[E, D]
case class CC_D[F, G](a: T_A[T_A[Char]], b: F, c: T_B[CC_A, G]) extends T_B[G, F]

val v_a: T_B[Int, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, CC_B(_, _, CC_A()), CC_C(_, CC_A())) => 1 
}
}
// This is not matched: CC_D(_, CC_B(_, _, CC_A()), CC_D(_, _, _))