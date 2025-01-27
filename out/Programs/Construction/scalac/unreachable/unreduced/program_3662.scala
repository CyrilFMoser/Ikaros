package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (Boolean,T_B), b: T_B, c: C) extends T_A[T_B, C]
case class CC_B(a: (T_B,T_A[Byte, (Byte,Byte)]), b: T_A[CC_A[T_B], T_B]) extends T_A[T_B, T_A[CC_A[(Char,Boolean)], T_B]]
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: Int) extends T_B

val v_a: CC_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(CC_B(_, _)), _) => 0 
  case CC_A(_, CC_D(_), _) => 1 
}
}