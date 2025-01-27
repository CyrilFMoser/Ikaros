package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: ((Byte,Byte),Char), b: T_A[Boolean]) extends T_A[(Int,Int)]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,'x'), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants