package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Boolean,Char), b: T_A[Char]) extends T_A[T_A[Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,'x'), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants