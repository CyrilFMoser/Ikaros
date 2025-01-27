package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Boolean) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: T_A[CC_A[Byte]], b: T_B[T_A[Byte]]) extends T_B[(CC_A[Char],T_B[Int])]
case class CC_D(a: T_A[T_A[Char]], b: Char, c: (CC_A[CC_C],T_A[CC_C])) extends T_B[(CC_A[Char],T_B[Int])]
case class CC_E(a: T_A[CC_C]) extends T_B[(CC_A[Char],T_B[Int])]

val v_a: T_B[(CC_A[Char],T_B[Int])] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(_), _, (CC_A(_),CC_A(_))) => 1 
  case CC_D(CC_A(_), _, (CC_A(_),CC_B())) => 2 
  case CC_D(CC_B(), _, (CC_A(_),CC_A(_))) => 3 
  case CC_D(CC_B(), _, (CC_A(_),CC_B())) => 4 
  case CC_E(CC_A(true)) => 5 
  case CC_E(CC_A(false)) => 6 
  case CC_E(CC_B()) => 7 
}
}