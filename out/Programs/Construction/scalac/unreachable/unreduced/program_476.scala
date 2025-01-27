package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[T_A[(Int,Int)]]
case class CC_B(a: T_A[CC_A[(Char,Boolean)]], b: CC_A[Byte], c: T_A[Boolean]) extends T_A[T_A[(Int,Int)]]

val v_a: T_A[T_A[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
}
}