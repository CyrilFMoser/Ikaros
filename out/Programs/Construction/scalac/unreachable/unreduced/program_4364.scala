package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A, CC_A], b: Int, c: Int) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C]() extends T_B[CC_B, C]
case class CC_E[D](a: D) extends T_B[CC_B, D]
case class CC_F(a: CC_A, b: CC_E[(Int,CC_A)], c: (Char,T_B[CC_A, Boolean])) extends T_B[CC_B, (T_B[CC_B, Byte],Boolean)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_A(CC_C(CC_B(_, _, _))) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: CC_C(CC_B(_, _, _))