package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[(Char,T_A), T_B[T_A, T_A]]) extends T_A
case class CC_C(a: (T_A,T_A), b: Int, c: T_B[CC_B, T_A]) extends T_A
case class CC_D[C]() extends T_B[C, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}