package Program_30 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int, b: Int, c: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_A[Int], b: D) extends T_A[D]
case class CC_C[E](a: E) extends T_B[CC_A[(Byte,Boolean)]]
case class CC_D[F](a: T_B[F], b: CC_A[F], c: T_B[Int]) extends T_B[CC_A[(Byte,Boolean)]]

val v_a: T_B[CC_A[(Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, CC_A(_, _, _), _) => 1 
  case CC_D(CC_D(_, _, _), CC_A(_, _, _), _) => 2 
  case CC_D(CC_D(_, _, _), _, _) => 3 
}
}
// This is not matched: (CC_D (CC_A Boolean Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_A (Tuple Byte Boolean) Boolean Boolean Boolean Boolean)))
// This is not matched: (CC_B Int Wildcard (T_A Int))