package Program_12 

 object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B(a: CC_A[Char], b: CC_A[Char]) extends T_A[T_A[Char]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}