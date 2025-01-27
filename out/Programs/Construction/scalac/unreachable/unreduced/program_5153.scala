package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_A[Byte, Int],Char), b: D) extends T_A[T_A[T_B[Int], Boolean], D]
case class CC_B[E]() extends T_A[T_A[T_B[Int], Boolean], E]
case class CC_C[F](a: CC_A[CC_B[F]], b: T_A[F, F]) extends T_A[T_A[T_B[Int], Boolean], F]
case class CC_D[G](a: (CC_B[Int],CC_B[Byte])) extends T_B[CC_A[Byte]]
case class CC_E() extends T_B[CC_A[Byte]]
case class CC_F() extends T_B[CC_A[Byte]]

val v_a: T_A[T_A[T_B[Int], Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,'x'), 12) => 0 
  case CC_A((_,_), 12) => 1 
  case CC_A((_,'x'), _) => 2 
  case CC_A((_,_), _) => 3 
  case CC_B() => 4 
  case CC_C(CC_A(_, CC_B()), _) => 5 
}
}