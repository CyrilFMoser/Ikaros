package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_A[T_B[Char, Byte]]) extends T_A[T_A[Int]]
case class CC_B() extends T_A[T_A[Int]]
case class CC_C[E, D](a: CC_B, b: T_A[T_A[Int]]) extends T_B[E, D]
case class CC_D[F, G]() extends T_B[F, G]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}