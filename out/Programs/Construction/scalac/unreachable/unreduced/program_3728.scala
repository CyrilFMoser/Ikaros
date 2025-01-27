package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Char,Boolean)]], b: Char, c: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_B(a: (T_A[CC_A],CC_A)) extends T_A[T_A[T_A[(Char,Boolean)]]]
case class CC_C(a: Byte, b: (CC_B,(CC_A,(Byte,Char))), c: Boolean) extends T_A[T_A[T_A[(Char,Boolean)]]]

val v_a: T_A[T_A[T_A[(Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,CC_A(_, _, _))) => 1 
  case CC_C(_, (CC_B(_),(_,_)), _) => 2 
}
}