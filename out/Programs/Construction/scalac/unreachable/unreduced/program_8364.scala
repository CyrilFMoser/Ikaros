package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[T_B],(T_B,T_B))) extends T_A[Byte]
case class CC_B(a: Char, b: T_A[CC_A]) extends T_A[Byte]
case class CC_C(a: T_A[Byte], b: Int, c: T_A[T_A[Byte]]) extends T_B
case class CC_D(a: T_B) extends T_B
case class CC_E(a: T_A[CC_A], b: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, 12, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(CC_C(_, _, _)) => 2 
  case CC_D(CC_D(CC_C(_, _, _))) => 3 
  case CC_D(CC_D(CC_D(_))) => 4 
  case CC_D(CC_D(CC_E(_, _))) => 5 
  case CC_D(CC_E(_, _)) => 6 
  case CC_E(_, _) => 7 
}
}