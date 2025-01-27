package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: T_A[D], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_C[F]() extends T_A[F]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Int Wildcard (CC_C Int Wildcard Char (T_A Int)) Wildcard (T_A Int))