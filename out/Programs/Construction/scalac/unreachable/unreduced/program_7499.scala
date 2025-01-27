package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[T_B, C]
case class CC_B(a: Boolean, b: T_B, c: T_A[CC_A[T_B], CC_A[Char]]) extends T_A[T_B, T_A[T_A[T_B, (Byte,Char)], T_A[Boolean, Int]]]
case class CC_C(a: (Boolean,CC_A[CC_B])) extends T_B
case class CC_D(a: T_A[CC_C, CC_B], b: Boolean) extends T_B
case class CC_E(a: CC_D, b: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, true) => 0 
  case CC_D(_, false) => 1 
  case CC_E(_, _) => 2 
}
}
// This is not matched: CC_C(_)