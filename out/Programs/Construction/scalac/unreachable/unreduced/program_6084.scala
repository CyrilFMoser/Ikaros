package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Int], b: (T_A,T_B[T_A])) extends T_A
case class CC_B(a: Boolean, b: (T_B[T_A],CC_A), c: CC_A) extends T_A
case class CC_C(a: (Byte,T_A)) extends T_A
case class CC_D(a: CC_A, b: Byte) extends T_B[CC_C]
case class CC_E(a: CC_B, b: CC_D) extends T_B[CC_C]
case class CC_F(a: Char, b: CC_A) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(true, (_,CC_A(_, _)), _) => 1 
  case CC_B(false, (_,CC_A(_, _)), _) => 2 
  case CC_C((_,CC_A(_, _))) => 3 
  case CC_C((_,CC_C(_))) => 4 
}
}
// This is not matched: CC_C((_,CC_B(_, _, _)))