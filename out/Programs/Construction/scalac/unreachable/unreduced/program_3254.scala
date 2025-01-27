package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_B[Char],T_A[(Byte,Char), Char]), b: Byte) extends T_A[T_A[D, Byte], D]
case class CC_B() extends T_A[T_A[T_A[T_A[CC_A[Boolean], Byte], CC_A[Boolean]], Byte], T_A[T_A[CC_A[Boolean], Byte], CC_A[Boolean]]]
case class CC_C[E]() extends T_B[E]

val v_a: T_A[T_A[T_A[T_A[CC_A[Boolean], Byte], CC_A[Boolean]], Byte], T_A[T_A[CC_A[Boolean], Byte], CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A((CC_C(),_), _) => 0 
  case CC_B() => 1 
}
}