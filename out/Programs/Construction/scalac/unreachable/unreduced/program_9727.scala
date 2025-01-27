package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, T_B]
case class CC_B[D](a: Int) extends T_A[D, T_B]
case class CC_C(a: T_A[T_A[Int, (Byte,Byte)], T_B]) extends T_B
case class CC_D(a: CC_B[Boolean], b: Int, c: Byte) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
  case CC_C(CC_B(_)) => 1 
}
}