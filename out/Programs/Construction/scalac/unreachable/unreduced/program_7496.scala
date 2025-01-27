package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B, c: T_A[B]) extends T_A[T_A[(Boolean,Int)]]
case class CC_B() extends T_A[T_A[(Boolean,Int)]]
case class CC_C(a: (T_A[CC_B],CC_A[CC_B]), b: T_A[CC_A[(Int,Char)]], c: Boolean) extends T_A[T_A[(Boolean,Int)]]

val v_a: T_A[T_A[(Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}