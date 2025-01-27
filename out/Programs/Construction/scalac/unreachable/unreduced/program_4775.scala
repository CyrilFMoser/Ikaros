package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[((Byte,Char),(Boolean,Boolean)), D]) extends T_A[D, T_A[T_A[Byte, Boolean], T_A[Char, Boolean]]]
case class CC_B[E](a: E, b: Boolean, c: T_B[E]) extends T_A[T_B[E], E]
case class CC_C(a: T_A[T_B[Char], T_A[Boolean, Boolean]], b: Byte) extends T_A[CC_A[T_A[Byte, Char]], T_A[T_A[Byte, Boolean], T_A[Char, Boolean]]]
case class CC_D[F](a: (T_B[Char],T_B[CC_C])) extends T_B[F]
case class CC_E(a: T_A[CC_A[Char], CC_D[CC_C]], b: (CC_B[CC_C],Int), c: T_B[CC_B[Byte]]) extends T_B[T_A[T_B[Boolean], Boolean]]
case class CC_F[G](a: T_A[T_B[CC_E], CC_E], b: G, c: T_A[G, G]) extends T_B[G]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_D((_,_))) => 0 
  case CC_B(_, _, CC_F(CC_B(_, _, _), _, _)) => 1 
}
}