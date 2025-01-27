package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_B(a: (CC_A,(CC_A,Byte)), b: Char, c: (CC_A,CC_A)) extends T_A[T_A[T_A[(Char,Boolean)]]]

val v_a: T_A[T_A[T_A[(Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}