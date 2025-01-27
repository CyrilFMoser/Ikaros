package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}