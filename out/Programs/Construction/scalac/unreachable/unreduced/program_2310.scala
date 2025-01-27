package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: C) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[T_A[CC_A[Boolean], CC_A[(Int,Int)]], T_A[T_A[CC_A[Boolean], CC_A[(Int,Int)]], T_A[CC_A[Boolean], CC_A[(Int,Int)]]]]
case class CC_C(a: Char, b: (T_A[CC_B, CC_B],CC_B), c: CC_B) extends T_A[T_A[CC_A[Boolean], CC_A[(Int,Int)]], T_A[T_A[CC_A[Boolean], CC_A[(Int,Int)]], T_A[CC_A[Boolean], CC_A[(Int,Int)]]]]

val v_a: T_A[T_A[CC_A[Boolean], CC_A[(Int,Int)]], T_A[T_A[CC_A[Boolean], CC_A[(Int,Int)]], T_A[CC_A[Boolean], CC_A[(Int,Int)]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}