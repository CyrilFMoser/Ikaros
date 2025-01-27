package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[T_A[CC_A[(Byte,Char)], T_A[Int, Int]], T_A[T_A[CC_A[(Byte,Char)], T_A[Int, Int]], T_A[CC_A[(Byte,Char)], T_A[Int, Int]]]]
case class CC_C(a: Char) extends T_A[Char, T_A[Char, Char]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}