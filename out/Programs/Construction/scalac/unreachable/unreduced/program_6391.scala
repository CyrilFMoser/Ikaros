package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Char]]) extends T_A[Int]
case class CC_B(a: CC_A, b: CC_A, c: (T_B,((Char,Char),T_B))) extends T_A[Int]
case class CC_C() extends T_B
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: CC_D, b: (Char,T_A[Int])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C()) => 1 
  case CC_E(CC_D(CC_C()), (_,CC_A(_))) => 2 
}
}
// This is not matched: CC_E(CC_D(CC_C()), (_,CC_B(_, _, _)))