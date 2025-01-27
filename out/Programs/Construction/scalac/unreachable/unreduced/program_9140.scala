package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, (Int,Int)], Int], b: T_A[Char, T_A[Byte, Boolean]], c: T_A[T_A[Char, Byte], T_A[(Int,Boolean), Boolean]]) extends T_A[(T_A[Byte, Byte],T_A[Char, (Int,Byte)]), T_A[Int, T_A[Byte, Int]]]
case class CC_B(a: Char, b: T_A[T_A[CC_A, CC_A], Int], c: Char) extends T_A[(T_A[Byte, Byte],T_A[Char, (Int,Byte)]), T_A[Int, T_A[Byte, Int]]]
case class CC_C() extends T_A[(T_A[Byte, Byte],T_A[Char, (Int,Byte)]), T_A[Int, T_A[Byte, Int]]]

val v_a: T_A[(T_A[Byte, Byte],T_A[Char, (Int,Byte)]), T_A[Int, T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, 'x') => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_B(_, _, _)