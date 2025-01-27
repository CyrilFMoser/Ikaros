package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: Byte, c: D) extends T_A[D]
case class CC_B[E, F](a: T_B[E, F], b: Boolean, c: T_A[F]) extends T_A[E]
case class CC_C[G](a: T_A[G], b: T_A[CC_B[G, G]], c: Byte) extends T_A[G]
case class CC_D(a: T_A[T_A[Boolean]], b: T_A[Boolean], c: CC_B[T_A[Char], CC_B[Char, Char]]) extends T_B[T_B[T_A[Boolean], T_A[Int]], CC_C[Byte]]
case class CC_E() extends T_B[T_B[T_A[Boolean], T_A[Int]], CC_C[Byte]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, CC_A(_, _, _), _) => 1 
  case CC_C(_, CC_B(_, _, _), _) => 2 
  case CC_C(_, CC_C(_, _, _), _) => 3 
}
}
// This is not matched: CC_A(_, _, _)