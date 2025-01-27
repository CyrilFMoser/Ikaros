package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B[F](a: T_A[F, T_A[F, Byte]], b: F, c: Boolean) extends T_A[CC_A[(Char,Char), Int], F]
case class CC_C(a: (T_A[Char, Char],T_B[Int])) extends T_B[(T_B[Boolean],(Int,Boolean))]
case class CC_D() extends T_B[(T_B[Boolean],(Int,Boolean))]

val v_a: T_B[(T_B[Boolean],(Int,Boolean))] = null
val v_b: Int = v_a match{
  case CC_C((CC_A(),_)) => 0 
  case CC_D() => 1 
}
}