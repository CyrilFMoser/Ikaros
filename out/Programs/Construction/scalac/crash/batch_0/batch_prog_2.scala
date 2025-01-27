package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}