package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D]) extends T_A[D, T_A[(Boolean,Int), T_A[Boolean, Byte]]]
case class CC_B[E](a: Char) extends T_B[CC_A[T_B[Int]]]
case class CC_C[F](a: F) extends T_B[F]
case class CC_D(a: Int, b: CC_B[T_B[Int]]) extends T_B[CC_A[T_B[Int]]]

val v_a: T_B[CC_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_C(_))) => 0 
  case CC_D(_, CC_B(_)) => 1 
}
}
// This is not matched: CC_B(_)