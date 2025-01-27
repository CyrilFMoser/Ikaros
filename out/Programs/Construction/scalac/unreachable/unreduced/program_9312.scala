package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: Char, c: T_A) extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C(a: T_B[CC_A, Char], b: CC_A, c: CC_A) extends T_A
case class CC_D[C](a: C, b: (T_B[CC_A, (Int,Boolean)],CC_A)) extends T_B[Boolean, C]
case class CC_E[D, E](a: T_B[Boolean, D], b: CC_B) extends T_B[Boolean, D]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_D(_, (_,_)), _) => 1 
}
}
// This is not matched: CC_E(CC_E(_, CC_B(_)), _)