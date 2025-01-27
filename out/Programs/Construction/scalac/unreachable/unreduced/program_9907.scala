package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(T_A[Int, Int],T_A[Char, Int]), C]
case class CC_B[D](a: CC_A[CC_A[D]], b: (CC_A[Byte],T_A[(Byte,Int), (Byte,Char)]), c: Char) extends T_A[D, T_A[T_A[Int, Byte], Byte]]
case class CC_C[E](a: E, b: T_A[E, E]) extends T_A[(T_A[Int, Int],T_A[Char, Int]), E]

val v_a: T_A[(T_A[Int, Int],T_A[Char, Int]), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}