package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: T_B, c: T_A[T_A[T_B]]) extends T_A[T_A[Boolean]]
case class CC_B(a: (T_B,T_A[(Byte,Byte)])) extends T_B
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D(CC_B((_,_))) => 1 
  case CC_D(CC_C(_)) => 2 
  case CC_D(CC_D(CC_B(_))) => 3 
  case CC_D(CC_D(CC_C(_))) => 4 
  case CC_D(CC_D(CC_D(_))) => 5 
}
}
// This is not matched: CC_C(CC_B((_,_)))