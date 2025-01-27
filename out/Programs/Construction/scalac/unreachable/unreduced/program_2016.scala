package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[(Char,Boolean), T_A[Byte]]]
case class CC_B[D, E]() extends T_B[D, E]
case class CC_C[F]() extends T_B[F, Boolean]
case class CC_D(a: Int, b: T_B[T_B[Byte, CC_A], T_B[CC_A, Boolean]], c: (CC_B[CC_A, Char],T_A[Byte])) extends T_B[T_B[T_B[CC_A, Boolean], Boolean], Boolean]

val v_a: T_B[T_B[T_B[CC_A, Boolean], Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_D(_, CC_B(), (CC_B(),_)) => 2 
}
}