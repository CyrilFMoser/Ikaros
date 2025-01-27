package Program_30 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C) extends T_A[C]
case class CC_B(a: T_A[Boolean], b: CC_A[Int]) extends T_A[T_A[Int]]
case class CC_C[D, E]() extends T_A[D]
case class CC_D[F](a: T_A[F], b: (CC_B,Boolean), c: CC_A[F]) extends T_B[F]
case class CC_E[G]() extends T_B[G]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: (CC_C Char Boolean (T_A Char))
// This is not matched: Pattern match is empty without constants