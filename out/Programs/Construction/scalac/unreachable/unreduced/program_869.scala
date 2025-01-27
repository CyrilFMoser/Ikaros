package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Char, Byte], Int]) extends T_A
case class CC_B(a: T_B[Int, T_B[T_A, T_A]], b: Byte) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C](a: CC_B) extends T_B[C, (Boolean,Int)]
case class CC_E[D]() extends T_B[D, (Boolean,Int)]
case class CC_F[E]() extends T_B[E, (Boolean,Int)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_)