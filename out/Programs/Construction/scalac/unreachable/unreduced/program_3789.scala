package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[T_B[(Boolean,Int)]], T_B[Int]]
case class CC_B[D](a: D, b: T_A[D, D], c: D) extends T_A[T_B[T_B[(Boolean,Int)]], T_B[Int]]
case class CC_C[E](a: T_A[E, E]) extends T_B[E]
case class CC_D[F](a: T_B[F]) extends T_B[F]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_C(_)) => 1 
  case CC_D(CC_D(CC_D(_))) => 2 
}
}
// This is not matched: CC_D(CC_D(CC_C(_)))