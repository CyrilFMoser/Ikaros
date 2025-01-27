package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: Byte, c: T_A[T_A[(Boolean,Boolean)]]) extends T_A[(T_A[Char],T_A[Char])]
case class CC_B(a: (((Int,Char),Byte),T_A[Char])) extends T_A[(T_A[Char],T_A[Char])]
case class CC_C() extends T_A[(T_A[Char],T_A[Char])]

val v_a: T_A[(T_A[Char],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_B(((_,_),_)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)