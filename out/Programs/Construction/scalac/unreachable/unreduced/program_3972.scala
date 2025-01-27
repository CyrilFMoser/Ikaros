package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[Byte, T_B[T_A, (Int,Byte)]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: T_B[C, T_A]) extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(_)) => 2 
}
}