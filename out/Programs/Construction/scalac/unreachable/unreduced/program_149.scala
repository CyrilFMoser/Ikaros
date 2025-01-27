package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: D) extends T_A[D, T_A[Int, T_B[Char]]]
case class CC_B[E](a: T_B[E], b: CC_A[E]) extends T_A[E, T_A[Int, T_B[Char]]]
case class CC_C[F](a: F) extends T_A[F, T_A[Int, T_B[Char]]]
case class CC_D[G](a: T_B[T_A[T_A[Int, Char], T_A[Int, Char]]], b: G) extends T_B[G]

val v_a: T_A[Byte, T_A[Int, T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _), 0) => 0 
  case CC_B(CC_D(_, _), _) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_, CC_D(_, _), _)