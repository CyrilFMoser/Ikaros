package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Boolean,T_B[T_A, T_A]), b: T_B[T_A, T_B[Char, T_A]]) extends T_A
case class CC_B(a: Int, b: T_B[CC_A, Boolean]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_, _) => 1 
}
}