package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Char, T_A[T_A[Boolean, Int], (Boolean,Int)]]
case class CC_B(a: T_A[Int, CC_A], b: CC_A, c: T_A[CC_A, (CC_A,CC_A)]) extends T_A[Char, T_A[T_A[Boolean, Int], (Boolean,Int)]]

val v_a: T_A[Char, T_A[T_A[Boolean, Int], (Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
}
}