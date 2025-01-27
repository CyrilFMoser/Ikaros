package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[(T_A[Int, Byte],T_A[Int, Int]), D]
case class CC_B[E]() extends T_A[(T_A[Int, Byte],T_A[Int, Int]), E]
case class CC_C[F](a: (T_A[Int, Int],CC_A[Byte])) extends T_A[(T_A[Int, Byte],T_A[Int, Int]), F]
case class CC_D(a: T_A[CC_B[(Byte,Byte)], (Char,Int)], b: Boolean, c: (CC_A[Byte],CC_C[Char])) extends T_B[T_A[(Boolean,Byte), CC_B[Char]]]
case class CC_E[G](a: T_B[G]) extends T_B[G]

val v_a: T_A[(T_A[Int, Byte],T_A[Int, Int]), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C((_,CC_A())) => 2 
}
}