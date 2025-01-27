package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[(T_B[Int, Int],Int), E]
case class CC_B(a: T_A[Int, T_B[Char, Int]], b: ((Byte,Byte),T_A[Byte, Char])) extends T_A[(T_B[Int, Int],Int), CC_A[Byte]]
case class CC_C[F, G](a: F) extends T_B[G, F]

val v_a: T_A[(T_B[Int, Int],Int), CC_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, ((_,_),_)) => 1 
}
}