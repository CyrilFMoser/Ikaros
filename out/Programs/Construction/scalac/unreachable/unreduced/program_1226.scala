package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[(T_A[Byte],Boolean)]
case class CC_B(a: Boolean, b: Boolean, c: T_A[T_A[Boolean]]) extends T_A[(T_A[Byte],Boolean)]

val v_a: T_A[(T_A[Byte],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}