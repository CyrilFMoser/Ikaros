package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_A[Char, (T_B,T_B)]) extends T_A[(T_A[T_B, T_B],(T_B,T_B)), Int]
case class CC_B() extends T_A[(T_A[T_B, T_B],(T_B,T_B)), Int]
case class CC_C() extends T_A[(T_A[T_B, T_B],(T_B,T_B)), Int]
case class CC_D(a: CC_C, b: CC_C) extends T_B

val v_a: T_A[(T_A[T_B, T_B],(T_B,T_B)), Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _), _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}