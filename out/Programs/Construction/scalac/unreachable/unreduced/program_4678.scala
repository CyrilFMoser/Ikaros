package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[T_A[T_B[Char], (Byte,Boolean)], D]
case class CC_B[E](a: Int) extends T_A[E, (T_A[Boolean, Int],T_B[Int])]
case class CC_C[F](a: T_A[F, F], b: CC_B[F]) extends T_B[F]
case class CC_D[G](a: CC_B[G]) extends T_B[G]
case class CC_E[H]() extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_)) => 0 
  case CC_D(CC_B(_)) => 1 
  case CC_E() => 2 
}
}