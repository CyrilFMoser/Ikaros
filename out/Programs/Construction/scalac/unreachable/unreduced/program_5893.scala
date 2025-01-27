package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: D) extends T_A[T_B[Char], D]
case class CC_B() extends T_A[T_B[Char], T_A[T_B[Char], CC_A[Int]]]
case class CC_C[E](a: T_B[E]) extends T_A[T_B[Char], E]
case class CC_D[F](a: F, b: F, c: CC_A[F]) extends T_B[F]
case class CC_E() extends T_B[CC_D[T_B[CC_B]]]
case class CC_F() extends T_B[CC_D[T_B[CC_B]]]

val v_a: T_A[T_B[Char], T_A[T_B[Char], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_D(CC_A(_, _, _), CC_A(_, _, _), _)) => 2 
  case CC_C(CC_D(CC_C(_), CC_A(_, _, _), _)) => 3 
  case CC_C(CC_D(CC_C(_), CC_C(_), _)) => 4 
}
}
// This is not matched: CC_C(CC_D(CC_A(_, _, _), CC_C(_), _))