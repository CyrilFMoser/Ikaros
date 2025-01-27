package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: D) extends T_A[D, T_A[D, D]]
case class CC_B[E, F](a: T_A[F, F]) extends T_A[E, T_A[E, E]]
case class CC_C[G](a: T_B[G], b: T_A[G, T_A[G, G]], c: G) extends T_A[G, T_A[G, G]]
case class CC_D[H](a: (CC_A[Int],T_B[Char]), b: H) extends T_B[H]
case class CC_E() extends T_B[CC_B[T_B[Byte], CC_C[Boolean]]]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_D(_, _), CC_B(_), _) => 0 
  case CC_C(CC_D(_, _), CC_C(CC_D(_, _), CC_A(_, _), _), _) => 1 
  case CC_C(CC_D(_, _), CC_C(CC_D(_, _), CC_B(_), _), _) => 2 
  case CC_C(CC_D(_, _), CC_C(CC_D(_, _), CC_C(_, _, _), _), _) => 3 
}
}
// This is not matched: CC_C(CC_D(_, _), CC_A(_, _), _)