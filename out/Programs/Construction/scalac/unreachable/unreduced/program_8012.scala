package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C], c: Int) extends T_A[C, T_A[(Byte,Int), Int]]
case class CC_B[D]() extends T_A[D, T_A[(Byte,Int), Int]]
case class CC_C() extends T_A[(T_A[Char, Byte],CC_B[Boolean]), T_A[(Byte,Int), Int]]

val v_a: T_A[Char, T_A[(Byte,Int), Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}