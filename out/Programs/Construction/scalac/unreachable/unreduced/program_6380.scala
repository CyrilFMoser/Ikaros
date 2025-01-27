package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]], b: Boolean, c: T_B[Byte]) extends T_A[T_A[T_B[Byte]]]
case class CC_B(a: Int) extends T_A[(CC_A,T_B[(Char,Boolean)])]
case class CC_C(a: T_A[CC_A]) extends T_A[CC_A]
case class CC_D[C](a: T_B[T_A[CC_A]], b: CC_A, c: T_B[C]) extends T_B[C]
case class CC_E[D](a: T_A[D], b: T_B[D]) extends T_B[D]
case class CC_F[E](a: CC_D[E], b: (CC_D[CC_C],T_B[CC_A]), c: CC_C) extends T_B[E]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _, _), CC_A(_, _, _), _) => 0 
  case CC_D(CC_E(_, CC_D(_, _, _)), CC_A(_, _, _), _) => 1 
  case CC_D(CC_E(_, CC_E(_, _)), CC_A(_, _, _), _) => 2 
  case CC_D(CC_E(_, CC_F(_, _, _)), CC_A(_, _, _), _) => 3 
  case CC_D(CC_F(_, _, _), CC_A(_, _, _), _) => 4 
  case CC_E(_, _) => 5 
  case CC_F(CC_D(_, _, _), (CC_D(_, _, _),CC_D(_, _, _)), CC_C(CC_C(_))) => 6 
  case CC_F(CC_D(_, _, _), (CC_D(_, _, _),CC_E(_, _)), CC_C(CC_C(_))) => 7 
  case CC_F(CC_D(_, _, _), (CC_D(_, _, _),CC_F(_, _, _)), CC_C(CC_C(_))) => 8 
}
}