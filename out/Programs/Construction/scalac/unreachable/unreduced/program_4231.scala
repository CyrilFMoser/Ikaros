package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Byte]]) extends T_A[(T_A[Char],T_A[(Char,Char)])]
case class CC_B() extends T_A[(T_A[Char],T_A[(Char,Char)])]
case class CC_C(a: CC_B) extends T_A[(T_A[Char],T_A[(Char,Char)])]

val v_a: T_A[(T_A[Char],T_A[(Char,Char)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B()) => 2 
}
}