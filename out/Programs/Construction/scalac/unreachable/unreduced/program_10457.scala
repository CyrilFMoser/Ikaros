package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, T_B[T_B[Int]]]
case class CC_B(a: Char) extends T_A[T_B[T_B[Int]], T_B[CC_A[Int]]]
case class CC_C[E](a: E, b: CC_A[E], c: E) extends T_B[E]
case class CC_D[F](a: T_B[T_A[F, CC_B]], b: CC_C[(Boolean,CC_B)]) extends T_B[F]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_C(_, _, _), CC_C((_,_), CC_A(_), (_,_))) => 1 
}
}
// This is not matched: CC_D(CC_D(_, _), CC_C((_,_), CC_A(_), (_,_)))