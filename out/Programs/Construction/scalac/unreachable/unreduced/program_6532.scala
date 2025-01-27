package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D], c: (T_A[Byte],(Char,Int))) extends T_A[D]
case class CC_B[E](a: (T_A[Byte],T_A[Int]), b: Boolean) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_B[F, F]) extends T_A[F]
case class CC_D(a: T_A[T_A[Byte]], b: (T_A[Char],T_A[Boolean])) extends T_B[CC_B[T_B[Byte, (Char,Char)]], T_A[T_B[(Boolean,Boolean), Int]]]
case class CC_E[G](a: Char, b: G) extends T_B[CC_A[Boolean], G]
case class CC_F(a: Boolean) extends T_B[CC_A[Boolean], CC_D]

val v_a: T_B[CC_B[T_B[Byte, (Char,Char)]], T_A[T_B[(Boolean,Boolean), Int]]] = null
val v_b: Int = v_a match{
  case CC_D(_, (CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_D(_, (CC_A(_, _, _),CC_B(_, _))) => 1 
  case CC_D(_, (CC_A(_, _, _),CC_C(_, _))) => 2 
  case CC_D(_, (CC_B(_, _),CC_A(_, _, _))) => 3 
  case CC_D(_, (CC_B(_, _),CC_B(_, _))) => 4 
  case CC_D(_, (CC_B(_, _),CC_C(_, _))) => 5 
  case CC_D(_, (CC_C(_, _),CC_A(_, _, _))) => 6 
  case CC_D(_, (CC_C(_, _),CC_B(_, _))) => 7 
  case CC_D(_, (CC_C(_, _),CC_C(_, _))) => 8 
}
}