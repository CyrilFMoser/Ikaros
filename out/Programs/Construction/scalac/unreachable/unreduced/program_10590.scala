package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Char], T_A[Int, Char]], T_A[Int, T_A[Char, Boolean]]]
case class CC_B(a: T_A[CC_A, T_A[(Char,Int), CC_A]], b: CC_A) extends T_A[T_A[T_A[Byte, Char], T_A[Int, Char]], T_A[Int, T_A[Char, Boolean]]]
case class CC_C[C]() extends T_A[C, CC_A]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Int, Char]], T_A[Int, T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}