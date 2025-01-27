package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_A[Int, Byte], T_B[Byte]], b: Int, c: T_A[(Boolean,(Byte,Int)), T_B[Char]]) extends T_A[T_A[Byte, T_B[(Boolean,Boolean)]], Int]
case class CC_B(a: ((Byte,CC_A),T_A[CC_A, CC_A]), b: T_B[T_A[CC_A, CC_A]], c: CC_A) extends T_B[T_B[T_A[Char, CC_A]]]
case class CC_C() extends T_B[T_B[T_A[Char, CC_A]]]

val v_a: T_B[T_B[T_A[Char, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _, _)) => 0 
  case CC_C() => 1 
}
}