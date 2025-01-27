package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: ((T_A,Char),T_A), b: T_A, c: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_B[T_B[T_A]], b: T_B[T_B[T_A]]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_B[T_B[CC_A]], b: T_B[CC_A], c: T_B[T_B[CC_A]]) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]
case class CC_F(a: CC_D, b: Boolean, c: T_B[CC_A]) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(((_,_),CC_A(_, _, _)), _, _) => 0 
  case CC_A(((_,_),CC_B(_, _)), _, _) => 1 
  case CC_A(((_,_),CC_C()), _, _) => 2 
  case CC_B(_, _) => 3 
  case CC_C() => 4 
}
}