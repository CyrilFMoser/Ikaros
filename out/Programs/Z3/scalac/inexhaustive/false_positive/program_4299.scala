package Program_14 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: C, b: Int) extends T_A[B]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: T_A[Boolean], b: T_A[Char], c: T_A[Boolean]) extends T_A[CC_B[Int]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
  case CC_B() => 2 
}
}
// This is not matched: (CC_A Boolean Byte Byte Int (T_A Boolean))
// This is not matched: (CC_B Char (T_A Char))