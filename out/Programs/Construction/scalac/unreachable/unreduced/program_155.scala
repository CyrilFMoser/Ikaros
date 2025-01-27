package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_A) extends T_A
case class CC_B(a: T_B[T_A, CC_A], b: Int, c: T_B[T_B[CC_A, CC_A], CC_A]) extends T_A
case class CC_C(a: Byte) extends T_A
case class CC_D[C]() extends T_B[C, Int]
case class CC_E(a: Byte, b: Boolean) extends T_B[T_B[CC_C, CC_A], Int]
case class CC_F[D](a: T_B[T_B[CC_C, CC_A], Int], b: CC_B, c: CC_D[D]) extends T_B[D, Int]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_) => 3 
}
}