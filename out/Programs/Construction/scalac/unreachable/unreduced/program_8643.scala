package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Char, b: T_A[C, C], c: T_A[D, D]) extends T_A[T_A[T_A[(Int,Byte), Boolean], T_A[(Int,Boolean), Char]], C]
case class CC_B(a: T_A[((Int,Boolean),Byte), T_A[Byte, Byte]]) extends T_A[T_A[T_A[(Int,Byte), Boolean], T_A[(Int,Boolean), Char]], Boolean]
case class CC_C() extends T_A[T_A[T_A[(Int,Byte), Boolean], T_A[(Int,Boolean), Char]], Boolean]

val v_a: T_A[T_A[T_A[(Int,Byte), Boolean], T_A[(Int,Boolean), Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)