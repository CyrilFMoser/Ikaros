package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Boolean]], c: T_A[(Char,Char)]) extends T_A[(T_A[Byte],T_A[(Int,Int)])]
case class CC_B(a: T_A[Char]) extends T_A[(T_A[Byte],T_A[(Int,Int)])]
case class CC_C() extends T_A[(T_A[Byte],T_A[(Int,Int)])]

val v_a: T_A[(T_A[Byte],T_A[(Int,Int)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}