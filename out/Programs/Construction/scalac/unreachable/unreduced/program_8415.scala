package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, T_A[D]], b: T_A[D], c: D) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C[F](a: T_A[T_A[Byte]], b: Char) extends T_B[(CC_A[(Boolean,Boolean)],Byte), F]
case class CC_D() extends T_B[T_A[CC_B[Boolean]], (CC_A[Boolean],(Char,Int))]

val v_a: T_B[(CC_A[(Boolean,Boolean)],Byte), T_B[T_A[CC_B[Boolean]], (CC_A[Boolean],(Char,Int))]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_C(CC_A(_, CC_B(_), _), _) => 1 
  case CC_C(CC_B(CC_A(_, _, _)), _) => 2 
  case CC_C(CC_B(CC_B(_)), _) => 3 
}
}