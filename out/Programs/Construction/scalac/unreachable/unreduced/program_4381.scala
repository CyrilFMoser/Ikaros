package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: (T_A[(Boolean,Char)],Char), b: (Byte,T_A[(Char,Char)]), c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: T_B, b: T_B) extends T_B
case class CC_D(a: (T_B,T_B)) extends T_B
case class CC_E(a: CC_C, b: T_A[CC_A], c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D((CC_C(_, _),CC_C(_, _))) => 1 
  case CC_D((CC_C(_, _),CC_D(_))) => 2 
  case CC_D((CC_C(_, _),CC_E(_, _, _))) => 3 
  case CC_D((CC_D(_),CC_C(_, _))) => 4 
  case CC_D((CC_D(_),CC_D(_))) => 5 
  case CC_D((CC_D(_),CC_E(_, _, _))) => 6 
  case CC_D((CC_E(_, _, _),CC_C(_, _))) => 7 
  case CC_D((CC_E(_, _, _),CC_E(_, _, _))) => 8 
  case CC_E(_, _, _) => 9 
}
}
// This is not matched: CC_D((CC_E(_, _, _),CC_D(_)))