package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Char, Byte], T_A[(Boolean,Byte), Char]], C]
case class CC_B[D](a: T_A[D, D], b: (CC_A[Byte],T_A[Byte, Char]), c: Int) extends T_A[T_A[T_A[Char, Byte], T_A[(Boolean,Byte), Char]], D]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[(Boolean,Byte), Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}