package Program_29 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Int,Byte)) extends T_A[C]
case class CC_B(a: T_B[Int], b: T_B[Boolean]) extends T_B[Byte]
case class CC_C[D](a: Int, b: T_B[Byte], c: T_B[Boolean]) extends T_B[Boolean]
case class CC_D(a: T_A[CC_B]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_)) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: (CC_C Boolean Wildcard Wildcard (CC_D Wildcard (T_B Boolean)) (T_B Boolean))
// This is not matched: (CC_B Wildcard T_A)