package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_B]
case class CC_B(a: (Boolean,T_A[T_B, T_B])) extends T_A[T_A[T_B, Byte], T_B]
case class CC_C(a: T_A[CC_A[CC_B], T_B], b: T_A[T_A[T_B, Byte], T_B]) extends T_B
case class CC_D(a: Char, b: CC_A[T_A[CC_C, T_B]], c: (CC_B,T_B)) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _) => 0 
  case CC_D(_, CC_A(_), (CC_B(_),CC_C(_, _))) => 1 
  case CC_D(_, CC_A(_), (CC_B(_),CC_D(_, _, _))) => 2 
  case CC_D(_, CC_A(_), (CC_B(_),CC_E())) => 3 
  case CC_E() => 4 
}
}