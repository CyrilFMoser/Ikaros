package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Int,T_A), b: T_A, c: T_B[T_B[(Boolean,Byte), Int], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: CC_A, b: T_B[T_A, Int], c: T_A) extends T_A
case class CC_C[C](a: CC_B) extends T_B[Char, C]
case class CC_D[D](a: T_B[D, D], b: Char) extends T_B[Char, D]
case class CC_E[E](a: T_B[Char, E]) extends T_B[Char, E]

val v_a: T_B[Char, T_A] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _) => 1 
  case CC_E(CC_C(CC_B(_, _, _))) => 2 
  case CC_E(CC_D(_, _)) => 3 
  case CC_E(CC_E(CC_C(_))) => 4 
  case CC_E(CC_E(CC_D(_, _))) => 5 
}
}
// This is not matched: CC_E(CC_E(CC_E(_)))