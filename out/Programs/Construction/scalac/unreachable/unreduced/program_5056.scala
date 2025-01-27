package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: Boolean, c: D) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E], c: T_B[Byte, E]) extends T_B[Byte, E]
case class CC_C[F](a: T_B[F, Char], b: F) extends T_B[Byte, F]
case class CC_D(a: T_B[Byte, CC_A[Byte]], b: CC_A[T_B[Byte, Boolean]]) extends T_B[(CC_B[Int],CC_C[Int]), CC_C[T_A[Char]]]

val v_a: T_B[(CC_B[Int],CC_C[Int]), CC_C[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_A(_, _, _), _, _), CC_A(_, _, CC_B(_, _, _))) => 0 
  case CC_D(CC_B(CC_A(_, _, _), _, _), CC_A(_, _, CC_C(_, _))) => 1 
  case CC_D(CC_C(_, CC_A(_, _, _)), CC_A(_, _, CC_B(_, _, _))) => 2 
}
}
// This is not matched: CC_D(CC_C(_, CC_A(_, _, _)), CC_A(_, _, CC_C(_, _)))