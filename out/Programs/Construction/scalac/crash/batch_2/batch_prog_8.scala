package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[(T_A[Boolean],T_A[Boolean])]

val v_a: T_A[(T_A[Boolean],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}