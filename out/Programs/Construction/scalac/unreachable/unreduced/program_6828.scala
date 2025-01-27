package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[(Boolean,(Boolean,Char)), T_A]) extends T_A
case class CC_C(a: (((Char,Char),T_A),T_B[T_A, Byte]), b: Byte, c: T_B[CC_B, Int]) extends T_A
case class CC_D[C]() extends T_B[C, T_A]
case class CC_E(a: CC_B, b: (T_A,CC_B)) extends T_B[T_A, T_A]
case class CC_F(a: CC_B) extends T_B[T_A, T_A]

val v_a: T_B[T_A, T_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_B(CC_D()), (CC_A(_, _),CC_B(_))) => 1 
  case CC_E(CC_B(CC_D()), (CC_B(_),CC_B(_))) => 2 
  case CC_E(CC_B(CC_D()), (CC_C(_, _, _),CC_B(_))) => 3 
  case CC_F(_) => 4 
}
}