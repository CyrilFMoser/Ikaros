package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}