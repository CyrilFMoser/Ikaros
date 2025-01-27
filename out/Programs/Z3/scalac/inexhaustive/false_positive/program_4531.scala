package Program_15 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G](a: Int) extends T_A[F, E]
case class CC_B[H, I](a: (Byte,Byte)) extends T_B[I, H]
case class CC_C[J, K](a: T_B[J, K], b: T_B[J, J]) extends T_B[J, K]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(12) => 1 
}
}
// This is not matched: (CC_A Int Int Boolean Wildcard (T_A Int Int))
// This is not matched: Pattern match is empty without constants