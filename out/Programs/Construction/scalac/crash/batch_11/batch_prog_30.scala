package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Int, c: T_B[T_B[(Byte,Byte)]]) extends T_A
case class CC_B[B](a: CC_A) extends T_B[B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B(_)) => 0 
}
}