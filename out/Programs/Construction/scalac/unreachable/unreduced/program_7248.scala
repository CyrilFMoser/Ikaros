package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Boolean) extends T_A[C, (T_A[Char, Int],Char)]
case class CC_B[D]() extends T_A[D, (T_A[Char, Int],Char)]
case class CC_C[E]() extends T_A[E, (T_A[Char, Int],Char)]

val v_a: T_A[Int, (T_A[Char, Int],Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, true) => 0 
  case CC_A(_, false) => 1 
  case CC_B() => 2 
  case CC_C() => 3 
}
}