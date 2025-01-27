package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Int, b: ((Char,Boolean),T_B[Char, Int])) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_A[F, T_A[F, F]], b: (T_A[Char, Boolean],CC_A[Byte])) extends T_A[F, T_A[F, F]]
case class CC_C[G](a: G) extends T_B[Boolean, G]
case class CC_D[H, I](a: T_B[I, H]) extends T_B[H, I]
case class CC_E[J](a: T_A[J, J], b: T_B[Boolean, J]) extends T_B[Boolean, J]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, (_,CC_A(_, _))) => 1 
}
}