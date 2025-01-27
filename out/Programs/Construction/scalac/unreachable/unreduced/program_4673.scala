package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A], b: Char, c: T_B[T_A, Int]) extends T_A
case class CC_B(a: Byte, b: CC_A, c: CC_A) extends T_A
case class CC_C(a: CC_A, b: Int, c: CC_A) extends T_A
case class CC_D[C](a: T_B[C, C], b: CC_C, c: T_B[C, CC_A]) extends T_B[C, CC_A]
case class CC_E(a: T_B[T_B[T_A, Char], CC_A], b: CC_B) extends T_B[CC_D[T_B[T_A, CC_A]], CC_A]
case class CC_F[D](a: CC_D[D], b: (T_B[CC_B, CC_A],(CC_C,(Boolean,Byte)))) extends T_B[D, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)