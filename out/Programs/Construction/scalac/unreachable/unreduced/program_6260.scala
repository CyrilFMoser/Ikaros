package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Int]) extends T_A[Int]
case class CC_B[E, D](a: T_A[E], b: CC_A) extends T_B[E, D]
case class CC_C[F, G](a: T_A[Int], b: (T_A[Int],CC_A)) extends T_B[G, F]
case class CC_D[H](a: CC_B[H, H], b: Boolean) extends T_B[T_B[Char, T_A[Int]], H]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(CC_A(_))) => 0 
  case CC_C(_, _) => 1 
}
}