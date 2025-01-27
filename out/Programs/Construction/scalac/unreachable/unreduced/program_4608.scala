package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_B[Byte, Int]], b: T_A[T_A[Int]], c: T_A[T_B[Char, (Int,Boolean)]]) extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_B() extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_C[E, D](a: (CC_A,T_B[CC_A, Boolean])) extends T_B[E, D]
case class CC_D[G, F](a: T_A[T_B[G, F]], b: CC_B) extends T_B[F, G]

val v_a: T_A[(T_A[Boolean],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(CC_C((_,_)), _, _) => 0 
  case CC_A(CC_D(_, _), _, _) => 1 
  case CC_B() => 2 
}
}