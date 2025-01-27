package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Int, c: T_A[Int]) extends T_A[Int]
case class CC_B() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_C Boolean (CC_B Boolean (T_A Boolean)) Wildcard (T_A Boolean))