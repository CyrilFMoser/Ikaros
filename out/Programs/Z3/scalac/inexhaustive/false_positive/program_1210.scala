package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[T_A[Int]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A Int Char (T_A Int Char))