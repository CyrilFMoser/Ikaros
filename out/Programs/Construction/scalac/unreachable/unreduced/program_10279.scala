package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[(Boolean,Int), T_A]], b: T_B[T_A, T_B[T_A, (Int,Char)]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_A, b: C) extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_B(CC_C()) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B(CC_A(_, _))