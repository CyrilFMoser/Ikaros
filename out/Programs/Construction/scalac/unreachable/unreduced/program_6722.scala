package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[(Char,Char)]]]
case class CC_B[B](a: ((CC_A,CC_A),CC_A), b: Char) extends T_A[T_A[T_A[(Char,Char)]]]
case class CC_C(a: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[(Char,Char)]]]

val v_a: T_A[T_A[T_A[(Char,Char)]]] = null
val v_b: Int = v_a match{
  case CC_B(((_,_),CC_A()), _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A()