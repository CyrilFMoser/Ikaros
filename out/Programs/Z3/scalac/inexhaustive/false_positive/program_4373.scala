package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_B Int
//      (CC_A Int Wildcard Int (T_A (T_A Char Int) Int))
//      Int
//      (T_A (T_A Char Int) Int))