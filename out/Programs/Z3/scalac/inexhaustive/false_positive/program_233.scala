package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,Boolean)], b: Char) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: Pattern match is empty without constants