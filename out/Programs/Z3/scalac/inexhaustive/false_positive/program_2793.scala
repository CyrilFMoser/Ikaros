package Program_30 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: (Int,Byte), c: C) extends T_A[B]
case class CC_B(a: CC_A[(Byte,Byte), Char], b: T_A[Byte]) extends T_A[Int]
case class CC_C(a: (CC_B,Int), b: CC_A[(Byte,Byte), CC_B]) extends T_A[Int]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (CC_A Byte Boolean Wildcard (Tuple Wildcard Byte) Wildcard (T_A Byte))
//      (T_A Int))
// This is not matched: (CC_A Char Byte Boolean Wildcard (T_A Byte Char))