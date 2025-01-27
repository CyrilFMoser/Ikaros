package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[T_B[T_A[Boolean, D]], D]
case class CC_B[E](a: T_B[E], b: T_A[E, E], c: E) extends T_A[T_B[T_A[Boolean, E]], E]
case class CC_C[G, F](a: CC_B[F]) extends T_A[F, G]
case class CC_D() extends T_B[CC_C[CC_A[(Byte,Byte)], T_A[Boolean, Byte]]]
case class CC_E(a: CC_C[CC_C[Boolean, (Int,Char)], CC_B[CC_D]], b: CC_C[T_A[CC_D, CC_D], CC_C[CC_D, CC_D]], c: (Boolean,Boolean)) extends T_B[CC_C[CC_A[(Byte,Byte)], T_A[Boolean, Byte]]]
case class CC_F(a: T_A[CC_D, T_A[Char, CC_E]]) extends T_B[CC_C[CC_A[(Byte,Byte)], T_A[Boolean, Byte]]]

val v_a: T_B[CC_C[CC_A[(Byte,Byte)], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_C(_), CC_C(CC_B(_, _, _)), (_,_)) => 1 
  case CC_F(CC_C(CC_B(_, _, _))) => 2 
}
}