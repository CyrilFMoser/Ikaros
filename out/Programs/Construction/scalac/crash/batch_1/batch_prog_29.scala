package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Int], (Char,(Boolean,Byte))], b: T_B[T_A[Byte], Byte], c: Char) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_B[D](a: T_A[D], b: Int) extends T_A[T_A[T_B[Boolean, Boolean]]]
case class CC_C[E, F](a: ((CC_A,CC_A),Byte), b: Int) extends T_B[F, E]
case class CC_D[G](a: Int, b: T_B[G, G], c: Int) extends T_B[(T_B[(Char,Boolean), CC_A],CC_C[(Char,Boolean), CC_A]), G]
case class CC_E[H]() extends T_B[(T_B[(Char,Boolean), CC_A],CC_C[(Char,Boolean), CC_A]), H]

val v_a: T_A[T_A[T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}
// This is not matched: CC_A(CC_C(_, _), _, _)