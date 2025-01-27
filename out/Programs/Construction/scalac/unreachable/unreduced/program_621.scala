package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[(Boolean,Byte)]], c: T_A[T_A[Byte]]) extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_B[B]() extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_C(a: CC_B[CC_B[(Boolean,Int)]], b: T_A[(CC_A,CC_A)], c: T_A[CC_A]) extends T_A[T_A[T_A[(Char,Boolean)]]]

val v_a: T_A[T_A[T_A[(Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B(), _, _) => 2 
}
}