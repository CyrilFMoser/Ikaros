package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[(T_A[Byte, Int],T_A[(Char,Int), Boolean]), T_B[T_A[Char, Int]]]
case class CC_B(a: Char, b: T_A[T_A[CC_A, CC_A], T_A[CC_A, CC_A]], c: T_B[CC_A]) extends T_A[(T_A[Byte, Int],T_A[(Char,Int), Boolean]), T_B[T_A[Char, Int]]]
case class CC_C(a: CC_A) extends T_A[(T_A[Byte, Int],T_A[(Char,Int), Boolean]), T_B[T_A[Char, Int]]]
case class CC_D[D]() extends T_B[D]
case class CC_E[E, F]() extends T_B[E]

val v_a: T_A[(T_A[Byte, Int],T_A[(Char,Int), Boolean]), T_B[T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A()) => 2 
}
}