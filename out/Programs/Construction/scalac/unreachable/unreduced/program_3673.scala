package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: T_B[T_A, Boolean], c: (T_A,T_B[T_A, T_A])) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_A) extends T_B[C, CC_C]
case class CC_E[D](a: Int, b: CC_D[D]) extends T_B[D, CC_C]
case class CC_F(a: T_A, b: CC_A) extends T_B[CC_C, CC_C]

val v_a: T_B[CC_C, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, (_,_))) => 0 
  case CC_E(_, CC_D(CC_A(_, _, _))) => 1 
  case CC_F(_, _) => 2 
}
}