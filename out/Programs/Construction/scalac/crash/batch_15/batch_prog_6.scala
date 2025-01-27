package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, Char], c: T_A) extends T_A
case class CC_B(a: T_A, b: T_A, c: (Char,Int)) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C, D]() extends T_B[D, C]
case class CC_E[E, F](a: T_A, b: T_B[F, F], c: CC_D[F, F]) extends T_B[E, F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, (_,12)) => 1 
  case CC_B(_, _, (_,_)) => 2 
}
}
// This is not matched: CC_C(_)