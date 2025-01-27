package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[(Boolean,Byte), Byte], T_A[Int, Byte]], C]
case class CC_B[D](a: Char, b: CC_A[D]) extends T_A[T_A[T_A[(Boolean,Byte), Byte], T_A[Int, Byte]], Boolean]
case class CC_C(a: CC_A[T_A[Char, Byte]], b: T_A[CC_B[Byte], CC_A[Boolean]], c: T_A[CC_A[Int], T_A[Byte, Boolean]]) extends T_A[T_A[T_A[(Boolean,Byte), Byte], T_A[Int, Byte]], Boolean]

val v_a: T_A[T_A[T_A[(Boolean,Byte), Byte], T_A[Int, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(_), _, _) => 1 
}
}
// This is not matched: CC_A(_)