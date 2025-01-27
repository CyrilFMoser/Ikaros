package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, Boolean]) extends T_A[T_B, T_B]
case class CC_B(a: T_B, b: (T_B,T_A[Byte, Char]), c: T_B) extends T_A[T_B, T_B]
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: CC_B) extends T_B
case class CC_E(a: CC_C, b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _)) => 0 
  case CC_D(CC_B(CC_C(_), (_,_), _)) => 1 
  case CC_D(CC_B(CC_D(_), (_,_), _)) => 2 
  case CC_D(CC_B(CC_E(_, _), (_,_), _)) => 3 
  case CC_E(CC_C(_), _) => 4 
}
}