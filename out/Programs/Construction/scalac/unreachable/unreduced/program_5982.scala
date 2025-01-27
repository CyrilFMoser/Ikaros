package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int, b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_B(a: CC_A[T_B[Int]], b: T_B[T_B[(Int,Int)]]) extends T_B[T_A[T_B[Byte], T_A[(Byte,Byte), Char]]]
case class CC_C(a: CC_A[T_B[CC_B]]) extends T_B[T_A[T_B[Byte], T_A[(Byte,Byte), Char]]]
case class CC_D(a: T_B[T_A[CC_C, CC_B]], b: CC_A[CC_B], c: CC_A[(CC_C,CC_B)]) extends T_B[T_A[T_B[Byte], T_A[(Byte,Byte), Char]]]

val v_a: T_B[T_A[T_B[Byte], T_A[(Byte,Byte), Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(_, CC_A(_, _))) => 1 
}
}
// This is not matched: CC_D(_, _, _)