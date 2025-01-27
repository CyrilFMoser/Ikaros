package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[T_A[Byte, Int], C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Int (CC_B Int Wildcard Wildcard (T_A Int)) (CC_A Int (T_A Int)) (T_A Int))