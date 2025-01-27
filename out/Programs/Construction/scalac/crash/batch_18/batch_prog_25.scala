package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[C, D]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}