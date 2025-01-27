package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Boolean, b: T_A[B]) extends T_A[B]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}