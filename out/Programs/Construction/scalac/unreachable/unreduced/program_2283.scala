package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Char]], T_A[T_A[Byte, Boolean], T_A[Int, Int]]]
case class CC_B(a: Int, b: ((CC_A,CC_A),T_A[CC_A, Int]), c: T_A[CC_A, Byte]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Char]], T_A[T_A[Byte, Boolean], T_A[Int, Int]]]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Char, Char]], T_A[T_A[Byte, Boolean], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}