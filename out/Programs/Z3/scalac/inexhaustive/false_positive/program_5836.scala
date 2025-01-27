package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[T_A[Boolean]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants