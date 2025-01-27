package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (Char,T_A[T_B, T_B]), b: Byte, c: C) extends T_A[T_A[Boolean, Boolean], C]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: Int, b: T_A[Byte, CC_A[Boolean]]) extends T_B
case class CC_D(a: Int, b: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _))) => 1 
  case CC_B(CC_B(CC_D(_, _))) => 2 
  case CC_B(CC_C(_, _)) => 3 
  case CC_B(CC_D(_, 'x')) => 4 
  case CC_C(_, _) => 5 
  case CC_D(_, _) => 6 
}
}
// This is not matched: CC_B(CC_D(_, _))