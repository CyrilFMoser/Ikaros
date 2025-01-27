package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}