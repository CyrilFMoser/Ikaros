package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: T_A[D, D], c: T_A[D, D]) extends T_A[D, T_B[D]]
case class CC_B[E](a: E, b: (T_A[Int, Byte],CC_A[Boolean]), c: T_B[T_B[E]]) extends T_A[E, T_B[E]]
case class CC_C[F](a: T_A[F, T_B[F]], b: CC_B[F], c: Char) extends T_B[F]
case class CC_D[G](a: T_A[G, T_B[G]], b: (CC_A[Int],T_B[Byte])) extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), CC_B(_, _, _), _) => 0 
  case CC_C(CC_B(_, _, _), CC_B(_, _, _), _) => 1 
  case CC_D(CC_B(_, _, _), _) => 2 
}
}
// This is not matched: CC_D(CC_A(_, _, _), _)