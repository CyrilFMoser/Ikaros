package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Boolean,(Boolean,Char)),T_A[Char, Char]), b: T_A[C, C]) extends T_A[(T_A[Boolean, Int],T_A[Int, Int]), C]
case class CC_B[D]() extends T_A[(T_A[Boolean, Int],T_A[Int, Int]), D]
case class CC_C[E]() extends T_A[(T_A[Boolean, Int],T_A[Int, Int]), E]

val v_a: T_A[(T_A[Boolean, Int],T_A[Int, Int]), Int] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}