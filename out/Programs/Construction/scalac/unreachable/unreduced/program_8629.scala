package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[T_B[T_A[D, D]], D]
case class CC_B(a: Boolean, b: CC_A[CC_A[Boolean]], c: Byte) extends T_A[T_B[T_A[T_B[T_A[(Boolean,Boolean), Int]], T_B[T_A[(Boolean,Boolean), Int]]]], T_B[T_A[(Boolean,Boolean), Int]]]
case class CC_C[F, E](a: T_B[E], b: T_A[F, F]) extends T_A[E, F]
case class CC_D[G](a: G) extends T_B[CC_A[CC_A[CC_B]]]

val v_a: T_A[T_B[T_A[T_B[T_A[(Boolean,Boolean), Int]], T_B[T_A[(Boolean,Boolean), Int]]]], T_B[T_A[(Boolean,Boolean), Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, CC_C(_, _)) => 1 
}
}
// This is not matched: CC_A(_)