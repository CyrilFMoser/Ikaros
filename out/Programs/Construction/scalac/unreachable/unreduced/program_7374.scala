package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Byte, Byte],T_A[Byte, Int]), c: C) extends T_A[C, T_A[T_A[(Char,Byte), Byte], T_A[Boolean, Int]]]
case class CC_B[D, E](a: Byte) extends T_A[D, T_A[T_A[(Char,Byte), Byte], T_A[Boolean, Int]]]
case class CC_C[F]() extends T_A[F, T_A[T_A[(Char,Byte), Byte], T_A[Boolean, Int]]]

val v_a: T_A[Byte, T_A[T_A[(Char,Byte), Byte], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}