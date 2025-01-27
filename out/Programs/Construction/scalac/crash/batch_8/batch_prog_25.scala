package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E]() extends T_A[T_A[CC_A[(Char,Char), Int], T_A[Int, Boolean]], E]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}