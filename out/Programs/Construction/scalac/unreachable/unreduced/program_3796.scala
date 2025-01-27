package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C]) extends T_A[T_A[T_A[Int, Byte], T_A[(Boolean,Byte), Char]], C]
case class CC_B() extends T_A[T_A[T_A[Int, Byte], T_A[(Boolean,Byte), Char]], CC_A[T_A[Byte, Boolean]]]
case class CC_C[D](a: CC_A[D], b: CC_A[D]) extends T_A[T_A[T_A[Int, Byte], T_A[(Boolean,Byte), Char]], D]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[(Boolean,Byte), Char]], T_A[T_A[T_A[Int, Byte], T_A[(Boolean,Byte), Char]], CC_A[T_A[Byte, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}