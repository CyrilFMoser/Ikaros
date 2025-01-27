package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char, b: D) extends T_A[D, T_A[T_A[Char, Boolean], T_A[Char, Boolean]]]
case class CC_B[E](a: Byte, b: CC_A[E]) extends T_A[E, T_A[T_A[Char, Boolean], T_A[Char, Boolean]]]
case class CC_C[F](a: (T_B[Int],(Int,Char))) extends T_B[F]
case class CC_D(a: T_A[T_A[Boolean, Int], T_B[Char]], b: CC_C[T_B[Boolean]]) extends T_B[Boolean]

val v_a: T_A[T_B[Boolean], T_A[T_A[Char, Boolean], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C((_,_))) => 0 
  case CC_A(_, CC_D(_, CC_C(_))) => 1 
  case CC_B(_, _) => 2 
}
}