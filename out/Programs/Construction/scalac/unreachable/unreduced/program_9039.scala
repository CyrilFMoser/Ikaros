package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: T_A, c: T_B[T_B[T_A, T_A], T_B[T_A, (Int,Int)]]) extends T_A
case class CC_B(a: T_A, b: T_B[T_B[CC_A, T_A], CC_A]) extends T_A
case class CC_C(a: T_A, b: CC_B) extends T_A
case class CC_D[C]() extends T_B[C, CC_A]
case class CC_E[D](a: T_B[D, CC_A], b: T_B[D, D]) extends T_B[D, CC_A]
case class CC_F() extends T_B[T_B[T_B[(Int,Int), CC_A], T_B[(Int,Byte), CC_A]], CC_A]

val v_a: T_B[T_B[T_B[(Int,Int), CC_A], T_B[(Int,Byte), CC_A]], CC_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_F()