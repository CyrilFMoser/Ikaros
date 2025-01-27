package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: D) extends T_A[D]
case class CC_C[E](a: T_A[E]) extends T_A[E]
case class CC_D() extends T_B[(CC_B[Int],T_B[Boolean])]
case class CC_E(a: (T_A[Char],CC_C[CC_D]), b: CC_D, c: Int) extends T_B[(CC_B[Int],T_B[Boolean])]
case class CC_F() extends T_B[(CC_B[Int],T_B[Boolean])]

val v_a: CC_B[CC_D] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _) => 0 
  case CC_B(CC_B(CC_A(_), CC_D()), _) => 1 
  case CC_B(CC_B(CC_B(_, _), CC_D()), _) => 2 
  case CC_B(CC_C(CC_A(_)), _) => 3 
  case CC_B(CC_C(CC_B(_, _)), _) => 4 
  case CC_B(CC_C(CC_C(_)), _) => 5 
}
}
// This is not matched: CC_B(CC_B(CC_C(_), CC_D()), _)