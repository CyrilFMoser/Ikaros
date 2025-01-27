package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Boolean],(Boolean,Byte)), b: C) extends T_A[C, Byte]
case class CC_B(a: T_A[T_A[Char, Byte], Byte], b: T_A[CC_A[Int], Char], c: T_A[T_A[Byte, Byte], Int]) extends T_A[Char, Byte]
case class CC_C[D](a: Int) extends T_A[D, T_A[D, D]]

val v_a: T_A[T_A[Char, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(CC_A(_, _), _, _)) => 1 
}
}