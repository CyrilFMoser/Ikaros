package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Boolean, T_A], b: Boolean) extends T_A
case class CC_B(a: T_B[CC_A, T_B[Int, (Byte,Int)]], b: T_A) extends T_A
case class CC_C[C](a: CC_B) extends T_B[C, T_A]
case class CC_D[D](a: T_B[D, T_A]) extends T_B[D, T_A]
case class CC_E[E]() extends T_B[E, T_A]

val v_a: T_B[Boolean, T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _)) => 0 
  case CC_D(CC_C(CC_B(_, _))) => 1 
  case CC_D(CC_D(_)) => 2 
  case CC_D(CC_E()) => 3 
  case CC_E() => 4 
}
}