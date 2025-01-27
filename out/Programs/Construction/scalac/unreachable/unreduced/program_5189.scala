package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Boolean) extends T_A
case class CC_B(a: (T_B[T_A],T_A), b: T_B[CC_A], c: T_A) extends T_A
case class CC_C(a: CC_A, b: CC_B) extends T_B[Char]
case class CC_D[B](a: CC_B, b: CC_C) extends T_B[Char]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _, CC_B(_, _, _)), _) => 1 
}
}
// This is not matched: CC_A(CC_B(_, _, CC_A(_, _)), _)