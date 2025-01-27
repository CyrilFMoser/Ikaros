package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Boolean, T_A[T_A[Int, Boolean], (Int,Boolean)]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], Boolean]) extends T_A[Boolean, T_A[T_A[Int, Boolean], (Int,Boolean)]]

val v_a: T_A[Boolean, T_A[T_A[Int, Boolean], (Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}