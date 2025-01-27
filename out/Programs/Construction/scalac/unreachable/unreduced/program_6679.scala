package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,(Byte,Char)), T_B[T_A, Char]], b: T_B[(T_A,(Char,Boolean)), T_B[Int, Int]]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: CC_B, b: Boolean, c: T_B[C, C]) extends T_B[T_B[CC_A, T_A], C]
case class CC_D(a: CC_C[T_A], b: T_A, c: (CC_B,T_B[CC_A, (Int,Char)])) extends T_B[T_B[CC_A, T_A], CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}