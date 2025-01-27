package Program_12 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_A[Char], b: T_A[Boolean]) extends T_A[Byte]
case class CC_C(a: CC_B, b: T_A[Boolean], c: T_A[Byte]) extends T_A[Byte]
case class CC_D[D](a: CC_B, b: CC_B, c: Int) extends T_B[T_A[CC_C]]

val v_a: T_B[T_A[CC_C]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, 12) => 0 
  case CC_D(CC_B(_, _), _, _) => 1 
}
}
// This is not matched: (CC_D Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (T_A (CC_C Boolean Boolean Boolean Boolean))))
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)