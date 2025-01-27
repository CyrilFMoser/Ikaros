package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[T_A[T_A[(Byte,Boolean)]]]
case class CC_B(a: CC_A[CC_A[Int]], b: T_A[(Byte,(Char,Char))]) extends T_A[T_A[T_A[(Byte,Boolean)]]]
case class CC_C(a: (CC_B,T_A[Int]), b: CC_A[Boolean], c: (CC_A[CC_B],T_A[CC_B])) extends T_A[T_A[T_A[(Byte,Boolean)]]]

val v_a: T_A[T_A[T_A[(Byte,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}