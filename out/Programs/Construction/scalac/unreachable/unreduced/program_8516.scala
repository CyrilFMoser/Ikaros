package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[T_B, T_B],(T_B,T_B)), b: Byte, c: C) extends T_A[Boolean, C]
case class CC_B[D]() extends T_A[Boolean, D]
case class CC_C(a: T_B, b: (T_A[Boolean, Byte],T_A[Boolean, T_B]), c: CC_A[T_A[Boolean, T_B]]) extends T_A[Boolean, (Int,T_A[Boolean, T_B])]
case class CC_D(a: T_A[Boolean, T_A[Boolean, (Byte,Char)]], b: CC_C, c: T_A[T_A[Boolean, T_B], Int]) extends T_B
case class CC_E[E](a: T_A[Boolean, E], b: T_A[Boolean, E]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A((_,_), _, _), _, _) => 0 
  case CC_D(CC_B(), _, _) => 1 
  case CC_E(_, _) => 2 
}
}