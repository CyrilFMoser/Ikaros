package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, T_B]
case class CC_B(a: Boolean, b: T_A[(Byte,Int), CC_A[T_B]]) extends T_A[T_B, T_B]
case class CC_C(a: T_A[T_B, T_B], b: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_D(a: Char) extends T_B
case class CC_E(a: CC_B, b: (T_A[(Char,Byte), T_B],(T_B,CC_D))) extends T_B
case class CC_F(a: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_B(_, _), (_,_)) => 0 
  case CC_F(_) => 1 
}
}
// This is not matched: CC_D(_)