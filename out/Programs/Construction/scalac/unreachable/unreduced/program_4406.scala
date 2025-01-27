package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[(T_A[Boolean],Byte)]
case class CC_B(a: (Int,Byte)) extends T_A[(T_A[Boolean],Byte)]

val v_a: T_A[(T_A[Boolean],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((12,0)) => 1 
  case CC_B((12,_)) => 2 
  case CC_B((_,0)) => 3 
}
}
// This is not matched: CC_B((_,_))