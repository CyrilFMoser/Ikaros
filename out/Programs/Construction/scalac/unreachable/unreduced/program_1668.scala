package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int]) extends T_A[T_A[(Int,Boolean)]]
case class CC_B(a: Boolean, b: ((CC_A,Char),CC_A)) extends T_A[T_A[(Int,Boolean)]]
case class CC_C() extends T_A[T_A[(Int,Boolean)]]

val v_a: T_A[T_A[(Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}