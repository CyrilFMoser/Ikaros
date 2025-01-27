package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[Char], b: T_B[D, D], c: (Byte,Boolean)) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: (T_A[Boolean],T_B[Boolean, Int]), b: T_B[F, F], c: F) extends T_A[F]
case class CC_D[G]() extends T_B[G, CC_A[CC_A[Char]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_A(_, _, _),_), _, _) => 1 
  case CC_C((CC_B(),_), _, _) => 2 
  case CC_C((CC_C(_, _, _),_), _, _) => 3 
}
}
// This is not matched: CC_A(_, _, _)