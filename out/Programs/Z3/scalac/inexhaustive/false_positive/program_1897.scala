package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: T_A[C]) extends T_A[B]
case class CC_B(a: (Boolean,Int), b: T_A[Char], c: Char) extends T_A[CC_A[Int, Int]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 0 
  case CC_A(CC_B(_, _, _), CC_A(_, _)) => 1 
  case CC_A(_, CC_B(_, _, _)) => 2 
  case CC_A(_, CC_A(_, _)) => 3 
}
}
// This is not matched: (CC_A Byte
//      (CC_A Int Int Boolean Boolean Boolean)
//      Wildcard
//      (CC_B Wildcard Wildcard Char (T_A (CC_A Int Int Boolean Boolean Boolean)))
//      (T_A Byte))
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard (T_A Byte))