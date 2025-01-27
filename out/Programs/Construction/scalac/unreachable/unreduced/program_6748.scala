package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], T_A[(Int,Byte), Char]]) extends T_A[(T_A[Boolean, Boolean],(Byte,Int)), Boolean]
case class CC_B(a: Char, b: T_A[Char, (CC_A,CC_A)], c: T_A[T_A[CC_A, Byte], T_A[CC_A, Int]]) extends T_A[(T_A[Boolean, Boolean],(Byte,Int)), Boolean]
case class CC_C() extends T_A[(T_A[Boolean, Boolean],(Byte,Int)), Boolean]

val v_a: T_A[(T_A[Boolean, Boolean],(Byte,Int)), Boolean] = null
val v_b: Int = v_a match{
  case CC_B('x', _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_A(_)