package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Char], T_A[Char, Char]], b: Byte, c: T_A[(Byte,Boolean), T_A[Boolean, Boolean]]) extends T_A[(T_A[Boolean, Byte],Char), T_A[Char, T_A[Int, Boolean]]]
case class CC_B() extends T_A[(T_A[Boolean, Byte],Char), T_A[Char, T_A[Int, Boolean]]]
case class CC_C() extends T_A[(T_A[Boolean, Byte],Char), T_A[Char, T_A[Int, Boolean]]]

val v_a: T_A[(T_A[Boolean, Byte],Char), T_A[Char, T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}