package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_B, C]
case class CC_B(a: CC_A[Char], b: Byte, c: (Boolean,Byte)) extends T_A[T_B, T_B]
case class CC_C(a: CC_B) extends T_A[T_B, T_B]
case class CC_D(a: T_A[T_A[T_B, T_B], T_A[T_B, T_B]]) extends T_B
case class CC_E(a: CC_D, b: (CC_A[CC_C],T_A[T_B, T_B]), c: T_A[T_B, T_A[CC_C, T_B]]) extends T_B
case class CC_F(a: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_D(_), (CC_A(_),CC_A(_)), CC_A(_)) => 1 
  case CC_E(CC_D(_), (CC_A(_),CC_B(_, _, _)), CC_A(_)) => 2 
  case CC_E(CC_D(_), (CC_A(_),CC_C(_)), CC_A(_)) => 3 
  case CC_F(_) => 4 
}
}