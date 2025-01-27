package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[(Int,Boolean), Char],T_A[Byte, Byte])) extends T_A[((Int,Int),T_A[Int, Int]), C]
case class CC_B[D](a: D) extends T_A[((Int,Int),T_A[Int, Int]), D]
case class CC_C[E, F]() extends T_A[((Int,Int),T_A[Int, Int]), E]

val v_a: T_A[((Int,Int),T_A[Int, Int]), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(0) => 1 
  case CC_B(_) => 2 
  case CC_C() => 3 
}
}