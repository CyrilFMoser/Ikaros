package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B(a: (Char,T_B[Char, Byte]), b: Byte) extends T_A[(CC_A[Boolean],(Char,(Boolean,Int)))]
case class CC_C(a: (T_A[CC_B],T_A[CC_B]), b: Char) extends T_A[(CC_A[Boolean],(Char,(Boolean,Int)))]
case class CC_D[E](a: CC_B, b: T_A[E], c: CC_C) extends T_B[Int, E]
case class CC_E[F]() extends T_B[Int, F]
case class CC_F[G]() extends T_B[Int, G]

val v_a: T_A[(CC_A[Boolean],(Char,(Boolean,Int)))] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),(_,_))) => 0 
  case CC_B((_,_), _) => 1 
  case CC_C((CC_A(_),CC_A(_)), 'x') => 2 
}
}
// This is not matched: CC_C((CC_A(_),CC_A(_)), _)