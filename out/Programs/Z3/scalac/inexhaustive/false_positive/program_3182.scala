package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_C[F](a: (Char,Boolean)) extends T_B[F, T_A[Char]]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(('x',_)) => 0 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard Wildcard (T_A Char T_B))