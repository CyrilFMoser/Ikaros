package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_B[Boolean],T_B[Int]), b: D, c: D) extends T_A[T_A[T_B[Byte], Boolean], D]
case class CC_B() extends T_A[T_A[T_B[Byte], Boolean], CC_A[T_A[Byte, Char]]]
case class CC_C[E](a: T_B[E], b: E) extends T_B[E]

val v_a: T_A[T_A[T_B[Byte], Boolean], CC_A[T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A((CC_C(_, _),CC_C(_, _)), CC_A((_,_), _, _), CC_A(_, _, _)) => 0 
  case CC_B() => 1 
}
}