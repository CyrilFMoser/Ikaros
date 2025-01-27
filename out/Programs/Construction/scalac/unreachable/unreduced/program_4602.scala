package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_A[Boolean],T_A[Char]), b: (Byte,T_B[Char, Byte]), c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: Boolean) extends T_B[E, T_A[CC_A[Byte]]]
case class CC_C[F](a: T_A[F], b: T_A[F], c: F) extends T_B[F, T_A[CC_A[Byte]]]
case class CC_D(a: T_A[(Byte,(Boolean,Char))]) extends T_B[CC_C[CC_A[Int]], T_A[CC_A[Byte]]]

val v_a: T_B[CC_C[CC_A[Int]], T_A[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_A(_, _, _), _) => 1 
  case CC_D(CC_A((_,_), _, _)) => 2 
}
}