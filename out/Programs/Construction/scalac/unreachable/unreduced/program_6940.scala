package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: T_B, c: (Byte,T_A[T_B])) extends T_A[((T_B,CC_A),CC_A)]
case class CC_C(a: CC_B, b: T_A[CC_B]) extends T_B
case class CC_D(a: Char) extends T_B
case class CC_E(a: CC_B, b: Boolean, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), _) => 0 
  case CC_D(_) => 1 
  case CC_E(CC_B(CC_A(_), CC_C(_, _), (_,_)), _, _) => 2 
  case CC_E(CC_B(CC_A(_), CC_D(_), (_,_)), _, _) => 3 
}
}
// This is not matched: CC_E(CC_B(CC_A(_), CC_E(_, _, _), (_,_)), _, _)