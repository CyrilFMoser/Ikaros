package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: T_A[D]) extends T_A[D]
case class CC_B(a: CC_A[(Int,Boolean)], b: T_A[CC_A[Byte]], c: T_A[CC_A[Char]]) extends T_A[(T_A[Int],(Boolean,Char))]
case class CC_C(a: T_A[T_A[CC_B]], b: T_A[T_B[(Boolean,Boolean), CC_B]]) extends T_A[(T_A[Int],(Boolean,Char))]
case class CC_D[E](a: T_B[E, E], b: CC_C) extends T_B[E, Boolean]
case class CC_E[F](a: T_B[F, Boolean], b: F) extends T_B[F, Boolean]
case class CC_F(a: Byte, b: T_B[CC_C, Boolean], c: Int) extends T_B[Byte, Boolean]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_, _)) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_F(_, _, _)