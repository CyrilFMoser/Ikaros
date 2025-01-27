package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_B[E](a: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_C[F](a: T_B[F], b: T_A[T_A[F, F], F], c: F) extends T_B[F]
case class CC_D(a: CC_A[CC_C[Boolean]], b: T_B[CC_C[Char]]) extends T_B[CC_A[CC_A[Char]]]
case class CC_E(a: T_B[Byte], b: T_A[T_A[CC_D, CC_D], CC_D], c: Int) extends T_B[CC_A[CC_A[Char]]]

val v_a: T_B[CC_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, _), CC_A(_, _), _) => 0 
  case CC_C(CC_D(_, _), CC_A(_, _), _) => 1 
  case CC_C(CC_E(_, _, _), CC_A(_, _), _) => 2 
  case CC_C(CC_C(_, _, _), CC_B(_), _) => 3 
  case CC_C(CC_D(_, _), CC_B(_), _) => 4 
  case CC_C(CC_E(_, _, _), CC_B(_), _) => 5 
  case CC_D(CC_A(_, _), _) => 6 
  case CC_E(CC_C(_, _, _), CC_A(_, _), _) => 7 
  case CC_E(CC_C(_, _, _), CC_B(_), _) => 8 
}
}