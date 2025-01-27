package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[(Byte,Boolean), T_A[T_B, T_B]], b: (T_B,T_A[T_B, (Int,Char)])) extends T_A[Int, T_B]
case class CC_B(a: T_B) extends T_A[Int, T_B]
case class CC_C(a: Char) extends T_A[Int, T_B]
case class CC_D(a: CC_C, b: T_A[Int, T_B], c: CC_B) extends T_B
case class CC_E(a: Byte, b: T_B, c: CC_A) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_D(CC_C(_), CC_A(_, _), CC_B(_))) => 0 
  case CC_B(CC_D(CC_C(_), CC_B(_), CC_B(_))) => 1 
  case CC_B(CC_D(CC_C(_), CC_C(_), CC_B(_))) => 2 
  case CC_B(CC_E(_, _, _)) => 3 
}
}