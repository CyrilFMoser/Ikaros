package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[(Boolean,Boolean), Byte]], b: T_B[Boolean, T_B[Int, Char]]) extends T_A[T_A[T_A[Char]]]
case class CC_B[E, D](a: T_B[(Int,CC_A), D]) extends T_B[E, D]
case class CC_C[F, G](a: F, b: T_A[F]) extends T_B[G, F]
case class CC_D[H, I](a: I, b: T_B[H, CC_C[I, H]]) extends T_B[H, I]

val v_a: T_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _))) => 1 
  case CC_B(CC_B(CC_D(_, _))) => 2 
  case CC_B(CC_C(_, _)) => 3 
  case CC_B(CC_D(_, _)) => 4 
  case CC_C(_, _) => 5 
  case CC_D(_, CC_B(CC_B(_))) => 6 
  case CC_D(_, CC_B(CC_D(_, _))) => 7 
  case CC_D(_, CC_C(_, _)) => 8 
  case CC_D(_, CC_D(CC_C(_, _), _)) => 9 
}
}
// This is not matched: CC_D(_, CC_B(CC_C(_, _)))