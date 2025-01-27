package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Char,(Boolean,Int))]) extends T_A[(T_A[Char],T_B[Boolean])]
case class CC_B[C](a: C) extends T_B[C]
case class CC_C[D](a: T_B[D], b: T_A[D]) extends T_B[D]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(true) => 0 
  case CC_B(false) => 1 
  case CC_C(_, _) => 2 
}
}