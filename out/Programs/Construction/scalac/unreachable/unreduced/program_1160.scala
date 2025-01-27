package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Byte]]) extends T_A[(Byte,T_A[(Char,Boolean)])]
case class CC_B(a: T_A[CC_A], b: T_A[(Int,CC_A)], c: T_A[CC_A]) extends T_A[(Byte,T_A[(Char,Boolean)])]
case class CC_C() extends T_A[(Byte,T_A[(Char,Boolean)])]

val v_a: T_A[(Byte,T_A[(Char,Boolean)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}