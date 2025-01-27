package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Byte, Char], Byte], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[T_A[Byte, Char], Byte], D]
case class CC_C(a: CC_B[CC_A[Int]], b: T_A[(Int,Byte), T_A[Byte, Char]]) extends T_A[T_A[T_A[Byte, Char], Byte], Int]

val v_a: T_A[T_A[T_A[Byte, Char], Byte], CC_C] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}