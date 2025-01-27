package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: ((Int,(Boolean,Boolean)),T_A), b: T_B[Int, T_A]) extends T_A
case class CC_B[C]() extends T_A
case class CC_C[D](a: CC_B[D], b: Char, c: D) extends T_B[T_B[T_B[CC_A, T_A], CC_A], D]
case class CC_D[E, F](a: T_B[E, CC_B[E]], b: (CC_B[(Int,Boolean)],T_B[T_A, CC_A]), c: CC_B[F]) extends T_B[E, CC_B[E]]
case class CC_E[G](a: Byte) extends T_B[T_B[T_B[CC_A, T_A], CC_A], CC_C[CC_C[T_A]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
}
}