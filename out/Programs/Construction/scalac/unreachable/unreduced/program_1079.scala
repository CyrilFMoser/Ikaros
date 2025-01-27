package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[(Byte,Char), T_A], Char]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: (T_B[CC_B, T_A],T_B[T_A, CC_B])) extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}