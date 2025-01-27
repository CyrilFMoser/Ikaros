package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, T_A[Boolean, Int]], b: Int) extends T_A[T_A[(Char,Char), Char], T_A[T_A[Byte, Int], T_A[Byte, Boolean]]]
case class CC_B[C]() extends T_A[T_A[(Char,Char), Char], T_A[T_A[Byte, Int], T_A[Byte, Boolean]]]
case class CC_C(a: (Byte,CC_A), b: T_A[CC_A, CC_B[Char]]) extends T_A[CC_B[CC_A], CC_A]

val v_a: T_A[T_A[(Char,Char), Char], T_A[T_A[Byte, Int], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}