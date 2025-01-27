package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_B[Boolean],(Int,Int)), b: D) extends T_A[D, T_A[T_B[Boolean], Int]]
case class CC_B[E](a: T_A[T_B[E], E], b: CC_A[E]) extends T_A[T_B[E], E]
case class CC_C(a: Int, b: Byte) extends T_A[CC_A[CC_A[Int]], T_A[T_B[Boolean], Int]]
case class CC_D[F](a: (CC_A[Char],CC_B[Char]), b: T_B[F]) extends T_B[F]
case class CC_E[G](a: T_B[G], b: T_A[T_B[G], G], c: Int) extends T_B[G]

val v_a: T_A[T_B[T_A[T_B[Boolean], Int]], T_A[T_B[Boolean], Int]] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_, _),(_,_)), CC_D((_,_), CC_D(_, _))) => 0 
  case CC_A((CC_D(_, _),(_,_)), CC_D((_,_), CC_E(_, _, _))) => 1 
  case CC_A((CC_D(_, _),(_,_)), CC_E(_, _, _)) => 2 
  case CC_A((CC_E(_, _, _),(_,_)), CC_D((_,_), CC_D(_, _))) => 3 
  case CC_A((CC_E(_, _, _),(_,_)), CC_D((_,_), CC_E(_, _, _))) => 4 
  case CC_A((CC_E(_, _, _),(_,_)), CC_E(_, _, _)) => 5 
  case CC_B(CC_A((_,_), CC_D(_, _)), _) => 6 
  case CC_B(CC_A((_,_), CC_E(_, _, _)), _) => 7 
  case CC_B(CC_B(_, CC_A(_, _)), _) => 8 
}
}