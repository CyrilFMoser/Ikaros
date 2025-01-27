package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[(T_A[T_B, (Int,Boolean)],T_B), C]
case class CC_B[D](a: D, b: D) extends T_A[(T_A[T_B, (Int,Boolean)],T_B), D]
case class CC_C(a: Char, b: Char) extends T_B
case class CC_D(a: (T_A[Char, T_B],(Boolean,T_B)), b: CC_B[T_A[T_B, Byte]]) extends T_B

val v_a: CC_B[T_B] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_, _), CC_C(_, _)) => 0 
  case CC_B(CC_D(_, CC_B(_, _)), CC_C(_, _)) => 1 
  case CC_B(CC_C(_, _), CC_D(_, CC_B(_, _))) => 2 
  case CC_B(CC_D(_, CC_B(_, _)), CC_D(_, CC_B(_, _))) => 3 
}
}